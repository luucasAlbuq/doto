package model;

import java.io.Serializable;
import java.util.ArrayList;

import exception.ProfissionalSaudeException;
import util.Convenio;
import util.Especialidade;

public class ProfissionalSaude implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1586030689050366981L;

	private String tipo;
	private String numeroRegistro;
	// private ArrayList<String> especialidades; //trocar por um ENUM?
	// private ArrayList<Convenio> convenios; //trocar por um ENUM?
	private String endereco;
	private String nome;
	private int avaliacao;
	private String especialidade;
	private String convenio;

	public ProfissionalSaude(String tipo, String numeroRegistro, String nome,
			String endero, String especialidade, String convenio) throws ProfissionalSaudeException {

		if(verificaParametros(tipo, numeroRegistro, nome, especialidade)){
			this.tipo = tipo;
			this.numeroRegistro = numeroRegistro;
			this.especialidade = especialidade;
			this.nome = nome;
		}else{
			throw new ProfissionalSaudeException("Parametros invalidos");
		}
		
		// especialidades = new ArrayList<String>();
		// convenios = new ArrayList<Convenio>();
		
		this.convenio = convenio;
		
		this.endereco = endero;
		avaliacao = 0;

	}

	public boolean verificaParametros(String tipo, String numeroRegistro,
			String nome, String especialidade) {
		return (tipo != null && !tipo.trim().equals("") && nome != null
				&& !nome.trim().equals("") && especialidade != null && !especialidade
				.trim().equals("") && numeroRegistro!=null && !numeroRegistro.trim().equals(""));
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public void addEspecialidade(Especialidade especialidade) {
		this.especialidade = this.especialidade + "\n" + especialidade;
	}

	public void addConvenio(String convenio) {
		this.convenio = this.convenio + "\n" + convenio;
	}

	public void setEndereco(String rua, String numero, String bairro,
			String sala, String cidade, String estado) {
		Endereco newEndereco = new Endereco(rua, numero, bairro, sala, cidade,
				estado);
		endereco = newEndereco.toString();
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public String getEndereco() {
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

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + avaliacao;
		result = prime * result
				+ ((convenio == null) ? 0 : convenio.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result
				+ ((especialidade == null) ? 0 : especialidade.hashCode());
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
		if (avaliacao != other.avaliacao)
			return false;
		if (convenio == null) {
			if (other.convenio != null)
				return false;
		} else if (!convenio.equals(other.convenio))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (especialidade == null) {
			if (other.especialidade != null)
				return false;
		} else if (!especialidade.equals(other.especialidade))
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
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

}
