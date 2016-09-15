package br.gov.dataprev.eva.server.webservice.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.gov.dataprev.eva.server.dao.MotivoDAO;
import br.gov.dataprev.eva.server.to.MotivoTO;
import br.gov.dataprev.eva.server.webservice.MotivoService;

public class MotivoServiceImpl implements MotivoService {

	private MotivoDAO dao = new MotivoDAO();

	@GET
	@Path(value = "/obterMotivosServico/{idServico}")
	@Produces({ "application/json" })
	public List<MotivoTO> obterMotivosServico(@PathParam("idServico") String idServico) {
		return dao.obterMotivosServico(idServico);
	}
	
}
