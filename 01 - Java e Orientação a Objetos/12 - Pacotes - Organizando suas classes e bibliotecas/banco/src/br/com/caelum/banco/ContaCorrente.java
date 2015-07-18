package br.com.caelum.banco;

public class ContaCorrente extends Conta {
	

	ContaCorrente(int numero, Cliente titular) {
		super(numero, titular);		
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * (taxa * 2);
	}
	
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}
	
}