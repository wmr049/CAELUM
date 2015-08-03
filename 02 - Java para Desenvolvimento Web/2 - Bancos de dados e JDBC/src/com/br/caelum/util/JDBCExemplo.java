package com.br.caelum.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExemplo {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
		    Class.forName("com.mysql.jdbc.Driver"); // essa linha pode resolver o problema
		    Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/fj2", "root", "");
		    System.out.println("Conectado!");
		    conexao.close();
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
	}

}
