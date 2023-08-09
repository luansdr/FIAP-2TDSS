package br.com.fiap.jap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.jap.entity.Investimento;

public class InvestimentoDaoImpl extends GenericDaoImpl<Investimento, Integer> implements InvestimentoDao {

	public InvestimentoDaoImpl(EntityManager em) {
		super(em);
	}
	
	


}
