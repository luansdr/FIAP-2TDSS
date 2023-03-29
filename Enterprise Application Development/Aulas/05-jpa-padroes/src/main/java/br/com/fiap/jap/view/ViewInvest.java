package br.com.fiap.jap.view;

import javax.persistence.EntityManager;

import br.com.fiap.jap.dao.InvestimentoDao;
import br.com.fiap.jap.entity.Investimento;
import br.com.fiap.jap.entity.Tipo;
import br.com.fiap.jap.singleton.EntityManagerFactorySingleton;

public class ViewInvest {

	public static void main(String[] args) {
		
EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		
		InvestimentoDao investDao = new InvestimentoDao(em);
		
		
		Investimento investimentoAdd = new Investimento("CDI PICPAY", 7.4,  Tipo.CDI);
		
		
		investDao.cadastrarOuAtualizar(investimentoAdd);

	}

}
