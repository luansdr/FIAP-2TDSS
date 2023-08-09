package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Motorista;

public class MotoristaDaoImpl implements MotoristaDao {

	private EntityManager em;

	public MotoristaDaoImpl(EntityManager em) {
		this.em = em;
	}

	public Motorista cadastrar(Motorista motorista) {

		em.persist(motorista);
		commitAcao();

		return motorista;
	}

	public Motorista atualizar(Motorista motorista) {

		Motorista motoristaAtualizado = em.merge(motorista);

		commitAcao();
		return motoristaAtualizado;

	}

	public void remover(int id) {

		Motorista motorista = em.find(Motorista.class, id);
		em.remove(motorista);
		commitAcao();

	}
	
	public Motorista buscar(int id) {
		Motorista motoristaLocalizado = em.find(Motorista.class, id);
		
		commitAcao();
		
		return motoristaLocalizado;
	}
	

	public void commitAcao() {
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

}
