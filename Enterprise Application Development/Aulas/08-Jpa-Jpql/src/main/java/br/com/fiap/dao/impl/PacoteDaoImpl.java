package br.com.fiap.dao.impl;

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
		return em.createQuery("from Pacote p where p.transporte.empresa = :transporte", Pacote.class)
				.setParameter("transporte", transporte.getEmpresa())
				.getResultList();
	}
	

}
