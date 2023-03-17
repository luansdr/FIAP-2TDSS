package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Veiculo;

public class VeiculoDaoImpl implements VeiculoDao {

	private EntityManager em;

	public VeiculoDaoImpl(EntityManager em) {

		this.em = em;

	}

	public Veiculo cadastrar(Veiculo veiculo) {

		em.persist(veiculo);
		commitAcao();

		return veiculo;

	}

	public Veiculo atualizar(Veiculo veiculo) {

		Veiculo veiculoAtualizado = em.merge(veiculo);
		commitAcao();

		return veiculoAtualizado;

	}

	public void remover(int id) {

		Veiculo veiculo = em.find(Veiculo.class, id);
		em.remove(veiculo);
		commitAcao();

	}

	public Veiculo buscar(int id) {
		Veiculo veiculoLocalizado = em.find(Veiculo.class, id);
		commitAcao();

		return veiculoLocalizado;
	}

	public void commitAcao() {
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

}
