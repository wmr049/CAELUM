package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Cliente;

public class RemoverCliente {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("clientes");
		EntityManager manager = factory.createEntityManager();
		
		Cliente encontrada = manager.find(Cliente.class, 1L);

		manager.getTransaction().begin();
		manager.remove(encontrada);
		manager.getTransaction().commit();
	}

}
