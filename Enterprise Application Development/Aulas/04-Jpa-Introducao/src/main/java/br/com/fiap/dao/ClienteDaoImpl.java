package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.entity.Cliente;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.IdNotFoundExpcetion;

public class ClienteDaoImpl implements ClienteDao {

	private EntityManager em;

	public ClienteDaoImpl(EntityManager em) {
		this.em = em;

	}

	// Cadastrar
	public Cliente cadastrar(Cliente cliente) throws CommitException {

		em.persist(cliente);
		return cliente;

	}

	// Atualizar
	public Cliente atualizar(Cliente cliente) throws IdNotFoundExpcetion, CommitException {
		buscar(cliente.getId());
		Cliente clienteAtualizado = em.merge(cliente);
		return clienteAtualizado;

	}

	// Remover
	public void remover(int id) throws IdNotFoundExpcetion {
		Cliente cliente = buscar(id);
		em.remove(cliente);

	}

	// Buscar
	public Cliente buscar(int id) throws IdNotFoundExpcetion {
		Cliente cliente = em.find(Cliente.class, id);
		if (cliente == null) {
			throw new IdNotFoundExpcetion();
		}

		return cliente;
	}

	
	//Buscar Todos
	public List<Cliente> buscar() {
		TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c", Cliente.class);

		return query.getResultList();
	}

	// Metodo Commit
	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new CommitException();
		}

	}
}
