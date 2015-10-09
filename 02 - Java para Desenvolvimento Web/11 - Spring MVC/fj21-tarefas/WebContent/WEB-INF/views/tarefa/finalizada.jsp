<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<td>${tarefa.id}</td>
<td>${tarefa.descricao}</td>
<td>Finalizada</td>
<td><fmt:formatDate value="${tarefa.dataFinalizacao.time}"
pattern="dd/MM/yyyy" /></td>
<td id='removetar_${tarefa.id}'><a href="#" onClick="removerAgora(${tarefa.id})">Remover agora!</a></td>
<td><a href="mostraTarefa?id=${tarefa.id}">Alterar</a></td>