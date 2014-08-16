package util;

public enum ProfissionalTableEnum {
	NOME_CLASSE("ProfissionalSaude"), COLUNA_NOME("nome"), COLUNA_CONVENIOS(
			"convenios"), COLUNA_ESPECIALIDADE("especialidade"), COLUNA_CRM(
			"crm"), COLUNA_TIPO("tipo"),COLUNA_AVAL_POSI("avaliacoesPositivas"),COLUNA_AVAL_NEGA("avaliacoesNegativas");

	private final String text;

	private ProfissionalTableEnum(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
}
