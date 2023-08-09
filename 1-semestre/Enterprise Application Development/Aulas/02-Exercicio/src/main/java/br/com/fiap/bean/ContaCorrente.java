package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exceptions.SemSaldoExpcetion;

public class ContaCorrente extends Conta {

	private TipoConta tipo;

	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(agencia, numero, dataAbertura, saldo);
		this.tipo = tipo;
	}

	public ContaCorrente() {

	}

	@Override
	public void retirar(double valor) throws SemSaldoExpcetion {
		if (tipo == TipoConta.COMUM && valor > saldo) {
			throw new SemSaldoExpcetion("Saldo maior do que o saldo atual");
		} else {
			saldo -= valor;
		}

	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

}
