package br.gov.dataprev.eva.server.webservice;

import br.gov.dataprev.eva.server.to.AlertaTO;

public interface AlertaService {

	AlertaTO verificarAlertaServico(String servicoParam);
	
}
