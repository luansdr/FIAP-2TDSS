package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDao extends GenericDao<Cliente,Integer>{
	
	List<Cliente> listarPorNome(String nome);
	
	List<Cliente> listarPorEstado(String estado);

	List<Cliente> listarPorDiasReservas(Integer dias);
	
	List<Cliente> buscar(String nome, String cidade);
	
	List<Cliente>buscarPorEstados(List<String> estados);
	
	int contarPorEstado(String estado);
}
