class TestaEmpresa{
	public static void main(String args[]){
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
		
		Empresa empresa = new Empresa();		
		
		empresa.nome = "WMreis Manutencao de SW LTDA";
		empresa.dono = "Milton Reis";
		empresa.cnpj = "30877030871";
		
		
		f1.nome = "Milton Reis";
		f1.departamento = "TI";
		f1.salario = 10000;
		d1.dia = 29;
		d1.mes = 02;
		d1.ano = 1984;
		f1.datainicio = d1;
		f1.rg = "359420680";
		f1.estaNaEmpresa = true;
		empresa.adiciona(f1);
		
		f2.nome = "Maria silva";
		f2.departamento = "Compras";
		f2.salario = 1850;
		d2.dia = 02;
		d2.mes = 01;
		d2.ano = 1990;
		f2.datainicio = d1;
		f2.rg = "35942023570";
		f2.estaNaEmpresa = true;
		empresa.adiciona(f2);
		
		f3.nome = "Cora Reis";
		f3.departamento = "Qualidade";
		f3.salario = 2456;
		d3.dia = 17;
		d3.mes = 06;
		d3.ano = 1985;
		f3.datainicio = d1;
		f3.rg = "265523556";
		f3.estaNaEmpresa = false;
		empresa.adiciona(f3);
		
		empresa.mostraEmpregados();
	}
}