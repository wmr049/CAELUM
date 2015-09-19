package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.jdbc.ConnectionFactory;
import br.com.caelum.agenda.modelo.Contato;

public class AdicionaContatoLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {

		Contato contato = new Contato();

		Connection connection = (Connection) req.getAttribute("conexao");
		
		ContatoDao dao = new ContatoDao(connection);
		dao.adiciona(contato);		

		return "/WEB-INF/jsp/adciona-contato-taglibs.jsp";
	}

}
