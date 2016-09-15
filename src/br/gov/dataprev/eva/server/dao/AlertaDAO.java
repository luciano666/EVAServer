package br.gov.dataprev.eva.server.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.gov.dataprev.eva.server.to.AlertaTO;

public class AlertaDAO extends BaseDAO {

	public AlertaDAO() {
		super();
	}

	public AlertaTO verificarAlertaServico(int servicoParam) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		AlertaTO retVal = null;
		try {
			stmt = obterConexao().createStatement();
			rs = stmt.executeQuery("SELECT idAlerta, descricao, Servico_idServico, nivel FROM Alerta a where a.nivel = 0 and a.Servico_idServico='" + servicoParam +"'");
			while (rs.next()) {
				int idAlerta = rs.getInt("idAlerta");
				String descricao = rs.getString("descricao");
				int idServico = rs.getInt("Servico_idServico");
				int nivel = rs.getInt("nivel");
				
				retVal = new AlertaTO();
				retVal.setIdAlerta(idAlerta);
				retVal.setDescricao(descricao);
				retVal.setIdServico(idServico);
				retVal.setNivel(nivel);
				break;
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			close(conn, stmt, rs); // end finally try

		}

		return retVal;

	}
	
}
