<%@page import="java.util.List"%>
<%@page import="br.com.caelum.agenda.dao.ContatoDao"%>
<%@page import="br.com.caelum.agenda.modelo.Contato"%>
<html>
	<body>
		<table>
		<%
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();
		for (Contato contato : contatos ) {
		%>
			<tr>
			<td><%=contato.getNome() %></td>
			<td><%=contato.getEmail() %></td>
			<td><%=contato.getEndereco() %></td>
			<td><%=contato.getDataNascimento().getTime() %></td>
			</tr>
		<%
		}
		%>
		</table>
	</body>
</html>