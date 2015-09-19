package br.com.caelum.mvc.logica;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class AlteraContatoLogic {

	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		long id = Long.parseLong(req.getParameter("id"));
		Contato contato = new Contato();
		contato.setId(id);
		Connection connection = (Connection) req.getAttribute("conexao");
		
		ContatoDao dao = new ContatoDao(connection);
		dao.getContato(contato);
		
		
		return "/WEB-INF/jsp/altera-contato.jsp";
	}
}
