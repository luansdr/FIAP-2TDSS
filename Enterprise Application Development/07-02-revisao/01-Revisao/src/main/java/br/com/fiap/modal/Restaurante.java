package br.com.fiap.modal;

public class Restaurante {

	private String nome;
	private int capacidade;

	public Restaurante(String nome) {
		this.nome = nome;
	}

	public Restaurante(String nome, int capacidade) {
		;
		this.nome = nome;
		this.capacidade = capacidade;
	}

	public Restaurante() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		return "Restaurante -> Nome: " + nome.toUpperCase() + ", capacidade: " + capacidade;
	}
	
	

}
