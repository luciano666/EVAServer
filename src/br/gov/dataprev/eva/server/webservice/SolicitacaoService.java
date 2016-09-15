package br.gov.dataprev.eva.server.webservice;

public interface SolicitacaoService {

	int iniciar(int idServico, int idMotivo, String email);
	
	void fechar(int ticket);
	
}
