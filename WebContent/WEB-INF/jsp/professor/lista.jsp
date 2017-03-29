<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/goodparty.css"/>" rel="stylesheet" type="text/css" media="screen" />
		<link href="<c:url value="/css/jquery-ui.css"/>" rel="stylesheet" type="text/css" media="screen" />
		<link href="<c:url value="/css/jquery-theme.css"/>" rel="stylesheet" type="text/css" media="screen" />
		<link href="<c:url value="/css/jquery-structure.css"/>" rel="stylesheet" type="text/css" media="screen" />
		<script type="text/javascript" src="<c:url value="/js/jquery-3.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/js/jquery-ui.js"/>"></script>
</head>
<body>
<table>
<thead>
<tr>
<td>Id </td>
<td>Nome </td>
<td>Data de Nascimento </td>
<td>Endereço do Professor </td>
<td>Telefone </td>
<td>Observação </td>
<td>Alterar </td>
<td>Remover </td>
</tr>
</thead> 
<tbody>
<c:forEach items="${professorList}" var="professor">
<tr>
<td>${professor.id} </td>
<td>${professor.nomeProfessor} </td>
<td> <fmt:formatDate value="${professor.dataNascimento.time}" pattern="dd/MM/yyyy"/> </td>
<td>${professor.enderecoProfessor} </td>
<td>${professor.telefoneProfessor}</td>
<td>${professor.obs}</td>
<td>
<a href="<c:url value="/professor/${professor.id}"         />">Alterar</a>
</td>
<td>
<form action="<c:url value="/professor/${professor.id}"         />"   method="POST">
<button class="link" name="_method"class="link" value="DELETE" >Remover</button>
</form>
</td>
</tr>
</c:forEach>

</tbody>
</table>
</body>
</html>