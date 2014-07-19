package model;

import java.io.Serializable;
import java.util.ArrayList;

import util.Convenio;
import util.Especialidade;

public class ProfissionalSaude implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1586030689050366981L;
	
	private TipoProfissional tipo;
	private String numeroRegistro;
	private ArrayList<Especialidade> especialidades; //trocar por um ENUM?
	private ArrayList<Convenio> convenios; //trocar por um ENUM?
	private Endereco endereco;
	private String nome;
	
	public ProfissionalSaude(TipoProfissional tipo, String numeroRegistro,String nome, Endereco endero) {
		this.tipo = tipo;
		this.numeroRegistro = numeroRegistro;
		especialidades = new ArrayList<Especialidade>();
		convenios = new ArrayList<Convenio>();
		this.nome = nome;
		this.endereco=endero;

	}
	
	public void setTipo(TipoProfissional tipo){
		this.tipo = tipo;
	}
	
	public void setRegistro(String numeroRegistro){
		this.numeroRegistro = numeroRegistro;
	}
	
	public void addEspecialidade(Especialidade especialidade){
		especialidades.add(especialidade);
	}
	
	public void addConvenio(Convenio convenio){
		convenios.add(convenio);
	}
	
	public void setEndereco(String rua,String numero,String bairro, String sala, String cidade, String estado){
		endereco = new Endereco (rua, numero, bairro, sala,cidade,estado);
	}

	public TipoProfissional getTipo() {
		return tipo;
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public ArrayList<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public ArrayList<Convenio> getConvenios() {
		return convenios;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public void setEspecialidades(ArrayList<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}

	public void setConvenios(ArrayList<Convenio> convenios) {
		this.convenios = convenios;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((convenios == null) ? 0 : convenios.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result
				+ ((especialidades == null) ? 0 : especialidades.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((numeroRegistro == null) ? 0 : numeroRegistro.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfissionalSaude other = (ProfissionalSaude) obj;
		if (convenios == null) {
			if (other.convenios != null)
				return false;
		} else if (!convenios.equals(other.convenios))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (especialidades == null) {
			if (other.especialidades != null)
				return false;
		} else if (!especialidades.equals(other.especialidades))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroRegistro == null) {
			if (other.numeroRegistro != null)
				return false;
		} else if (!numeroRegistro.equals(other.numeroRegistro))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	
	
	

}
