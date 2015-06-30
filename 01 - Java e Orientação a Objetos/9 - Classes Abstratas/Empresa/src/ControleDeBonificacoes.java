public class ControleDeBonificacoes {
	private double totalDeBonificacoes = 0;

	public double registra(Funcionario f) {
		System.out.println("Adicionando bonificação do funcionario: " + f.nome);
		return this.totalDeBonificacoes += f.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}

	public void adiciona(Funcionario f) {
		// TODO Auto-generated method stub
		
	}
}
