package br.com.fiap.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PacoteDao;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class PacoteDaoImpl extends GenericDaoImpl<Pacote,Integer> implements PacoteDao{

	public PacoteDaoImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Pacote> buscarPorPrecoMenor(float preco) {
		return  em.createQuery("from Pacote p where p.preco < :precoPacote", Pacote.class)
				.setParameter("precoPacote", preco)
				.getResultList();
	}

	@Override
	public List<Pacote> buscarPorTransporteEspecifico(Transporte transporte) {
		em.persist(transporte);
		return em.createQuery("from Pacote p where p.transporte = :transporte", Pacote.class)
				.setParameter("transporte", transporte)
				.getResultList();
	}

	@Override
	public List<Pacote> buscarPorDatas(Calendar inicio, Calendar fim) {
	    return em.createQuery("select p from Pacote p where p.dataSaida between :inicio and :fim", Pacote.class)
	            .setParameter("inicio", inicio)
	            .setParameter("fim", fim)
	            .getResultList();
	}

	@Override
	public Double somaDePrecoPorTransporteEspeficio(Transporte transporte) {
		em.persist(transporte);
		return em.createQuery("select sum(p.preco) from Pacote p where p.transporte = :transporte", Double.class)
				.setParameter("transporte", transporte)
				.getSingleResult();
				
	}

	

}
