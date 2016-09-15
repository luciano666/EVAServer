package br.gov.dataprev.eva.server.to;

import java.util.Date;

import br.gov.dataprev.eva.server.entity.TipoRetorno;

public class MensagemTO {

	private int idMensagem;

	private String descricao;

	private String remetente;

	private SolicitacaoTO solicitacao;

	private Date dataHora;
	
	private TipoRetorno tipo;

	public TipoRetorno getTipo() {
		return tipo;
	}

	public void setTipo(TipoRetorno tipo) {
		this.tipo = tipo;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public int getIdMensagem() {
		return idMensagem;
	}

	public void setIdMensagem(int idMensagem) {
		this.idMensagem = idMensagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public SolicitacaoTO getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(SolicitacaoTO solicitacao) {
		this.solicitacao = solicitacao;
	}
}
