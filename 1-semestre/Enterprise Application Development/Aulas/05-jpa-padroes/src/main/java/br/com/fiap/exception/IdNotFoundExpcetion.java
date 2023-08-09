package br.com.fiap.exception;

public class IdNotFoundExpcetion extends Exception{

	
	
	public IdNotFoundExpcetion(String message) {
		super(message);
	}
	
	public IdNotFoundExpcetion() {
		super("ID não encontrado");
	}
	
}
