package br.gov.dataprev.eva.server.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ClienteTO")																																																																																																																																																																																																																																																																																																																										
public class ClienteTO {
	
	private int idCliente;
	private String nome;

	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
