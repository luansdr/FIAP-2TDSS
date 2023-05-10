package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.dao.PacoteDao;
import br.com.fiap.dao.TransporteDao;
import br.com.fiap.dao.impl.ClienteDaoImpl;
import br.com.fiap.dao.impl.PacoteDaoImpl;
import br.com.fiap.dao.impl.TransporteDaoImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Exercicios {

	public static void main(String[] args) {

//		2. Obter todos os clientes por parte do nome;

		// Instanciar o EntityManager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		// Instanciar o ClienteDao
		ClienteDao daoCliente = new ClienteDaoImpl(em);

		// Buscar os cliente por parte do nome
		List<Cliente> c = daoCliente.listarPorNome("o");

		System.out.println("Resultado - 2 \n");

		// Exibir os nomes dos clientes
		c.forEach(r -> System.out.println(r.getNome()));
		System.out.println("\n\n");

//		3. Obter todos os pacotes por um transporte específico (objeto transporte);

		TransporteDao transporteDao = new TransporteDaoImpl(em);
		Transporte transporte = transporteDao.pesquisar(1);
		PacoteDao daoPacote = new PacoteDaoImpl(em);
		List<Pacote> p = daoPacote.buscarPorTransporteEspecifico(transporte);

		System.out.println("Resultado - 3  \n");

		p.forEach(t -> System.out.println(t.getDescricao() + " -> " + t.getTransporte().getEmpresa()));

		System.out.println("\n\n");

//		4. Obter todos clientes localizados por estado;

		List<Cliente> ce = daoCliente.listarPorEstado("PR");

		System.out.println("Resultado - 4  \n");

		ce.forEach(t -> System.out.println(t.getNome() + " -> " + t.getEndereco().getCidade().getUf()));
		System.out.println("\n\n");

//		5. Obter todos os clientes que efetuaram reservas em uma quantidade de dias específica.

		List<Cliente> cr = daoCliente.listarPorDiasReservas(10);

		System.out.println("Resultado - 5  \n");

		cr.forEach(r -> System.out.println(r.getNome()));
		System.out.println("\n\n");

	}

}
