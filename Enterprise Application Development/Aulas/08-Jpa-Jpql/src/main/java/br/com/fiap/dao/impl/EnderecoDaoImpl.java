package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EnderecoDao;
import br.com.fiap.entity.Endereco;

public class EnderecoDaoImpl extends GenericDaoImpl<Endereco,Integer> implements EnderecoDao{

	public EnderecoDaoImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Endereco> listar(int maxResultado, int primeiraPosicao) {
		// TODO Auto-generated method stub
		return null;
	}

}
