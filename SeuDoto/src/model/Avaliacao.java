package model;

public class Avaliacao {
	
	private String crm;
	private String idUsuario;
	private boolean avaliacao;
	private String comentario;
	
	public Avaliacao(String crm, String idUsuario, boolean avaliacao) {
		this.crm = crm;
		this.idUsuario = idUsuario;
		this.avaliacao = avaliacao;
	}
	
	public Avaliacao(String crm, String idUsuario, boolean avaliacao, String comentario) {
		this.crm = crm;
		this.idUsuario = idUsuario;
		this.avaliacao = avaliacao;
		this.comentario = comentario;
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

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	

}
