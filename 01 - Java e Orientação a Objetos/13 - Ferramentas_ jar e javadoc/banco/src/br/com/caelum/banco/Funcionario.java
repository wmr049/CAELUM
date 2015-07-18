package br.com.caelum.banco;

class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;	
	
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}