package br.gov.dataprev.eva.server.webservice.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.gov.dataprev.eva.server.dao.AlertaDAO;
import br.gov.dataprev.eva.server.dao.MensagemDAO;
import br.gov.dataprev.eva.server.dao.MotivoDAO;
import br.gov.dataprev.eva.server.dao.ServicoDAO;
import br.gov.dataprev.eva.server.entity.TipoRetorno;
import br.gov.dataprev.eva.server.to.AlertaTO;
import br.gov.dataprev.eva.server.to.MensagemTO;
import br.gov.dataprev.eva.server.to.MotivoTO;
import br.gov.dataprev.eva.server.to.ServicoTO;
import br.gov.dataprev.eva.server.to.SolicitacaoTO;
import br.gov.dataprev.eva.server.util.PrologAdapter;
import br.gov.dataprev.eva.server.webservice.QueryService;

public class QueryServiceImpl implements QueryService {

	private static AlertaDAO alertaDAO = new AlertaDAO();

	private static MensagemDAO mensagemDAO = new MensagemDAO();

	private static ServicoDAO servicoDAO = new ServicoDAO();
	
	private static MotivoDAO motivoDAO = new MotivoDAO();

	@GET
	@Produces("application/json")
	@Path(value = "/processarConsulta/{servico}/{email}/{ticket}/{consulta}")
	public String processarConsulta(@PathParam("servico") String servico, @PathParam("email") String email,
			@PathParam("ticket") int ticket, @PathParam("consulta") String consulta) {

		String retVal = "";
		try {

			TipoRetorno tipo = PrologAdapter.getInstance().executarAvaliacao(servico, consulta);

			if (tipo == TipoRetorno.CONSULTA) {
				URL url = new URL("http", "10.21.23.211", 8983,
						"/solr/gettingstarted/select?indent=on&wt=json&q=" + consulta);
				// System.out.println(url.getContent());

				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Accept", "application/json");

				if (conn.getResponseCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
				}

				BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

				String output;
				System.out.println("Output from Server .... \n");
				while ((output = br.readLine()) != null) {
					output = output.replace("\"", "").trim();
					String chave = output.split(":")[0];
					if (chave.contains("title")) {

						retVal = output.substring(chave.length() + 2, output.length() - 2);
						break;
					}
				}

				conn.disconnect();
			} else if (tipo == TipoRetorno.ALERTA) {
				ServicoTO servicoTO = servicoDAO.obterServicoPeloNome(servico);
				if (servicoTO != null) {
					AlertaTO alerta = alertaDAO.verificarAlertaServico(servicoTO.getIdServico());
					if (alerta == null) {
						retVal = "Não encontrei em meus registros nenhum alerta. Você selecionou o serviço "+servico+", qual o motivo deste atendimento?";
						List<MotivoTO> motivos = motivoDAO.obterMotivosServico(servicoTO.getIdServico());
						for (MotivoTO motivo : motivos) {
							retVal+=motivo.getDescricao()+", ";
						}
						retVal = retVal.trim().substring(0,retVal.length()-2);
					} else {
						retVal = alerta.getDescricao();
					}
				} else {
					retVal = "Não encontrei em meus registros o serviço citado ("+servico+")";
				}

			}
			mensagemDAO.incluir(buildMensagem(consulta, email, tipo, ticket));
			mensagemDAO.incluir(buildMensagem(retVal, "EVA", tipo, ticket));

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return retVal;
	}

	private MensagemTO buildMensagem(String consulta, String email, TipoRetorno tipo, int ticket) {

		MensagemTO mensagemTO = new MensagemTO();
		mensagemTO.setDescricao(consulta);
		mensagemTO.setRemetente(email);
		mensagemTO.setTipo(tipo);
		SolicitacaoTO solicitacaoTO = new SolicitacaoTO();
		solicitacaoTO.setTicket(ticket);
		mensagemTO.setSolicitacao(solicitacaoTO);
		return mensagemTO;
	}

}
