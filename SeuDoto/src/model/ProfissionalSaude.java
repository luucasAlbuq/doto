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
	
	public void addEspecialidade(String especialidade){
		especialidades.add(especialidade);
	}
	
	public void addConvenio(String convenio){
		convenios.add(convenio);
	}
	
	public void setEndereco(String ruaNumeroBairro, String sala, String cidade, String estado){
		endereco = new Endereco (ruaNumeroBairro, sala, cidade, estado);
	}

}
