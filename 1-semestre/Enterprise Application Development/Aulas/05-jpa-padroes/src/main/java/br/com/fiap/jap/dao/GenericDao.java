package br.com.fiap.jap.dao;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.IdNotFoundExpcetion;


public interface GenericDao<T, K> {

	
	void cadastrarOuAtualizar(T entidade);
	
	void remover(K id) throws IdNotFoundExpcetion;
	
    T buscar(K id) throws IdNotFoundExpcetion;
    
    void commit() throws CommitException;
	
}
