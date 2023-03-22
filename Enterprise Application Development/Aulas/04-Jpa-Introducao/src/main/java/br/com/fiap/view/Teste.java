package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.ClienteDaoImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.IdNotFoundExpcetion;

public class Teste {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

		EntityManager em = factory.createEntityManager();

		ClienteDaoImpl clienteDaoImpl = new ClienteDaoImpl(em);

		Cliente cliente = new Cliente("Luan Reis", new GregorianCalendar(1995, Calendar.NOVEMBER, 19), 100.0,
				"40587128833", Genero.MASCULINO);

		Cliente clienteToUse = null;

		
		
		System.out.println("******--- Cadastro  ---******");
		try {
			Cliente clienteCadastrado = clienteDaoImpl.cadastrar(cliente);
			clienteToUse = clienteCadastrado;
			clienteDaoImpl.commit();
			System.out.println("\n");
		} catch (CommitException e) {

			System.err.println(e.getMessage());
		}

		
		
		
		System.out.println("******--- Cliente por ID  ---******");
		try {
			System.out.println(clienteDaoImpl.buscar(clienteToUse.getId()));
			clienteDaoImpl.commit();
			System.out.println("\n");
		} catch (IdNotFoundExpcetion | CommitException e) {

			System.err.println(e.getMessage());
		}

		
		
		System.out.println("******--- Atualizar cliente ---******");
		try {

			clienteToUse.setNome("Sddseila");
			System.out.println(clienteDaoImpl.atualizar(clienteToUse));
			clienteDaoImpl.commit();
			System.out.println("\n");
		} catch (IdNotFoundExpcetion | CommitException e) {

			System.err.println(e.getMessage());
		}
		
		
		
		System.out.println("******--- Listagem de cliente ---******");
		
		
		List<Cliente> clientes = clienteDaoImpl.buscar();
		clientes.forEach(c -> System.out.println(c));
		System.out.println("\n");
	
		
		
		

		System.out.println("******--- Remover cliente ---******");
		try {

			clienteDaoImpl.remover(clienteToUse.getId());
			System.out.println("Excluido com sucesso");
			clienteDaoImpl.commit();
		} catch (IdNotFoundExpcetion | CommitException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("\n");

	}

}
