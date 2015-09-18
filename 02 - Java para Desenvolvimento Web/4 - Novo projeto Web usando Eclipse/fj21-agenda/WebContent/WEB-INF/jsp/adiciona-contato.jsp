<html xmlns="http://www.w3.org/1999/xhtml" lang="pt-br" xml:lang="pt-br">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link href="css/jquery-ui.css" rel="stylesheet">
		<script src="js/jquery.js"></script>
		<script src="js/jquery-ui.js"></script>
	</head>
	<body>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
			
		<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
		
		<form action="adicionaContato">
			Nome: <input type="text" name="nome" /><br />
			E‐mail: <input type="text" name="email" /><br />
			Endereço: <input type="text" name="endereco" /><br />
			Data Nascimento: <caelum:campoData id="dataNascimento" /><br />
			<input type="submit" value="Gravar" />
		</form>
		<c:import url="/WEB-INF/jsp/rodape.jsp" />
		
	</body>
</html>