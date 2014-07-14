package model;

public class Endereco {
	
	private String ruaNumeroBairro;
	private String sala;
	private String cidade;
	private String estado;
	
	public Endereco(String ruaNumeroBairro, String sala, String cidade, String estado) {
		this.ruaNumeroBairro = ruaNumeroBairro;
		this.sala = sala;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public String getRuaNumeroBairro() {
		return ruaNumeroBairro;
	}

	public void setRuaNumeroBairro(String ruaNumeroBairro) {
		this.ruaNumeroBairro = ruaNumeroBairro;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	

}
