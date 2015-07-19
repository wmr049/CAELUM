package br.com.caelum.util;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {
	ContaPoupanca(int numero, Cliente titular) {
		super(numero, titular);
		// TODO Auto-generated constructor stub
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * (taxa * 3);
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		return Integer.compare(this.getNumero(), o.getNumero());
	}
}