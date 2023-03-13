package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;

public class TesteCadastro {
	
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Luan Reis", new GregorianCalendar(1995, Calendar.NOVEMBER, 19),
				100.0, "40587128801", Genero.MASCULINO);
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = factory.createEntityManager();
		
		em.persist(cliente);

		
			em.getTransaction().begin();
			em.getTransaction().commit();

		
			
			System.out.println("Cliente  cadastrado;");
		
		
		
		
		
	}

	

}
