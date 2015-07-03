class Cliente {
	String nome;
	String sobrenome;
	String cpf;
	int idade;
	
	public void mudaCPF(String cpf) {
		if (this.idade <= 60) {
			validaCPF(cpf);
		}
		this.cpf = cpf;
	}
	
	public Cliente procuraCliente(int id) {
		
		return null;				
	}
	
	private void validaCPF(String cpf) {
		// série de regras aqui, falha caso não seja válido
	}
}