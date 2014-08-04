package br.com.restful.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.restful.util.Especialidade;
import br.com.restful.exception.ProfissionalSaudeException;

public class ProfissionalSaude implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1586030689050366981L;

	private String tipo;
	private String numeroRegistro;
	private String nome;
	// private int avaliacao;
	private List<Avaliacao> avaliacoes;
	private String especialidade;
	private String convenio;

	public ProfissionalSaude(String tipo, String numeroRegistro, String nome, String especialidade, String convenio)
			throws ProfissionalSaudeException {
		
		if (verificaParametros(tipo, numeroRegistro, nome, especialidade)) {
			this.tipo = tipo;
			this.numeroRegistro = numeroRegistro;
			this.especialidade = especialidade;
			this.nome = nome;
			avaliacoes = new ArrayList<Avaliacao>();
			
		} else {
			throw new ProfissionalSaudeException("Parametros invalidos");
		}

		// especialidades = new ArrayList<String>();
		// convenios = new ArrayList<Convenio>();

		this.convenio = convenio;

	}

	public boolean verificaParametros(String tipo, String numeroRegistro,
			String nome, String especialidade) {
		return (tipo != null && !tipo.trim().equals("") && nome != null
				&& !nome.trim().equals("") && especialidade != null
				&& !especialidade.trim().equals("") && numeroRegistro != null && !numeroRegistro
				.trim().equals(""));
	}

	public int getAvaliacaoPositiva() {
		int cont = 0;

		for (Avaliacao av : avaliacoes) {
			if (av.isAvaliacao()) {
				cont++;
			}
		}

		return cont;
	}

	public int getAvaliacaoNegativa() {
		int cont = 0;

		for (Avaliacao av : avaliacoes) {
			if (!av.isAvaliacao()) {
				cont++;
			}
		}

		return cont;
	}
	
	public void addAvaliacao(Avaliacao av){
		avaliacoes.add(av);
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

	public String getNumeroRegistro() {
		return numeroRegistro;
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
		result = prime * result
				+ ((convenio == null) ? 0 : convenio.hashCode());
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
		if (convenio == null) {
			if (other.convenio != null)
				return false;
		} else if (!convenio.equals(other.convenio))
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
