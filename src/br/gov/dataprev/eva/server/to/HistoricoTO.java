package br.gov.dataprev.eva.server.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HistoricoTO")
public class HistoricoTO {

	private int id;
	private UsuarioTO usuario;
	private String mensagem;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UsuarioTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioTO usuario) {
		this.usuario = usuario;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
