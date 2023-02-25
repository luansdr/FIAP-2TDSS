package br.com.fiap.model;

import br.com.fiap.anotation.Coluna;

public class Pessoa {

	@Coluna("TB_PESSOA_NOME")
	private String nome;

	@Coluna("TB_PESSOA_IDADE")
	private int idade;

	@Coluna("TB_PESSOA_ALTURA")
	private double altura;

	public Pessoa(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public Pessoa() {
	}

	public void andar() {
		System.out.println("Pessoa andando");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}

}
