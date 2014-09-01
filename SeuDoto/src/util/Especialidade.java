package util;

public enum Especialidade {
	CARDIOLOGISTA("Cardiologista"), PEDIATRA("Pediatra"), NEUROLOGISTA("Neurologista"),
	DERMATOLOGISTA("Dermatologista"), GINECOLOGISTA("Ginecologista"),HOMEOPATA("Homeopata"),
	EXPERIMENTALISTA("Experimentalista"),PISIQUIATRA("Psiquiatra"),ENDOCRINOLOGISTA("Endocrinologista"),
	ACUPUNTURISTA("Acupunturista"),CIRURGIAO_GERAL("Cirurgião Geral"),GASTRO("Gastroenterologista"),
	GERIATRA("Geriatra"),ORTOPEDISTA("Ortopedista");
	
	private final String especialidade;
	
    private Especialidade (final String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return especialidade;
    }
}
