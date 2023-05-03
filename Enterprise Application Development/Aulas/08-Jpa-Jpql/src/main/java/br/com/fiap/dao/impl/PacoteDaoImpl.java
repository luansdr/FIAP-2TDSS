package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.PacoteDao;
import br.com.fiap.entity.Pacote;

public class PacoteDaoImpl extends GenericDaoImpl<Pacote,Integer> implements PacoteDao{

	public PacoteDaoImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Pacote> listar() {

		//Criar o comando SQL
		
		TypedQuery<Pacote> query = em.createQuery("from Pacote", Pacote.class);
		
		
		//Executar o comando
		return query.getResultList();
	}

	@Override
	public List<Pacote> buscarPorPrecoMenor(float preco) {
		
		TypedQuery<Pacote> query = em.createQuery("from Pacote p where p.preco < :precoPacote", Pacote.class);
		query.setParameter("precoPacote", preco);
		return query.getResultList();
	}

}
