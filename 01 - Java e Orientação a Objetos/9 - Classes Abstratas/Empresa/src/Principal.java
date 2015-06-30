public class Principal {

	public static void main(String[] args) {
		ControleDeBonificacoes cdb = new ControleDeBonificacoes();
		
		Gerente g = new Gerente();
		g.nome = "Milton Reis";
		g.salario = 8600;
		
		System.out.println("Valor Bonificado = " + cdb.registra(g));
	}
}
