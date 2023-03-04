package br.com.fiap.teste;

import br.com.fiap.dao.RestauranteDao;
import br.com.fiap.dao.RestauranteDaoJpa;
import br.com.fiap.modal.Restaurante;

public class TesteRestaurante {

	public static void main(String[] args) {
		
		String compara = "FIAP Tratoria";
		
		Restaurante restaurante = new Restaurante("masterChef", 23);
		
		RestauranteDao dao = new RestauranteDaoJpa();
		dao.cadastrar(restaurante);
		
		System.out.println("Possui nome igual a " 
		+ compara 
		+ ": " 
		+ (restaurante.getNome().equals(compara) ? "SIM" : "NAO") );
		dao.listar().forEach(r -> System.out.println(r));

	}

}
