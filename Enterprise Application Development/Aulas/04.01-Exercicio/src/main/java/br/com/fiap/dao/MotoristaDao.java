package br.com.fiap.dao;

import br.com.fiap.entity.Motorista;

public interface MotoristaDao {

	public Motorista cadastrar(Motorista motorista);

	public Motorista atualizar(Motorista motorista);

	public void remover(int id);

	public Motorista buscar(int id);

}
