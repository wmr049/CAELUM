<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<script type="text/javascript" src="resources/js/jquery.js"></script>
	<title>Tarefas</title>
</head>
<body>

	<c:import url="/WEB-INF/views/tarefa/cabecalho.jsp" />
	
	<script type="text/javascript">
		function finalizaAgora(id) {
			$.post("finalizaTarefa", {'id' : id}, function(resposta) {				
				$("#tarefa_"+id).html(resposta);								
			});
		}
	</script>
	
	<script type="text/javascript">
		function removerAgora(id) {
			$.post("removeTarefaAjax", {'id' : id}, function() {				
				$('#removetar_'+id).parent().remove();
			});
		}
	</script>
	
	<table id="tabelaTarefas">
		<tr>
			<th>Id</th>
			<th>Descrição</th>
			<th>Finalizado?</th>
			<th>Data de finalização</th>
			<th>Excluir</th>			
			<th>Alterar</th>
		</tr>
		<c:forEach items="${tarefas}" var="tarefa">
			<tr id="tarefa_${tarefa.id }" >
				<td>${tarefa.id}</td>
				<td>${tarefa.descricao}</td>
				<c:if test="${tarefa.finalizado eq false}">
					<td>
						<a href="#" onClick="finalizaAgora(${tarefa.id})">
							Finalizar
						</a>
					</td>
				</c:if>
				<c:if test="${tarefa.finalizado eq true}">
					<td>Finalizado</td>
				</c:if>
				<td>
					<fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy" />
				</td>
								
							
				<td id='removetar_${tarefa.id}'><a href="#" onClick="removerAgora(${tarefa.id})">Remover agora!</a></td>								
				<td><a href="mostraTarefa?id=${tarefa.id}">Alterar</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<br />
	<br />
	<a href="novaTarefa">Criar nova tarefa</a>
	<c:import url="/WEB-INF/views/tarefa/rodape.jsp" />
</body>
</html>