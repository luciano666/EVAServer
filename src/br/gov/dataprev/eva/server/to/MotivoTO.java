package br.gov.dataprev.eva.server.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MotivoTO")
public class MotivoTO {

	private int idMotivo;
	private String descricao;
	private int idServico;
	private int idCliente;
	private int idResposta;
	
	public int getIdMotivo() {
		return idMotivo;
	}
	
	public void setIdMotivo(int idMotivo) {
		this.idMotivo = idMotivo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getIdServico() {
		return idServico;
	}
	
	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public int getIdResposta() {
		return idResposta;
	}
	
	public void setIdResposta(int idResposta) {
		this.idResposta = idResposta;
	}
	
}
