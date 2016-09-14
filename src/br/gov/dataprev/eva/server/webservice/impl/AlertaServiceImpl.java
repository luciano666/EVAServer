package br.gov.dataprev.eva.server.webservice.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.gov.dataprev.eva.server.dao.AlertaDAO;
import br.gov.dataprev.eva.server.to.AlertaTO;
import br.gov.dataprev.eva.server.webservice.AlertaService;

public class AlertaServiceImpl implements AlertaService {

	private AlertaDAO daoAlerta = new AlertaDAO();
	
	@GET
	@Path(value = "/alerta/{idServico}")
	@Produces("application/json")
	public AlertaTO verificarAlertaServico(@PathParam("idServico") String idServico) {
		return daoAlerta.verificarAlertaServico(idServico);
	}
}
