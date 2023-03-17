package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Cliente;

public class ClienteDaoImpl implements ClienteDao {

	private EntityManager em;

	public ClienteDaoImpl(EntityManager em) {
		this.em = em;

	}

	//Cadastrar
	public Cliente cadastrar(Cliente cliente) {

		em.persist(cliente);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		
		return cliente;

	}

	//Atualizar
	public Cliente atualizar(Cliente cliente) {

		Cliente clienteAtualizado = em.merge(cliente);
		em.getTransaction().begin();
		em.getTransaction().commit();
		return clienteAtualizado;

	}

	//Remover
	public void remover(int id) {

		Cliente cliente = em.find(Cliente.class, id);
		em.remove(cliente);

		em.getTransaction().begin();
		em.getTransaction().commit();

	}

	
	//Buscar
	public Cliente buscar(int id) {
		
		Cliente cliente = em.find(Cliente.class, id);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		return cliente;
	}

}
