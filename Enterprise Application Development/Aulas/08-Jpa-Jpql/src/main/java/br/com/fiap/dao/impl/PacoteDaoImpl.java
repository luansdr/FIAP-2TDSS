package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PacoteDao;
import br.com.fiap.entity.Pacote;

public class PacoteDaoImpl extends GenericDaoImpl<Pacote,Integer> implements PacoteDao{

	public PacoteDaoImpl(EntityManager entityManager) {
		super(entityManager);
	}

}
