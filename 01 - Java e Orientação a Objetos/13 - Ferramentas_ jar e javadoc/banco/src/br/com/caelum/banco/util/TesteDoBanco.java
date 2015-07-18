package br.com.caelum.banco.util;

import br.com.caelum.banco.Banco;

public class TesteDoBanco {

	public static void main(String args[]) {
		Banco meuBanco = new Banco();
		meuBanco.nome = "Banco do Brasil";
		System.out.println(meuBanco.nome);
		
	}
}
