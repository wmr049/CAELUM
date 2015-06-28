class Conta {
	private int numero;
	private Cliente titular;
	private double saldo;
	private double limite;
	private static int totalDeContas = 1;
	
	// construtor
	Conta (Cliente titular) {
		// faz mais uma série de inicializações e configurações
		this.titular = titular;
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}
	Conta (int numero, Cliente titular) {
		this(titular); // chama o construtor que foi declarado acima
		this.numero = numero;
	}
	
	public static int getTotaldeContas() {
		return Conta.totalDeContas;
	}
	public static void setTotaldeContas(int totalDeContas) {
		Conta.totalDeContas = totalDeContas;
	}
	
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return this.saldo + this.limite;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	public double pegaSaldo() {
		return this.saldo;
	}
	
	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {			
			return false;
		}
		else {
			destino.deposita(valor);
			return true;
		}
	}
}