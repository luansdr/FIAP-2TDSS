package br.com.fiap.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.dao.ReservaDao;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Reserva;

public class ClienteDaoImpl extends GenericDaoImpl<Cliente,Integer> implements ClienteDao{

	public ClienteDaoImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cliente> listarPorNome(String nome) {
	    return em.createQuery("FROM Cliente c WHERE c.nome LIKE :parte", Cliente.class)
	        .setParameter("parte", "%" + nome + "%")
	        .getResultList();
	}

	@Override
	public List<Cliente> listarPorEstado(String estado) {
		return em.createQuery("from Cliente c where c.endereco.cidade.uf = :estado", Cliente.class)
				.setParameter("estado", estado)
				.getResultList();
	}

	
	

		@Override
		public List<Cliente> listarPorDiasReservas(Integer dias) {
			return em.createQuery("select r.cliente from Reserva r where r.numeroDias = :dias", Cliente.class)
					.setParameter("dias", dias)
					.getResultList();
		}



	
	
}
