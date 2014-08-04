package br.com.restful.util;

public enum TipoProfissional {
	
	MEDICO("Medoco"), FISIOTERAPEUTA("Fisioterapeuta"), DENTISTA("Dentista"), ENFERMEIRO("Enfermeiro"),PSICOLOGO("Psicologo"),NUTRICIONISTA("Nutricionista");
	
	private final String tipo;
	
	private TipoProfissional(String tipo){
		this.tipo=tipo;
	}
	
	 @Override
	    public String toString() {
	        return tipo;
	    }
}
