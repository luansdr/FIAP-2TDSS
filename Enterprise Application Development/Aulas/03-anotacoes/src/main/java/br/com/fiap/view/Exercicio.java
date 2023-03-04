package br.com.fiap.view;

import br.com.fiap.dao.JpaDao;
import br.com.fiap.model.Aluno;
import br.com.fiap.model.Professor;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor prof = new Professor();
		JpaDao dao = new JpaDao();
		Aluno aluno = new Aluno();
		
		System.out.println(dao.pesquisar(aluno));
		System.out.println(dao.pesquisar(prof));
		
	}

}
