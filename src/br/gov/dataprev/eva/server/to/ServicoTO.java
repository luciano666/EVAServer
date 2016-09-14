package br.gov.dataprev.eva.server.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ServicoTO")
public class ServicoTO {

	private int idServico;
	private String nome;
	private int idCliente;
	
	public int getIdServico() {
		return idServico;
	}
	
	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
}
