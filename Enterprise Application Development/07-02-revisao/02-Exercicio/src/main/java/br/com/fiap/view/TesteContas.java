package br.com.fiap.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.bean.Conta;
import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;
import br.com.fiap.exceptions.SemSaldoExpcetion;

public class TesteContas {

	public static void main(String[] args) {

//		** Passo 1 -> Instanciar uma conta corrente **
		ContaCorrente cc = new ContaCorrente(2323, 43231, Calendar.getInstance(), 50, TipoConta.COMUM);

//		**  Passo 2 -> Instanciar uma conta poupança **
		Conta cp = new ContaPoupanca(1111, 33322, Calendar.getInstance(), 50, 5);

//		** Passo 3 -> Chamar o metodo de retirar; **

		try {
			cc.retirar(3);
			System.out.println("Saque realizado com sucesso \nSaldo Disponivel: R$" + cc.getSaldo());
		} catch (SemSaldoExpcetion e) {
			System.err.println(e.getMessage());
		}

//		** Passo 4 -> Criar uma Lista de contas correntes; **
		List<ContaCorrente> contasCorrentes = new ArrayList<ContaCorrente>();

//		** Passo 5 -> Adicionar 3 contasCorrentes; **
		contasCorrentes.add(cc);
		contasCorrentes.add(new ContaCorrente(3231, 64546, Calendar.getInstance(), 122, TipoConta.COMUM));
		contasCorrentes.add(new ContaCorrente(5453, 43423, Calendar.getInstance(), 15, TipoConta.PREMIUM));

//	    ** Passo 6 - Exibir os saldos das contas; **
		contasCorrentes.forEach(c -> System.out.println("Saldo: R$" + c.getSaldo()));

	}

}
