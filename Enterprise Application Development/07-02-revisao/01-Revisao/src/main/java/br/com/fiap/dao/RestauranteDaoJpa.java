package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.modal.Restaurante;

public class RestauranteDaoJpa implements RestauranteDao {
	
	
		

	private List<Restaurante> restaurantes;
	
	public RestauranteDaoJpa() {
		
		restaurantes = new ArrayList<Restaurante>();
		}

	public void cadastrar(Restaurante restaurante) {
		this.restaurantes.add(restaurante);		
	}

	public List<Restaurante> listar() {
		return this.restaurantes;
	}

}
