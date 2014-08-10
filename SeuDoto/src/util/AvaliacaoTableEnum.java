package util;

public enum AvaliacaoTableEnum {
NOME_CLASSE("Avaliacao"), COLUNA_USER("idUser"),COLUNA_CRM("crm"),COLUNA_AVALIACAO("avaliacao");
	
	private final String text;
	
    private AvaliacaoTableEnum (final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
