package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;

class TesteAtualizacao {

	public static void main(String[] args) {
		// Instaciar um Cliente com um id valido

		Cliente cliente = new Cliente("Luan", new GregorianCalendar(2003, Calendar.OCTOBER, 11), 1.0, "32132132",
				Genero.MASCULINO);

		cliente.setId(16);

		// Criar a fabrica

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

		// Criar o entity maneger

		EntityManager em = factory.createEntityManager();

		// Atualizar o cliente no banco de dados;

//		em.persist(cliente);
		em.merge(cliente);

		em.getTransaction().begin();
		em.getTransaction().commit();
	}

}
