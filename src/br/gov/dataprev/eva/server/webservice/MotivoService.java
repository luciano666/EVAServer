package br.gov.dataprev.eva.server.webservice;

import java.util.List;

import br.gov.dataprev.eva.server.to.MotivoTO;

public interface MotivoService {

	List<MotivoTO> obterMotivosServico(int idServico);

}