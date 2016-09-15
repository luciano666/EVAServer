package br.gov.dataprev.eva.server.webservice;

import java.util.List;

import javax.ws.rs.PathParam;

import br.gov.dataprev.eva.server.to.MensagemTO;

public interface SolicitacaoService {

	int iniciar(int idServico, int idMotivo, String email);
	
	void fechar(int ticket);
	
	List<MensagemTO> obterHistorico(@PathParam("email") String email);
	
}
