package model;

import java.util.ArrayList;

public class ProfissionalSaude {
	
	private TipoProfissional tipo;
	private String numeroRegistro;
	private ArrayList<String> especialidades; //trocar por um ENUM?
	private ArrayList<String> convenios; //trocar por um ENUM?
	private Endereco endereco;
	
	public ProfissionalSaude(TipoProfissional tipo, String numeroRegistro) {
		this.tipo = tipo;
		this.numeroRegistro = numeroRegistro;
		especialidades = new ArrayList<String>();
		convenios = new ArrayList<String>();

	}
	
	public void setTipo(TipoProfissional tipo){
		this.tipo = tipo;
	}
	
	public void setRegistro(String numeroRegistro){
		this.numeroRegistro = numeroRegistro;
	}
	
	public void addEspecialidade(String especialidade){
		especialidades.add(especialidade);
	}
	
	public void addConvenio(String convenio){
		convenios.add(convenio);
	}
	
	public void setEndereco(String ruaNumeroBairro, String sala, String cidade, String estado){
		endereco = new Endereco (ruaNumeroBairro, sala, cidade, estado);
	}

	public TipoProfissional getTipo() {
		return tipo;
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public ArrayList<String> getEspecialidades() {
		return especialidades;
	}

	public ArrayList<String> getConvenios() {
		return convenios;
	}

	public Endereco getEndereco() {
		return endereco;
	}

}
