
public class Conta {

	private double saldo;

	void deposita(double valor){
		this.saldo += valor;		
	}

	public double getSaldo() {
		return this.saldo;
	}
}
