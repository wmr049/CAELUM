class TesteFuncionario{
	public static void main (String[] args){		
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Hugo";
		f1.salario = 100;
		Funcionario f2 = f1;
		
		Data data = new Data(); // ligação!		
		
		data.dia = 29;
		data.mes = 02;
		data.ano = 1984;
		f1.datainicio = data;
		
		f1.mostra();		
		
		System.out.println("Data de Entrada = " + f1.datainicio.dia);
		
		if (f1 == f2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}		
	}

}