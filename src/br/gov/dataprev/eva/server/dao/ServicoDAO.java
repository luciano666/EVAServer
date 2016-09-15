package br.gov.dataprev.eva.server.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.gov.dataprev.eva.server.to.ServicoTO;

public class ServicoDAO extends BaseDAO {

	public ServicoDAO() {
		super();
	}

	public ServicoTO obterServicoPeloNome(String servico) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ServicoTO retVal = null;
		try {
			stmt = obterConexao().createStatement();
			rs = stmt.executeQuery(
					"SELECT idServico, Cliente_idCliente FROM Servico u where u.nome = '" + servico + "'");
			rs.next();
			int id = rs.getInt("idServico");
			int idCliente = rs.getInt("Cliente_idCliente");

			retVal = new ServicoTO();
			retVal.setIdServico(id);
			retVal.setNome(servico);
			retVal.setIdCliente(idCliente);
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

	public List<ServicoTO> obterServicos() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<ServicoTO> retVal = null;
		try {
			stmt = obterConexao().createStatement();
			rs = stmt.executeQuery("SELECT idServico, nome, Cliente_idCliente FROM Servico u");

			retVal = new ArrayList<>();

			while (rs.next()) {
				int id = rs.getInt("idServico");
				String nome = rs.getString("nome");
				int idCliente = rs.getInt("Cliente_idCliente");

				ServicoTO servico = new ServicoTO();
				servico.setIdServico(id);
				servico.setNome(nome);
				servico.setIdCliente(idCliente);

				retVal.add(servico);
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
