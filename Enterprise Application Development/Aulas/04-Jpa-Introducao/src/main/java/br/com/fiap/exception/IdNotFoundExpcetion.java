package br.com.fiap.exception;

public class IdNotFoundExpcetion extends Exception{

	
	public IdNotFoundExpcetion() {
		super("ID não encontrado");
	}
	
	
	public IdNotFoundExpcetion(String message) {
		super(message);
	}
	
	
	
	
}
