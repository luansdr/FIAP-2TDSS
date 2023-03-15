package br.com.fiap.dao;

import br.com.fiap.entity.Cliente;

public interface ClienteDao {
	
	
	public Cliente cadastrar(Cliente cliente);
	
	
	public Cliente atualizar(Cliente cliente);
	
	
	public void remover(int id);
	
	
	public Cliente buscar(int id);
	
	
	
	
	

}
