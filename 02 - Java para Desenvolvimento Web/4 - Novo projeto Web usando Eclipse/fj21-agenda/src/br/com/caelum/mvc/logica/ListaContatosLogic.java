package br.com.caelum.mvc.logica;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.jdbc.ConnectionFactory;
import br.com.caelum.agenda.modelo.Contato;

public class ListaContatosLogic implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		Connection connection = (Connection) req.getAttribute("conexao");			
		
		List<Contato> contatos = new ContatoDao(connection).getLista();
		req.setAttribute("contatos", contatos);		
		
		return "/WEB-INF/jsp/lista-contatos-taglibs.jsp";
	}
}
