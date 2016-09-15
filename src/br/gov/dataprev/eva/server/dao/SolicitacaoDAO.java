package br.gov.dataprev.eva.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.gov.dataprev.eva.server.to.MensagemTO;
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
			String sql = "INSERT INTO Solicitacao(Servico_idServico, Servico_Motivo_idMotivo, Usuario_idUsuario, dataHoraInicio) VALUES(?,?,?,?)";
			connection = obterConexao();
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, solicitacaoTO.getServico().getIdServico());
			preparedStatement.setInt(2, solicitacaoTO.getMotivo().getIdMotivo());
			preparedStatement.setInt(3, solicitacaoTO.getUsuario().getId());
			preparedStatement.setTimestamp(4, getCurrentTimeStamp());
			preparedStatement.executeUpdate();

			stmt = connection.createStatement();
			rs = stmt.executeQuery("SELECT ticketID FROM Solicitacao s where s.Usuario_idUsuario='"
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
			String sql = "UPDATE SOLICITACAO s set s.dataHoraFim = ? WHERE s.ticketID = ?";
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

	public List<MensagemTO> obterMensagensSolicitacoes(String email) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<MensagemTO> retVal = null;
		try {
			stmt = obterConexao().createStatement();
			rs = stmt.executeQuery(
					"SELECT * from Mensagem m, Solicitacao s, Usuario u where m.Solicitacao_ticketID = ticketID and s.Usuario_idUsuario = u.idUsuario and u.email= '"
							+ email + "'");

			retVal = new ArrayList<>();

			while (rs.next()) {
				int id = rs.getInt("idMensagem");
				String descricao = rs.getString("descricao");
				String remetente = rs.getString("remetente");
				int idSolicitacao = rs.getInt("Solicitacao_ticketID");
				Date data = new Date(rs.getTimestamp("dataHora").getTime());

				MensagemTO mensagem = new MensagemTO();
				mensagem.setIdMensagem(id);
				mensagem.setDescricao(descricao);
				mensagem.setRemetente(remetente);
				mensagem.setDataHora(data);

				SolicitacaoTO solicitacaoTO = new SolicitacaoTO();
				solicitacaoTO.setTicket(idSolicitacao);
				mensagem.setSolicitacao(solicitacaoTO);

				retVal.add(mensagem);
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
