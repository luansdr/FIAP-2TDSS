package br.com.fiap.model;

import br.com.fiap.anotation.Tabela;

@Tabela(nome = "TB_PROFESSOR")
public class Professor extends Pessoa {

	@Override
	public void andar() {
		System.out.println("Professor andando");
		int x = 123;

	}

}
