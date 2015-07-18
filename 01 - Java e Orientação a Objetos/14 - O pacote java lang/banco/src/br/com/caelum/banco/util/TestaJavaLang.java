package br.com.caelum.banco.util;

import br.com.caelum.banco.Cliente;
import br.com.caelum.banco.Conta;
import br.com.caelum.banco.GuardadorDeObjetos;

public class TestaJavaLang {

	public static void main(String[] args) {
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		Cliente cliente = new Cliente();
		cliente.setNome("Milton");
		Conta conta = new Conta(cliente);
		Conta conta2 = new Conta(cliente);
		
		System.out.println("descricao " + conta);
		
		if (conta != conta2) {
			System.out.println("Objetos referenciados sao diferentes");
		}else {
			System.out.println("Objetos referenciados sao iguais");
		}
		
		guardador.adicionaObjeto(conta);
		
		Object object = guardador.pegaObjeto(0);
		
		Conta contaResgatada = (Conta) object;
		contaResgatada.setLimite(1000);
		System.out.println(contaResgatada.getSaldo());									

	}

}
