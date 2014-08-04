package br.com.restful.util;

public enum Especialidade {
	CARDIOLOGISTA("Cardiologista"), PEDIATRA("Pediatra"), NEUROLOGISTA("Neurologista"),
	DERMATOLOGISTA("Dermatologista"), GINECOLOGISTA("Ginecologista");
	
	private final String especialidade;
	
    private Especialidade (final String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return especialidade;
    }
}
