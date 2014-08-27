package model;

public enum TipoProfissional {
	
	MEDICO("Médico"), FISIOTERAPEUTA("Fisioterapeuta"), DENTISTA("Dentista"), ENFERMEIRO("Enfermeiro"),PSICOLOGO("Psicologo"),NUTRICIONISTA("Nutricionista");
	
	private final String tipo;
	
	private TipoProfissional(String tipo){
		this.tipo=tipo;
	}
	
	 @Override
	    public String toString() {
	        return tipo;
	    }
}
