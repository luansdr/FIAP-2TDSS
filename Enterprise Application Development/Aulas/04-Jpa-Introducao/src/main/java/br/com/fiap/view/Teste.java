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

	public static void main(String[] args) throws IdNotFoundExpcetion, CommitException {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");


		EntityManager em = factory.createEntityManager();
		
		ClienteDaoImpl clienteDaoImpl = new ClienteDaoImpl(em);
		
		Cliente cliente = new Cliente("Luan Reis", new GregorianCalendar(1995, Calendar.NOVEMBER, 19),
				100.0, "40587128833", Genero.MASCULINO);
		
		System.out.println("******--- Cadastro  ---******");
		Cliente clienteCadastrado = clienteDaoImpl.cadastrar(cliente);
		System.out.println("\n");

		
		System.out.println("******--- Cliente por ID  ---******");
		System.out.println(clienteDaoImpl.buscar(clienteCadastrado.getId()));
		System.out.println("\n");
		
		
		
		System.out.println("******--- Atualizar cliente ---******");
		clienteCadastrado.setNome("Sddseila");
		System.out.println(clienteDaoImpl.atualizar(clienteCadastrado));
		System.out.println("\n");
		
		

		
		System.out.println("******--- Listagem de cliente ---******");
		List<Cliente> clientes = clienteDaoImpl.buscar();
		clientes.forEach(c -> System.out.println(c));
		System.out.println("\n");
		
		
		System.out.println("******--- Remover cliente ---******");
		try {
			
			clienteDaoImpl.remover(clienteCadastrado.getId());
			System.out.println("Excluido com sucesso");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\n");
		
	}

}
