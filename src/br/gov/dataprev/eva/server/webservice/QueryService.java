package br.gov.dataprev.eva.server.webservice;

public interface QueryService {

	String processarConsulta(String servico, String email, int ticket, String consulta);

}
