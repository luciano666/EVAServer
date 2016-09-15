package br.gov.dataprev.eva.server.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.gov.dataprev.eva.server.to.MotivoTO;

public class MotivoDAO extends BaseDAO {

	public MotivoDAO() {
		super();
	}

	public List<MotivoTO> obterMotivosServico(String servicoParam) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<MotivoTO> retVal = null;
		try {
			stmt = obterConexao().createStatement();
			rs = stmt.executeQuery("SELECT idMotivo, descricao, Servico_idServico, Servico_Cliente_idCliente"
					+ " FROM Motivo m where m.Servico_idServico='" + servicoParam +"'");
			while (rs.next()) {
				int idMotivo = rs.getInt("idMotivo");
				String descricao = rs.getString("descricao");
				int idServico = rs.getInt("Servico_idServico");
				int idCliente = rs.getInt("Servico_Cliente_idCliente");
				
				retVal = new ArrayList<MotivoTO>();
				
				MotivoTO motivo = new MotivoTO();
				motivo.setIdMotivo(idMotivo);
				motivo.setDescricao(descricao);
				motivo.setIdServico(idServico);
				motivo.setIdCliente(idCliente);
				
				retVal.add(motivo);
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
