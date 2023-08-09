package br.com.fiap.exception;

public class CommitException extends Exception  {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5522398584562521742L;



	public CommitException() {
		super("Erro ao realizar o commit");
	}
	
	
	
	public CommitException(String message) {
		super(message);
	}
	
	
}
