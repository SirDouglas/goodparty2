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
<th>Codigo </th>
<th>Nome</th>
<th>Categoria </th>
<th>Horario </th>
</tr>
</thead>
<tbody>
<c:forEach items="${classeList}" var="classe">
<tr>
<td>${classe.id } </td>
<td>${classe.nomeClasse}</td>
<td>${classe.categoriaClasse}</td>
<td>${classe.horarioClasse} </td>
<td><a href="<c:url value="/classe/${classe.id}"/>">Editar</a> </td>
<td>
<form action="<c:url value="/classe/${classe.id}"/>" method="POST">
<button class="link" name="_method"
value="DELETE">Remover</button>
</form>
</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>