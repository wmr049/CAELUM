package br.com.caelum.tarefas.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class CarregaTarefaWhere {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("clientes");
		EntityManager manager = factory.createEntityManager();
		List<Tarefa> lista = manager.createQuery("select t from Tarefa as t")
				.getResultList();

		for (Tarefa tarefa : lista) {
			System.out.println(tarefa.getDescricao());
		}
	}

}
