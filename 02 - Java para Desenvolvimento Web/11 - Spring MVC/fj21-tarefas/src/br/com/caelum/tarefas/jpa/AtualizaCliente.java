package br.com.caelum.tarefas.jpa;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Cliente;

public class AtualizaCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();

		cliente.setNome("Heraldo Reis");
		cliente.setDataCriacao(Calendar.getInstance());

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("clientes");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.merge(cliente);
		manager.getTransaction().commit();

		System.out.println("Id do Cliente: " + cliente.getId());

		manager.close();

	}

}
