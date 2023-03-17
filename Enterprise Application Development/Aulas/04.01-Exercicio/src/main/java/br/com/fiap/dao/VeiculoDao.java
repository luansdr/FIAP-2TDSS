package br.com.fiap.dao;

import br.com.fiap.entity.Veiculo;

public interface VeiculoDao {

	public Veiculo cadastrar(Veiculo veiculo);

	public Veiculo atualizar(Veiculo veiculo);

	public void remover(int id);

	public Veiculo buscar(int id);

}
