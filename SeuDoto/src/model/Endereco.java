package model;

import java.io.Serializable;

public class Endereco implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4227234234212322396L;
	private String rua;
	private String numero;
	private String bairro;
	private String sala;
	private String cidade;
	private String estado;
	
	public Endereco(String rua,String numero,String bairro, String sala, String cidade, String estado) {
		this.rua = rua;
		this.numero =numero;
		this.bairro=bairro;
		this.sala = sala;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	

	public String getRua() {
		return rua;
	}



	public void setRua(String rua) {
		this.rua = rua;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
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
	
	@Override
	public String toString(){
		return getRua()+", "+getNumero()+"\n"+getBairro()+"\n"+getCidade()+", "+getEstado();
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
		result = prime * result + ((sala == null) ? 0 : sala.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null){
				return false;
			}
		} else if (!bairro.equals(other.bairro)){
			return false;
			}
		if (cidade == null) {
			if (other.cidade != null){
				return false;
				}
		} else if (!cidade.equals(other.cidade)){
			return false;
			}
		if (estado == null) {
			if (other.estado != null){
				return false;
				}
		} else if (!estado.equals(other.estado)){
			return false;
			}
		if (numero == null) {
			if (other.numero != null){
				return false;
				}
		} else if (!numero.equals(other.numero)){
			return false;
			}
		if (rua == null) {
			if (other.rua != null){
				return false;
				}
		} else if (!rua.equals(other.rua)){
			return false;
			}
		if (sala == null) {
			if (other.sala != null){
				return false;
				}
		} else if (!sala.equals(other.sala)){
			return false;
			}
		return true;
	}

	

}
