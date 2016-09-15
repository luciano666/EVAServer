package br.gov.dataprev.eva.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.gov.dataprev.eva.server.to.MensagemTO;

public class MensagemDAO extends BaseDAO {

	public void incluir(MensagemTO mensagemTO) {
		ResultSet rs = null;
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		try {
			String sql = "INSERT INTO MENSAGEM (descricao, dataHora, remetente, ticket, tipo) VALUES(?,?,?,?,?)";
			connection = obterConexao();
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, mensagemTO.getDescricao());
			preparedStatement.setTimestamp(2, getCurrentTimeStamp());
			preparedStatement.setString(3, mensagemTO.getRemetente());
			preparedStatement.setInt(4, mensagemTO.getSolicitacao().getTicket());
			preparedStatement.setString(5, mensagemTO.getTipo().toString());
			
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(connection, null, rs, preparedStatement);
		}

	}

}
