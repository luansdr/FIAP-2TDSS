package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PacoteDao;
import br.com.fiap.dao.impl.PacoteDaoImpl;
import br.com.fiap.entity.Pacote;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Pesquisas {

	public static void main(String[] args) {

		
		//Listar todos os pacotes
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDao dao = new PacoteDaoImpl(em);
		
	
			List<Pacote> p = dao.listar();
			p.forEach(c -> System.out.println(c));
			
			List<Pacote> t = dao.buscarPorPrecoMenor(5000f);
			t.forEach(c -> System.out.println(c.getDescricao() +  " " + c.getPreco()));
			
			
			
		
		
	}

}
