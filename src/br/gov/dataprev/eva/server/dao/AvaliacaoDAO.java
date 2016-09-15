package br.gov.dataprev.eva.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AvaliacaoDAO extends BaseDAO {

	public AvaliacaoDAO() {
		super();
	}

	public void incluir(int ticketParam, int notaParam) {
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		try {
			String sql = "INSERT INTO Avaliacao (Solicitacao_ticketID, nota) VALUES(?,?)";
			connection = obterConexao();
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, ticketParam);
			preparedStatement.setInt(2, notaParam);
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(connection, stmt, rs, preparedStatement);
		}
	}
	
}
