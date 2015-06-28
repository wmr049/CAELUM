class TestaAcessoComPegaSaldo {
	public static void main(String args[]) {
		
		Cliente carlos = new Cliente();
		carlos.nome = "Carlos";		

		Cliente milton = new Cliente();
		milton.nome = "Milton";			
		
		Conta minhaConta = new Conta(233454,carlos);		
		minhaConta.deposita(1000);
		
		System.out.println(carlos.nome);
		System.out.println("Numero da Conta : " + minhaConta.getNumero());
		System.out.println("Quantidades de Contas : " + Conta.getTotaldeContas());
		System.out.println("Saldo: " + minhaConta.getSaldo());
	}
}