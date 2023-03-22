package br.com.fiap.jap.view;

import javax.persistence.EntityManager;

import br.com.fiap.jap.singleton.EntityManagerFactorySingleton;

public class View {
	

	EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
	
}
