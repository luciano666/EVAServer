package br.gov.dataprev.eva.server.webservice;

import java.util.List;

import br.gov.dataprev.eva.server.to.HistoricoTO;
import br.gov.dataprev.eva.server.to.UsuarioTO;

public interface UsuarioService {

	UsuarioTO obterUsuario(String email);

	List<HistoricoTO> obterHistorico(String email);

}