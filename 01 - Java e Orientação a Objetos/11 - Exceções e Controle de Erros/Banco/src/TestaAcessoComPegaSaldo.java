import java.io.FileNotFoundException;

class TestaAcessoComPegaSaldo {
	/**
	 * @param args
	 */
	public static void main(String args[]) {

		/*
		 * Cliente carlos = new Cliente(); carlos.nome = "Carlos";
		 * 
		 * Cliente milton = new Cliente(); milton.nome = "Milton";
		 * 
		 * Conta minhaConta = new Conta(233454,carlos);
		 * minhaConta.deposita(1000); minhaConta.setLimite(1000);
		 * minhaConta.saca(3000);
		 * 
		 * System.out.println(carlos.nome);
		 * System.out.println("Numero da Conta : " + minhaConta.getNumero());
		 * System.out.println("Quantidades de Contas : " +
		 * Conta.getTotaldeContas()); System.out.println("Saldo: " +
		 * minhaConta.getSaldo());
		 */

		/*
		 * EXE 1 Cap 11 - Exceções metodos e arrays
		 * System.out.println("inicio do main"); try { metodo1(); } catch
		 * (ArrayIndexOutOfBoundsException e) { System.out.println("erro : " +
		 * e); } System.out.println("fim do main");
		 */

		/*
		 * Exe 2 Cap 11 - divisão por zero int i = 5571; i = i / 0;
		 * System.out.println("O resultado " + i);
		 */

		/* Exe 3 Cap 11 - Referencia null
		Conta c = null;
		System.out.println("Saldo atual " + c.getSaldo());
		*/
		
		try {
			metodo();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void metodo() throws FileNotFoundException  {
		new java.io.FileOutputStream("arquivo.txt");
	}

	private static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("inicio do metodo2");
		int[] array = new int[10];

		for (int i = 0; i <= 15; i++) {

			array[i] = i;
			System.out.println(i);

		}
		System.out.println("fim do metodo2");
	}
}