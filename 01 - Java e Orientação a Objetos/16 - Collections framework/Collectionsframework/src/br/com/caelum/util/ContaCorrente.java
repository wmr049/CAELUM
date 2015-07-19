package br.com.caelum.util;

public class ContaCorrente extends Conta implements Comparable<ContaCorrente> {

	ContaCorrente(int numero, Cliente titular) {
		super(numero, titular);
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * (taxa * 2);
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public int compareTo(ContaCorrente outra) {
		if (this.saldo < outra.saldo) {
			return -1;
		}
		if (this.saldo > outra.saldo) {
			return 1;
		}
		return 0;
	}
}