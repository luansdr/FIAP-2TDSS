package br.com.fiap.jap.dao;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.IdNotFoundExpcetion;

public abstract class GenericDaoImpl<T, K>  implements GenericDao<T, K> {
	
	
	private EntityManager em;
	
	private Class<T> clazz;
	
	
	@SuppressWarnings("all")
	public GenericDaoImpl(EntityManager em){
		this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		this.em = em;
	}
	

	public void cadastrarOuAtualizar(T entidade) {
		em.merge(entidade);
		

	}

	public void remover(K id) throws IdNotFoundExpcetion {
		em.remove(id);
	}

	public T buscar(K id) throws IdNotFoundExpcetion {

		T entidade = em.find(clazz, id);
		
		if(entidade == null) {
			throw new IdNotFoundExpcetion("Entidade nao encontrada");
		}
		
		return entidade;
	}


	public void commit() throws CommitException {
		
		em.getTransaction().begin();
		em.getTransaction().commit();

		
	}

}
