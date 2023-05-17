package br.com.fiap.view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.dao.PacoteDao;
import br.com.fiap.dao.impl.ClienteDaoImpl;
import br.com.fiap.dao.impl.PacoteDaoImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Exercicios2 {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		
//		1. buscarPorDatas(Calendar inicio, Calendar fim):
//		   retorna todos os pacotes cuja data de saída esteja
//		   no intervalo especificado nos parâmetros;
	
		System.out.println("---------------------- Exercicio 1 ----------------------");
		PacoteDao dao = new PacoteDaoImpl(em);

		Calendar dataInicio = new GregorianCalendar(2020, Calendar.JANUARY, 1);
		Calendar dataFim = new GregorianCalendar(2020, Calendar.DECEMBER, 1);

		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		List<Pacote> p = dao.buscarPorDatas(dataInicio, dataFim);
		p.forEach(c -> System.out.println(c.getDescricao() + " -> DataSaida: " + formatter.format(c.getDataSaida().getTime())));
		System.out.println("\n\n");
		
		
//		2. buscar(String nome, String cidade): retorna os
//		   clientes que possuam parte do nome o texto
//		   informado como parâmetro e que tenham algum
//		   endereço por parte do nome de cidade
//		   informado;
		
		
		System.out.println("---------------------- Exercicio 2 ----------------------");
		ClienteDao daoCliente = new ClienteDaoImpl(em);	
		List<Cliente> c = daoCliente.buscar("Leandro", "Londrina");
		c.forEach(cl -> System.out.println(cl.getNome() + " -> Cidade: " + cl.getEndereco().getCidade().getNome()));
		System.out.println("\n\n");
		
		
		
//		3. buscarPorEstados(List<String> estados): retorna
//		   todos os clientes conforme os estados passados
//		   como parâmetro;
			
		System.out.println("---------------------- Exercicio 3 ----------------------");
		List<String> cs = new ArrayList<String>();
		cs.add("SP");
		cs.add("PR");
		
		c = daoCliente.buscarPorEstados(cs);
		c.forEach(cl -> System.out.println(cl.getNome() + " -> Estado: " + cl.getEndereco().getCidade().getUf()));
		
//		4. Contar a quantidade de clientes de um estado especifico
			
		System.out.println("---------------------- Exercicio 4 ----------------------");
		
	
		
		String estado = "SP";
		int quantidadeClientes = daoCliente.contarPorEstado(estado);
		System.out.println("Quantidade de clientes " + estado + ": " + quantidadeClientes);

		
		
	}

}
