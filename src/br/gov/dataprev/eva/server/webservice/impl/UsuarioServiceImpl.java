package br.gov.dataprev.eva.server.webservice.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.gov.dataprev.eva.server.dao.UsuarioDAO;
import br.gov.dataprev.eva.server.to.HistoricoTO;
import br.gov.dataprev.eva.server.to.UsuarioTO;
import br.gov.dataprev.eva.server.webservice.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioDAO dao = new UsuarioDAO();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.gov.dataprev.eva.server.webservice.UsuarioService#obterUsuario(java.
	 * lang.String)
	 */
	@GET
	@Path(value = "/obterUsuario/{email}")
	@Produces({ "application/json" })
	public UsuarioTO obterUsuario(@PathParam("email") String email) {
		return dao.obterUsuario(email);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.gov.dataprev.eva.server.webservice.UsuarioService#obterHistorico(java.
	 * lang.String)
	 */
	@GET
	@Produces("application/json")
	@Path(value = "/obterHistorico/{email}")
	public List<HistoricoTO> obterHistorico(@PathParam("email") String email) {
		return dao.obterHistorico(email);
	}

}
