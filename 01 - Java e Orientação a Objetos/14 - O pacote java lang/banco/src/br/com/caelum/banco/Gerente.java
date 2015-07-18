package br.com.caelum.banco;

class Gerente extends Funcionario {	
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}
	
	public int getSenha() {
		return this.senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	// outros métodos
}