package br.gov.dataprev.eva.server.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AvaliacaoTO")
public class AvaliacaoTO {

	private int idAvaliacao;
	private int ticketSolicitacao;
	private int nota;
	
	public int getIdAvaliacao() {
		return idAvaliacao;
	}
	
	public void setIdAvaliacao(int idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}
	
	public int getTicketSolicitacao() {
		return ticketSolicitacao;
	}
	
	public void setTicketSolicitacao(int ticketSolicitacao) {
		this.ticketSolicitacao = ticketSolicitacao;
	}
	
	public int getNota() {
		return nota;
	}
	
	public void setNota(int nota) {
		this.nota = nota;
	}
	
}
