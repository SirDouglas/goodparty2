<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/goodparty.css"/>" rel="stylesheet" type="text/css" media="screen" />
		<link href="<c:url value="/css/jquery-ui.css"/>" rel="stylesheet" />
		<link href="<c:url value="/css/jquery-theme.css"/>" rel="stylesheet"  />
		<link href="<c:url value="/css/jquery-structure.css"/>" rel="stylesheet"  />
		<script src="<c:url value="/js/jquery-3.js"/>"></script>
		<script  src="<c:url value="/js/jquery-ui.js"/>"></script>
		<script  src="<c:url value="/js/jquery.validate.js"/>"></script>
		<script  src="<c:url value="/js/additional-methods.js"/>"></script>
</head>
<body>
<form id="classesForm" action="<c:url value="/classe/${classe.id}"/>" method="POST" > 
<fieldset>
<legend>Editar Classe</legend>
<input type="hidden" name="classe.id"  value="${classe.id}"      />
<label for="nome">Nome da classe </label> 
<input type="text" id="nome" class="required" name="classe.nomeClasse"  value="${classe.nomeClasse}"       /> <br />
<label for="categoria">Categoria da Classe </label>
<input type="text" class="required" name="classe.categoriaClasse" value="${classe.categoriaClasse}" /> <br />
<label for="horario">Horario da Classe </label> 
<input type="text" class="required" name="classe.horarioClasse" value="${classe.horarioClasse}" /> <br>
<button type="submit" name="_method" value="PUT">Alterar</button>
</fieldset>
</form>
<script type="text/javascript">
  $('#classesForm').validate();
</script>
</body>
</html>