<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href="resources/css/jquery-ui.css" rel="stylesheet">
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/jquery-ui.js"></script>
<title>Alterar Tarefa</title>
</head>
<body>
		
	<h3>Alterar tarefa - ${tarefa.id}</h3>
	<form action="alteraTarefa" method="post">
		<input type="hidden" name="id" value="${tarefa.id}" />
		Descrição:<br />
		<textarea name="descricao" cols="100" rows="5">
			${tarefa.descricao}
		</textarea>
		<br />
		Finalizado? 
		<input type="checkbox" name="finalizado" value="true" ${tarefa.finalizado? 'checked' : '' }/> 
		<br/>Data de finalização:		<br/> 
		<caelum:campoData id="${tarefa.dataFinalizacao.time}"/>		
			value="<fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy" />" 		
		<br />
		<input type="submit" value="Alterar"/>
	</form>
</body>
</html>