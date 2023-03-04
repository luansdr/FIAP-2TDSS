package br.com.fiap.exceptions;

public class SemSaldoExpcetion extends Exception {

	private static final long serialVersionUID = 1L;

	public SemSaldoExpcetion(String messege) {
		super(messege);
	}

	public String getErrorMessage() {
		return super.getMessage();
	}

}
