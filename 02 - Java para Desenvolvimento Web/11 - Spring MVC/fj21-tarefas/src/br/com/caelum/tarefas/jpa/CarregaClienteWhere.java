package br.com.caelum.tarefas.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Cliente;

public class CarregaClienteWhere {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("clientes");
		EntityManager manager = factory.createEntityManager();
		List<Cliente> lista = manager.createQuery("select t from Cliente as t")
				.getResultList();
		
		for(Cliente cliente : lista){
			System.out.println(cliente.getNome());
		}
	}

}
