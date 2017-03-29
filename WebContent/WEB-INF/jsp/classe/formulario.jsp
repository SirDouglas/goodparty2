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
<div id="main">
<form action="<c:url value="/classe"  />" method="POST" id="classesForm">
<fieldset>
<legend>Cadastra Classes</legend>
<label for="nome">Nome da classe:</label>
<input id="nome" type="text" name="classe.nomeClasse" class="required" value="${classe.nomeClasse}" /> <br />
<label for="categoria">Categoria da classe:</label>
<input type="text" name="classe.categoriaClasse" class="required" value="${classe.categoriaClasse}"    /> <br />
<label for="horario">Horario da classe </label> 
 <input type="text" name="classe.horarioClasse" class="required" value="${classe.horarioClasse}"  /> <br />
<button type="submit">Enviar</button>
</fieldset>
</form>
<script type="text/javascript">
jQuery.extend(jQuery.validator.messages, {
	required: "Este campo é requerido",
	minlength:  jQuery.validator.format("Este campo tem quer ter mais que {0} caracteres")
	});
  $('#classesForm').validate();
</script>
</div>
</body>
</html>