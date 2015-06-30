abstract class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data datainicio;
	String rg;
	boolean estaNaEmpresa;

	void mostra() {

		System.out.println("Nome = " + this.nome);
		System.out.println("Departamento = " + this.departamento);
		System.out.println("Salario = " + this.salario);
		System.out.println("Data de Inicio = " + this.datainicio.formatada());
		System.out.println("Rg = " + this.rg);
		System.out.println("Esta na Empresa = " + this.estaNaEmpresa);

	}

	// Demite o funcionario
	void demite() {
		System.out.println("O funcionario " + this.nome
				+ " nao pertence mais a quadro de funcionario da empresa");
		this.nome = "";
	}

	// salário multiplicado por 12..
	double calculaGanhoAnual() {
		double salarioAnual = this.salario * 12;
		return salarioAnual;
	}

	// aumenta o salario do funcionario uma certa quantidade
	void recebeAumento(double aumento) {
		double salarioNovo = this.salario + aumento;
		this.salario = salarioNovo;
	}

	abstract double getBonificacao();
	
}