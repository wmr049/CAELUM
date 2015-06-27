class cap4 {
	public static void main(String[] args) {
		
		// criando a conta
		Conta minhaConta;
		minhaConta = new Conta();
		
		// alterando os valores de minhaConta
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000;

		if (minhaConta.saca(2000)) {
			System.out.println("Consegui sacar");
		} else {
			System.out.println("Não consegui sacar");
		}
	}
}