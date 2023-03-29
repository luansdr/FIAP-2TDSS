package br.com.fiap.jap.view;

import javax.persistence.EntityManager;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.IdNotFoundExpcetion;
import br.com.fiap.jap.dao.InvestimentoDaoImpl;
import br.com.fiap.jap.entity.Investimento;
import br.com.fiap.jap.entity.Tipo;
import br.com.fiap.jap.singleton.EntityManagerFactorySingleton;

public class View {
	
	
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		
		InvestimentoDaoImpl investDao = new InvestimentoDaoImpl(em);
		
		
		Investimento investimentoAdd = new Investimento("CDI PICPAY", 7.4,  Tipo.CDI);
		
		
		try {
			
			investDao.cadastrarOuAtualizar(investimentoAdd);
			investDao.commit();
		}catch(CommitException e) {
			System.err.println(e.getMessage());
		}
		
		
		
		try {
			Investimento investimento =  investDao.buscar(1);
			System.out.println(investimento);
		}catch(IdNotFoundExpcetion e) {
			System.err.println(e.getMessage());
		}
		
	}
	


	
	
	
}
