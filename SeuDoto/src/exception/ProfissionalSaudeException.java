package exception;

import util.MensagemExcessao;

public class ProfissionalSaudeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProfissionalSaudeException(String msg){
		super(msg);
	}
	
	public ProfissionalSaudeException(){
		super(MensagemExcessao.ERRO.toString());
	}
}
