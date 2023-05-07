package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDao extends GenericDao<Cliente,Integer>{
	
	List<Cliente> listarPorNome(String nome);
	
	List<Cliente> listarPorCidade(String cidade);

	List<Cliente> listarPorDiasReservas(Integer dias);
}
