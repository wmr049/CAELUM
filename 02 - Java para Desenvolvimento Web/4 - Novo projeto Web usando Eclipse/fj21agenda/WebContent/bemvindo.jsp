<%@ page import="java.util.*,
br.com.caelum.agenda.dao.*,
br.com.caelum.servlet.modelo.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- comentário em JSP aqui: nossa primeira página JSP --%>
	<%
		String mensagem = "Bem vindo ao sistema de agenda do FJ‐21!";
	%>
	<%
		out.println(mensagem);
	%>
	
	<br />
	<%
		String desenvolvido = "Desenvolvido por (SEU NOME AQUI)";
	%>
	<%=desenvolvido%>
	<br />
	<%
		System.out.println("Tudo foi executado!");
	%>		
</body>
</html>
