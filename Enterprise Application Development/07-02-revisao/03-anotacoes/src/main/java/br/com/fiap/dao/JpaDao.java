package br.com.fiap.dao;

import br.com.fiap.anotation.Tabela;

public class JpaDao {

	
	public String pesquisar(Object obj) {
		return "SELECT * FROM " + obj.getClass().getAnnotation(Tabela.class).nome();
		
	}
	
}
