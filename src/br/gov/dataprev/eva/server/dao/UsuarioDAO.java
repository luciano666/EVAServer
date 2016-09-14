package br.gov.dataprev.eva.server.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.gov.dataprev.eva.server.to.HistoricoTO;
import br.gov.dataprev.eva.server.to.UsuarioTO;

public class UsuarioDAO extends BaseDAO{

	public UsuarioDAO() {
		super();
	}

	public UsuarioTO obterUsuario(String email) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		UsuarioTO retVal = null;
		try {
			stmt = obterConexao().createStatement();
			rs = stmt.executeQuery("SELECT idUsuario, nome FROM Usuario u where u.email='" + email+"'");
			while (rs.next()) {
				int id = rs.getInt("idUsuario");
				String nome = rs.getString("nome");

				retVal = new UsuarioTO();
				retVal.setEmail(email);
				retVal.setId(id);
				retVal.setNome(nome);
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

	public List<HistoricoTO> obterHistorico(String email) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<HistoricoTO> retVal = null;
		try {
			stmt = obterConexao().createStatement();
			rs = stmt.executeQuery("SELECT idUsuario, nome FROM Usuario u where u.email='" + email+"'");
			retVal = new ArrayList<HistoricoTO>();
			while (rs.next()) {
				int id = rs.getInt("idUsuario");
				String mensagem = rs.getString("mensagens");

				HistoricoTO hist = new HistoricoTO();
				hist.setId(id);
				hist.setMensagem(mensagem);

				UsuarioTO user = new UsuarioTO();
				user.setEmail(email);

				hist.setUsuario(user);
				retVal.add(hist);
				break;
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, rs); // end finally try
		}

		return retVal;
	}
}
