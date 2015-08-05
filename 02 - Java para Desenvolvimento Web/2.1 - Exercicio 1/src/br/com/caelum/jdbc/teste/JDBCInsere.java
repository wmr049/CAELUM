package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException {

		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Milton");
		contato.setEmail("wmr049@caelum.com.br");
		contato.setEndereco("R. Vergueiro 1 cj87");
		contato.setDataNascimento(Calendar.getInstance());
		// grave nessa conexão!!!
		ContatoDao bd = new ContatoDao();
		// método elegante
		bd.adiciona(contato);
		System.out.println("Gravado!");
	}

}
