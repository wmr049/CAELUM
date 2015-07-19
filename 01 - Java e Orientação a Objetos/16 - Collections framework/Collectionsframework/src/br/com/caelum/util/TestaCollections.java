package br.com.caelum.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestaCollections {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		ContaPoupanca c1 = new ContaPoupanca(1973, cliente1);
		c1.deposita(100);

		Cliente cliente2 = new Cliente();
		ContaPoupanca c2 = new ContaPoupanca(1462, cliente2);
		c2.deposita(200);

		Cliente cliente3 = new Cliente();
		ContaPoupanca c3 = new ContaPoupanca(1854, cliente3);
		c3.deposita(300);

		List<ContaPoupanca> contas = new ArrayList<>();
		// List<ContaPoupanca> contas = new LinkedList<>();

		contas.add(c1);
		contas.add(c3);
		contas.add(c2);

		Collections.sort(contas);

		System.out.println(contas.size());

		for (int i = 0; i < contas.size(); i++) {
			System.out.println("numero: " + contas.get(i).getNumero());
		}

		List<String> lista = new ArrayList<>();
		lista.add("Sérgio");
		lista.add("Paulo");
		lista.add("Guilherme");
		// repare que o toString de ArrayList foi sobrescrito:

		System.out.println(lista);

		Collections.max(lista);

		System.out.println(lista);

		Set<String> cargos = new HashSet<>();

		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretária");
		cargos.add("Funcionário");
		cargos.add("Diretor"); // repetido!

		// imprime na tela todos os elementos
		System.out.println(cargos);

		for (String palavra : cargos) {
			System.out.println(palavra);
		}

		// retorna o iterator
		Iterator<String> i = cargos.iterator();
		while (i.hasNext()) {
			// recebe a palavra
			String palavra = i.next();
			System.out.println(palavra);
		}

		ContaCorrente co1 = new ContaCorrente(1,cliente1);
		co1.deposita(10000);		
		ContaCorrente co2 = new ContaCorrente(2,cliente2);
		co2.deposita(3000);		
		// cria o mapa
		Map<String, ContaCorrente> mapaDeContas = new HashMap<>();
		
		// adiciona duas chaves e seus respectivos valores
		mapaDeContas.put("diretor", co1);
		mapaDeContas.put("gerente", co2);
		
		// qual a conta do diretor? (sem casting!)
		ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
		
		Properties config = new Properties();
		config.setProperty("database.login", "scott");
		config.setProperty("database.password", "tiger");
		config.setProperty("database.url","jdbc:mysql:/localhost/teste");

		// 		muitas linhas depois...
		String login = config.getProperty("database.login");
		String password = config.getProperty("database.password");
		String url = config.getProperty("database.url");
		
		/*try {
			DriverManager.getConnection(url, login, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

}
