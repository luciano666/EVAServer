package br.gov.dataprev.eva.server.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AlertaTO")
public class AlertaTO {

	private int idAlerta;
	private String descricao;
	private int idServico;
	private int idMotivo;
	private int nivel;
	
	public int getIdAlerta() {
		return idAlerta;
	}
	
	public void setIdAlerta(int idAlerta) {
		this.idAlerta = idAlerta;
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
	
	public int getIdMotivo() {
		return idMotivo;
	}
	
	public void setIdMotivo(int idMotivo) {
		this.idMotivo = idMotivo;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
}
