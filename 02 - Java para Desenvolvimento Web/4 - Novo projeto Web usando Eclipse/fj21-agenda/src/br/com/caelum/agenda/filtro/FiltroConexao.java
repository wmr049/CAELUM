package br.com.caelum.agenda.filtro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.caelum.agenda.jdbc.ConnectionFactory;

@WebFilter("/*")
public class FiltroConexao implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		try {
			Connection connection = new ConnectionFactory().getConnection();
			
			//pendurando a connection na requisi��o
			request.setAttribute("conexao", connection);
			
			chain.doFilter(request, response);
			connection.close();

		} catch (SQLException e) {
			throw new ServletException(e);
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
