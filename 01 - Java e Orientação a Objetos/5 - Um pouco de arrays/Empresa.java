class Empresa {
	
	String nome;
	String cnpj;
	String dono;
	Funcionario[] empregados = new Funcionario[10];	
	int fi = 0;
	
	void adiciona(Funcionario f) {
		// algo tipo:
		 this.empregados[fi] = f;
		 fi++;
		// mas que posição colocar?
	}
	
	void mostraEmpregados() {
		for (Funcionario x : empregados) {			
			System.out.println("Funcionario na posicao: " + x.nome);			
		}
	}
}