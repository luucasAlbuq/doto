package br.com.restful.model;

public class Avaliacao {
	
	private String crm;
	private String idUsuario;
	private boolean avaliacao;
	
	public Avaliacao(String crm, String idUsuario, boolean avaliacao) {
		this.crm = crm;
		this.idUsuario = idUsuario;
		this.avaliacao = avaliacao;
	}

	public String getCrm() {
		return crm;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public boolean isAvaliacao() {
		return avaliacao;
	}

}
