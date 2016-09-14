package br.gov.dataprev.eva.server.dao;

public class MotivoDAO extends BaseDAO {

	public MotivoDAO() {
		super();
	}

//	public List<MotivoTO> obterMotivosServico(String servicoParam) {
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//		AlertaTO retVal = null;
//		try {
//			stmt = obterConexao().createStatement();
//			rs = stmt.executeQuery("SELECT idMotivo, descricao, idServico FROM Motivo a where a.idServico='" + servicoParam +"'");
//			while (rs.next()) {
//				int idAlerta = rs.getInt("idAlerta");
//				String descricao = rs.getString("descricao");
//				int idServico = rs.getInt("idServico");
//				int nivel = rs.getInt("nivel");
//				
//				retVal = new AlertaTO();
//				retVal.setIdAlerta(idAlerta);
//				retVal.setDescricao(descricao);
//				retVal.setIdServico(idServico);
//				retVal.setNivel(nivel);
//				break;
//			}
//		} catch (SQLException se) {
//			se.printStackTrace();
//		} catch (Exception e) {
//			// Handle errors for Class.forName
//			e.printStackTrace();
//		} finally {
//			close(conn, stmt, rs); // end finally try
//
//		}
//
//		return retVal;
//
//	}
	
}
