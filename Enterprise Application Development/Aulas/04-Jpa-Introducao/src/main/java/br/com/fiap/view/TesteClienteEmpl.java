package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.ClienteDaoImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;

public class TesteClienteEmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ClienteIMPL
		//Factory
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

		//EntityManger
		EntityManager em = factory.createEntityManager();

		ClienteDaoImpl clienteImp = new ClienteDaoImpl(em);

		
		// Cadastrar
		Cliente novoCliente = new Cliente("Luan", new GregorianCalendar(2003, Calendar.OCTOBER, 11), 1.0, "32132132",
				Genero.MASCULINO);
		Cliente clienteCadastrado = clienteImp.cadastrar(novoCliente);
		
		System.out.println("\n\nCliente cadastrado com sucesso \n\n" + clienteCadastrado);
		
		
		//Buscar por id
		Cliente clienteLocalizado = clienteImp.buscar(clienteCadastrado.getId());
		System.out.println("\n\nCliente localizado: \n\n" + clienteLocalizado);
		
		//Atualizar
		
		clienteLocalizado.setNome("Luan santos dos reis");
		Cliente clienteAtualizado = clienteImp.atualizar(novoCliente);
		System.out.println("\n\nCliente atualizado: \n\n" + clienteAtualizado);

		
		
		// remover
		System.out.println("\n\nCliente removido com sucesso: \n\n");
		clienteImp.remover(clienteAtualizado.getId());
		
	}

}
