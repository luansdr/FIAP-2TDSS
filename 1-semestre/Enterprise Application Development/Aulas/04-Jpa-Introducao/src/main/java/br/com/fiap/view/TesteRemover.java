package br.com.fiap.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;

public class TesteRemover {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

		EntityManager em = factory.createEntityManager();

		Cliente cliente = em.find(Cliente.class, 23);
		em.remove(cliente);
		

		em.getTransaction().begin();
		em.getTransaction().commit();

		
		System.out.println(cliente);

	}

}
