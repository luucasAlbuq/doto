package br.com.restful.util;

public enum MensagemExcessao {
	ERRO("Profissional Invalido"), CRM_INVALIDO("CRM Invalido"), AVALIACAO_INVALIDA("Avaliacao Invalida");

	private final String erroMsg;

	private MensagemExcessao(final String erroMsg) {
		this.erroMsg = erroMsg;
	}

	@Override
	public String toString() {
		return erroMsg;
	}
}
