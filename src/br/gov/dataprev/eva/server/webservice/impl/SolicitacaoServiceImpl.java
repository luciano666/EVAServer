package br.gov.dataprev.eva.server.webservice.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.gov.dataprev.eva.server.dao.SolicitacaoDAO;
import br.gov.dataprev.eva.server.to.MotivoTO;
import br.gov.dataprev.eva.server.to.ServicoTO;
import br.gov.dataprev.eva.server.to.SolicitacaoTO;
import br.gov.dataprev.eva.server.webservice.SolicitacaoService;

public class SolicitacaoServiceImpl implements SolicitacaoService {

	private SolicitacaoDAO solicitacaoDAO = new SolicitacaoDAO();

	@Override
	@GET
	@Path(value = "/iniciar/{idServico}/{idMotivo}/{email}")
	@Produces({ "application/json" })
	public int iniciar(@PathParam("idServico") int idServico, @PathParam("idMotivo") int idMotivo,
			@PathParam("email") String email) {
		ServicoTO servicoTO = new ServicoTO();
		servicoTO.setIdServico(idServico);

		MotivoTO motivoTO = new MotivoTO();
		motivoTO.setIdMotivo(idMotivo);

		SolicitacaoTO solicitacaoTO = new SolicitacaoTO();
		solicitacaoTO.setServico(servicoTO);
		solicitacaoTO.setMotivo(motivoTO);

		return solicitacaoDAO.incluir(solicitacaoTO).getTicket();
	}
	
	@Override
	@GET
	@Path(value = "/fechar/{ticket}")
	@Produces({ "application/json" })
	public void fechar(@PathParam("ticket") int ticket) {
		SolicitacaoTO solicitacaoTO = new SolicitacaoTO();
		solicitacaoTO.setTicket(ticket);
		solicitacaoDAO.fechar(solicitacaoTO);
	}


}
