package br.com.fiap.modal;

import java.time.LocalDateTime;

public class Restaurante {

	private String nome;
	private int capacidade;
	private LocalDateTime dataAbertura;
	private Culinaria culinaria;
	

	
	public Restaurante(String nome) {

		this.nome = nome;
	}


	public Restaurante(String nome, int capacidade, LocalDateTime dataAbertura, Culinaria culinaria) {
//		super();
		this.nome = nome;
		this.capacidade = capacidade;
		this.dataAbertura = dataAbertura;
		this.culinaria = culinaria;
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

	public LocalDateTime getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDateTime dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	

	public Culinaria getCulinaria() {
		return culinaria;
	}

	public void setCulinaria(Culinaria culinaria) {
		this.culinaria = culinaria;
	}

	@Override
	public String toString() {
		return "Restaurante -> Nome: " + nome.toUpperCase() + ", capacidade: " + capacidade;
	}

}
