package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exceptions.SemSaldoExpcetion;

public class ContaPoupanca extends Conta implements ContaInvestimento {

	private float taxa;
	public static final float RENDIMENTO = 0.10f;

	public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
		super(agencia, numero, dataAbertura, saldo);
		this.taxa = taxa;
	}

	public ContaPoupanca() {

	}

	public double CalculaRetornoInvestimento() {
		return saldo * RENDIMENTO;
	}


	@Override
	public void retirar(double valor) throws SemSaldoExpcetion {

		if (saldo < valor + taxa) {
			throw new SemSaldoExpcetion("Sem saldo para retirar");
		} else {
			saldo -= valor + taxa;
		}

	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public float getRendimento() {
		return RENDIMENTO;
	}

}
