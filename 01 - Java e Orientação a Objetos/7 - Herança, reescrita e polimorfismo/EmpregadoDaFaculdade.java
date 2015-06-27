class EmpregadoDaFaculdade {
	private String nome;
	private double salario;
	
	double getGastos() {
		return this.salario;
	}
	
	String getInfo() {
		return "nome: " + this.nome + " com salário " + this.salario;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public double getSalario(){
		return this.salario;
	}
	
}