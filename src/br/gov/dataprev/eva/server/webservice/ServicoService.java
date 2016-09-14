package br.gov.dataprev.eva.server.webservice;

import java.util.List;

import br.gov.dataprev.eva.server.to.ServicoTO;

public interface ServicoService {

	List<ServicoTO> obterServicos();

}