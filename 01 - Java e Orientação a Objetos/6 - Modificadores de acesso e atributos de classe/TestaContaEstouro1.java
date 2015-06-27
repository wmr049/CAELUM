class TestaContaEstouro1 {
	public static void main(String args[]) {
		Conta minhaConta = new Conta();
		minhaConta.saldo = 1000.0;
		minhaConta.limite = 1000.0;
		if(minhaConta.saca(50000))
			System.out.println("Saque efetuado no valor ");
		else
			System.out.println("Nao foi permitido saque, saldo insuficiente");
	}
}