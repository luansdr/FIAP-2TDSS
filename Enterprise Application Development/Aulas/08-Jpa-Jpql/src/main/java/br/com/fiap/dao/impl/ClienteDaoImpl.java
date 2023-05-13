package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.entity.Cliente;

public class ClienteDaoImpl extends GenericDaoImpl<Cliente, Integer> implements ClienteDao {

	public ClienteDaoImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cliente> listarPorNome(String nome) {
		return em.createQuery("FROM Cliente c WHERE c.nome LIKE :parte", Cliente.class)
				.setParameter("parte", "%" + nome + "%").getResultList();
	}

	@Override
	public List<Cliente> listarPorEstado(String estado) {
		return em.createQuery("from Cliente c where c.endereco.cidade.uf = :estado", Cliente.class)
				.setParameter("estado", estado).getResultList();
	}

	@Override
	public List<Cliente> listarPorDiasReservas(Integer dias) {
		return em.createQuery("select r.cliente from Reserva r where r.numeroDias = :dias", Cliente.class)
				.setParameter("dias", dias).getResultList();
	}

	@Override
	public List<Cliente> buscar(String nome, String cidade) {
	    return em.createQuery("from Cliente c where c.nome = :nome and c.endereco.cidade.nome = :cidade", Cliente.class)
	            .setParameter("nome", nome)
	            .setParameter("cidade", cidade)
	            .getResultList();
	}

	@Override
	public List<Cliente> buscarPorEstados(List<String> estados) {
		return em.createQuery("from Cliente c where c.endereco.cidade.uf in (:estados)", Cliente.class)
	            .setParameter("estados", estados)
	            .getResultList();
	}

}
