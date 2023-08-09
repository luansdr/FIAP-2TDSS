package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.IdNotFoundExpcetion;

public interface ClienteDao {

	public Cliente cadastrarOuCadastrar(Cliente cliente) throws CommitException;

	public Cliente atualizar(Cliente cliente) throws IdNotFoundExpcetion, CommitException;

	public void remover(int id) throws IdNotFoundExpcetion;

	public Cliente buscar(int id) throws IdNotFoundExpcetion;

	public List<Cliente> buscar() throws CommitException;
	
	void commit() throws CommitException;
}
