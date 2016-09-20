package br.gov.dataprev.eva.server.util;

import br.gov.dataprev.eva.server.entity.TipoRetorno;
import jpl.Query;

public class PrologAdapter {

	private static PrologAdapter instance;

	private PrologAdapter() {
		String path = "consult('/home/luciano/eva.pl')";

		Query q = new Query(path);
		System.out.println(q.hasSolution());
	}

	public static PrologAdapter getInstance() {
		if (instance == null) {
			instance = new PrologAdapter();
		}
		return instance;
	}
	
	
	public TipoRetorno executarAvaliacao(String sistema,String consulta){
		Query query = new Query("alerta("+sistema.toLowerCase()+","+consulta.trim().replace(" ", "_")+" )");
		if (query.hasSolution()){
			return TipoRetorno.ALERTA;
		} else {
			return TipoRetorno.CONSULTA;
		}
	}

}
