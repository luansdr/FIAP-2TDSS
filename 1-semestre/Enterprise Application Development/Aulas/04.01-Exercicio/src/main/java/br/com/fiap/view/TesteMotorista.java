package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.MotoristaDaoImpl;
import br.com.fiap.entity.Genero;
import br.com.fiap.entity.Motorista;

public class TesteMotorista {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = factory.createEntityManager();

		
		MotoristaDaoImpl motoristaImp = new MotoristaDaoImpl(em);

		
		Motorista motorista = new Motorista(322, "Luan Reis",
				new GregorianCalendar(1995, Calendar.NOVEMBER, 19),
				null,
				Genero.MASCULINO
				);
		
		
//		motoristaImp.cadastrar(motorista);
		
		Motorista motoristaLocalizado = motoristaImp.buscar(1);
		
		System.out.println(motoristaLocalizado);
		
		motoristaLocalizado.setNome("TESTE");
		Motorista motoristaAtualizado = motoristaImp.atualizar(motoristaLocalizado);
		
		System.out.println( "\n\n\n" + motoristaAtualizado);
		
		
	}

}
