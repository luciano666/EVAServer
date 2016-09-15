package br.gov.dataprev.eva.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.gov.dataprev.eva.server.to.SolicitacaoTO;

public class SolicitacaoDAO extends BaseDAO {

	public SolicitacaoDAO() {
		super();
	}

	public SolicitacaoTO incluir(SolicitacaoTO solicitacaoTO) {
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		try {
			String sql = "INSERT INTO SOLICITACAO (idServico, idMotivo, idUsuario, dataHoraInicio) VALUES(?,?,?,?)";
			connection = obterConexao();
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, solicitacaoTO.getServico().getIdServico());
			preparedStatement.setInt(2, solicitacaoTO.getMotivo().getIdMotivo());
			preparedStatement.setInt(3, solicitacaoTO.getUsuario().getId());
			preparedStatement.setTimestamp(4, getCurrentTimeStamp());
			preparedStatement.executeUpdate();

			stmt = connection.createStatement();
			rs = stmt.executeQuery("SELECT idSolicitacao FROM Solicitacao s where s.idUsuario='"
					+ solicitacaoTO.getUsuario().getId() + "' order by s.dataHoraInicio DESC");
			rs.next();
			solicitacaoTO.setTicket(rs.getInt("idSolicitacao"));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(connection, stmt, rs, preparedStatement);
		}

		return solicitacaoTO;
	}

	public void fechar(SolicitacaoTO solicitacaoTO) {
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		try {
			String sql = "UPDATE SOLICITACAO s set s.dataHoraFim = ? WHERE s.ticket = ?";
			connection = obterConexao();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setTimestamp(1, getCurrentTimeStamp());
			preparedStatement.setInt(2, solicitacaoTO.getUsuario().getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(connection, stmt, rs, preparedStatement);
		}
	}

}
