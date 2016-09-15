package br.gov.dataprev.eva.server.to;

import java.util.Date;

public class SolicitacaoTO {

	private int ticket;
	
	private ServicoTO servico;
	
	private MotivoTO motivo;
	
	private UsuarioTO usuario;
	
	private Date dataInicio;
	
	private Date dataFim;

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public ServicoTO getServico() {
		return servico;
	}

	public void setServico(ServicoTO servico) {
		this.servico = servico;
	}

	public UsuarioTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioTO usuario) {
		this.usuario = usuario;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public MotivoTO getMotivo() {
		return motivo;
	}

	public void setMotivo(MotivoTO motivo) {
		this.motivo = motivo;
	}
	
}
