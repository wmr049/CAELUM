package br.com.caelum.banco;

public class ContaPoupanca extends Conta {
	ContaPoupanca(int numero, Cliente titular) {
		super(numero, titular);
		// TODO Auto-generated constructor stub
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * (taxa * 3);
	}
}