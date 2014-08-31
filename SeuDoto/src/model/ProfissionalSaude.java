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
	private String fone;
	
	private String especialidade;
	private List<String> convenios;
	private Integer avaliacoesPositivas, avaliacoesNegativas;

	public ProfissionalSaude(String tipo, String numeroRegistro, String nome, String especialidade, List<String> convenio, String fone)
			throws ProfissionalSaudeException {
		
		if (verificaParametros(tipo, numeroRegistro, nome, especialidade)) {
			this.tipo = tipo;
			this.numeroRegistro = numeroRegistro;
			this.especialidade = especialidade;
			this.nome = nome;
			avaliacoesNegativas = new Integer(0);
			avaliacoesPositivas = new Integer(0);
			
			if(convenio!=null){
				convenios = convenio;
			}else{
				convenios = new ArrayList<String>();
			}
			
			if(fone!=null && isDigit(fone)){
				this.fone = fone;
			}
			
		} else {
			throw new ProfissionalSaudeException("Parametros invalidos");
		}

	}
	
//	public ProfissionalSaude(String tipo, String numeroRegistro, String nome, String especialidade, String convenio)
//			throws ProfissionalSaudeException {
//		
//		if (verificaParametros(tipo, numeroRegistro, nome, especialidade)) {
//			this.tipo = tipo;
//			this.numeroRegistro = numeroRegistro;
//			this.especialidade = especialidade;
//			this.nome = nome;
//			avaliacoesNegativas = new Integer(0);
//			avaliacoesPositivas = new Integer(0);
//			convenios = new ArrayList<String>();
//			if(convenio!=null && !"".equals(convenio)){
//				convenios.add(convenio);
//			}
//			
//		} else {
//			throw new ProfissionalSaudeException("Parametros invalidos");
//		}
//
//	}

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
		convenios.add(convenio);
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

	public List<String> getConvenios() {
		return convenios;
	}

	public void setConvenios(List<String> convenios) {
		this.convenios = convenios;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((numeroRegistro == null) ? 0 : numeroRegistro.hashCode());
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
		return true;
	}
	
	public String toStringConveios(){
		String saida = "";
		if(getConvenios()!=null && !getConvenios().isEmpty()){
			for(String conv : getConvenios()){
				saida = saida.concat(conv+" ");
			}
		}else{
			saida = "Sem Cobertura";
		}
		
		return saida;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
	
	private boolean isDigit(String s) {  
	    return s.matches("[0-9]*");  
	} 
	
	
}
