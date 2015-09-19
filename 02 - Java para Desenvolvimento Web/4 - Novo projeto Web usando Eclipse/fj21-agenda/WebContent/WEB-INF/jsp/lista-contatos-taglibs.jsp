<html>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

	<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
		
	<table width="100%" border="1px" bgcolor="#CCC">
		<tr>
			<th width="25%" height="40">NOME</th>
			<th width="25%">EMAIL</th>
			<th width="25%">ENDERECO</th>
			<th width="25%">DATA NASCIMENTO</th>
		</tr>
		<!--  percorre contatos montando as linhas da tabela -->
		<c:forEach var="contato" items="${contatos}">
			<tr>
				<td>${contato.nome}</td>
				<td><c:if test="${not empty contato.email }">
						<a href="mailto:${contato.email}">${contato.email}</a>
					</c:if> <c:if test="${empty contato.email}">
							E‐mail nao informado
						</c:if></td>

				<td>${contato.endereco}</td>
				<td><fmt:formatDate value="${contato.dataNascimento.time}"
						pattern="dd/MM/yyyy" /></td>
				<td><a href="mvc?logica=RemoveContatoLogic&id=${contato.id}"> <img src="<c:url value="/imagens/excluir.png"/>" /></a>
				<td><a href="mvc?logica=AlteraContatoLogic&id=${contato.id}"> <img src="<c:url value="/imagens/alterar.png"/>" /></a>				
				
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="mvc?logica=AdicionaContatoLogic"> <img src="<c:url value="/imagens/salvar.png"/>" />
	<c:import url="/WEB-INF/jsp/rodape.jsp" />
</body>
</html>