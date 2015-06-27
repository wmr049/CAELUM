class TestaGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Gerente gerente2 = new Gerente();
		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
				
		gerente.setNome("João da Silva");				
		gerente.setSenha(4231);
		gerente.setSalario(5000.0);
		controle.registra(gerente);
		
		gerente2.setNome("Maria da Silva");				
		gerente2.setSenha(1234);
		gerente2.setSalario(1000.0);
		controle.registra(gerente2);					
		
		System.out.println(controle.getTotalDeBonificacoes());
	}
}