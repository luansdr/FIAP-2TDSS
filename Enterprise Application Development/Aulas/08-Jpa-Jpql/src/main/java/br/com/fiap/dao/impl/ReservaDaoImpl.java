package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ReservaDao;
import br.com.fiap.entity.Reserva;

public class ReservaDaoImpl extends GenericDaoImpl<Reserva,Integer> implements ReservaDao {

	public ReservaDaoImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Reserva> istarPorDiasReservas(Integer dias) {
		return  em.createQuery("from Reserva r where r.numeroDias = :dias", Reserva.class).
				setParameter("dias", dias)
				.getResultList();
	}

}
