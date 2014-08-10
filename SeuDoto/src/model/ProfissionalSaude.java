package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import util.Especialidade;
import exception.ProfissionalSaudeException;

public class ProfissionalSaude implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1586030689050366981L;

	private String tipo;
	private String numeroRegistro;
	private String nome;
	
	private String especialidade;
	private String convenio;
	private Integer avaliacoesPositivas, avaliacoesNegativas;

	public ProfissionalSaude(String tipo, String numeroRegistro, String nome, String especialidade, String convenio)
			throws ProfissionalSaudeException {
		
		if (verificaParametros(tipo, numeroRegistro, nome, especialidade)) {
			this.tipo = tipo;
			this.numeroRegistro = numeroRegistro;
			this.especialidade = especialidade;
			this.nome = nome;
			avaliacoesNegativas = new Integer(0);
			avaliacoesPositivas = new Integer(0);
			
		} else {
			throw new ProfissionalSaudeException("Parametros invalidos");
		}

	
		this.convenio = convenio;

	}

	public boolean verificaParametros(String tipo, String numeroRegistro,
			String nome, String especialidade) {
		return tipo != null && !"".equals(tipo.trim()) && nome != null
				&& !"".equals(nome.trim()) && especialidade != null
				&& !"".equals(especialidade.trim()) && numeroRegistro != null && 
				!"".equals(numeroRegistro
				.trim());
	}
	
	public void addAvaliacaoPositiva(){
		setAvaliacoesPositivas(avaliacoesPositivas+1);
	}
	
	public void addAvaliacaoNegativa(){
		setAvaliacoesNegativas(avaliacoesNegativas+1);
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
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
			
		if (getClass() != obj.getClass()){
			return false;
			}
		ProfissionalSaude other = (ProfissionalSaude) obj;
		if (convenio == null) {
			if (other.convenio != null){
				return false;
				}
		} else if (!convenio.equals(other.convenio)){
			return false;
			}

		if (especialidade == null) {
			if (other.especialidade != null){
				return false;
				}
		} else if (!especialidade.equals(other.especialidade)){
			return false;
			}
		if (nome == null) {
			if (other.nome != null){
				return false;
				}
		} else if (!nome.equals(other.nome)){
			return false;
			}
		if (numeroRegistro == null) {
			if (other.numeroRegistro != null){
				return false;
				}
		} else if (!numeroRegistro.equals(other.numeroRegistro)){
			return false;
			}
		if (tipo == null) {
			if (other.tipo != null){
				return false;
				}
		} else if (!tipo.equals(other.tipo)) {
			return false;
			}
		return true;
	}

	public Integer getAvaliacoesPositivas() {
		return avaliacoesPositivas;
	}

	public void setAvaliacoesPositivas(Integer avaliacoesPositivas) {
		this.avaliacoesPositivas = avaliacoesPositivas;
	}

	public Integer getAvaliacoesNegativas() {
		return avaliacoesNegativas;
	}

	public void setAvaliacoesNegativas(Integer avaliacoesNegativas) {
		this.avaliacoesNegativas = avaliacoesNegativas;
	}
	
	

}
