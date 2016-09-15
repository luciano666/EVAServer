package br.gov.dataprev.eva.server.webservice.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.gov.dataprev.eva.server.dao.AvaliacaoDAO;
import br.gov.dataprev.eva.server.webservice.AvaliacaoService;

public class AvaliacaoServiceImpl implements AvaliacaoService {

	private AvaliacaoDAO daoAvaliacao = new AvaliacaoDAO();
	
	@GET
	@Path(value = "/avaliacao/{ticket}/{nota}")
	@Produces("application/json")
	public void incluir(@PathParam("ticket") int ticket, @PathParam("nota") int nota) {
		daoAvaliacao.incluir(ticket, nota);
	}
}
