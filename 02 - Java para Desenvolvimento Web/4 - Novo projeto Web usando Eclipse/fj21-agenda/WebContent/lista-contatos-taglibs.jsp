<html>
	<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
	
	<c:import url="cabecalho.jsp"/>
		
	<!-- cria o DAO -->
	<jsp:useBean id="dao" class="br.com.caelum.agenda.dao.ContatoDao"/>
		<table width="100%" border="1px" bgcolor="#CCC">
			<tr>
				<th width="25%" height="40">NOME</th>
				<th width="25%">EMAIL</th>
				<th width="25%">ENDERECO</th>
				<th width="25%">DATA NASCIMENTO</th>				
			</tr>
			<!--  percorre contatos montando as linhas da tabela -->
			<c:forEach var="contato" items="${dao.lista}">			
				<tr>
					<td>${contato.nome}</td>
					<td>
						<c:if test="${not empty contato.email }">
							<a href="mailto:${contato.email}">${contato.email}</a>
						</c:if>
						<c:if test="${empty contato.email}">
							E‐mail nao informado
						</c:if>
					</td>
					
					<td>${contato.endereco}</td>
					<td><fmt:formatDate value="${contato.dataNascimento.time}"
						pattern="dd/MM/yyyy" /></td>
				</tr>
			</c:forEach>
		</table>
		<c:import url="rodape.jsp"/>
	</body>
</html>