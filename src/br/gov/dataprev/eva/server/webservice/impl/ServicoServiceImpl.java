package br.gov.dataprev.eva.server.webservice.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.gov.dataprev.eva.server.dao.ServicoDAO;
import br.gov.dataprev.eva.server.to.ServicoTO;
import br.gov.dataprev.eva.server.webservice.ServicoService;

public class ServicoServiceImpl implements ServicoService {

	private ServicoDAO dao = new ServicoDAO();

	@GET
	@Path(value = "/obterServicos")
	@Produces({ "application/json" })
	public List<ServicoTO> obterServicos() {
		return dao.obterServicos();
	}
	
}
