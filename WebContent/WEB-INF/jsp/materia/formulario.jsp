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
		<link href="<c:url value="/css/jquery-ui.css"/>" rel="stylesheet" />
		<link href="<c:url value="/css/jquery-theme.css"/>" rel="stylesheet"  />
		<link href="<c:url value="/css/jquery-structure.css"/>" rel="stylesheet"  />
		<script src="<c:url value="/js/jquery-3.js"/>"></script>
		<script  src="<c:url value="/js/jquery-ui.js"/>"></script>
		<script  src="<c:url value="/js/jquery.validate.js"/>"></script>
		<script  src="<c:url value="/js/additional-methods.js"/>"></script>
</head>
<body>
<form id="materiaForm" action="<c:url value="/materia"   />" method="POST"> 
<fieldset>
<legend>Cadastrar Materias</legend>
<label for="nome">Nome da materia </label>
<input type="text" class="required" minLength="3" name="materia.nomeMateria" value="${materia.nomeMateria}"  /> <br />
<label for="obs">Observação</label> 
<textarea rows="5" cols="40" name="materia.obs"> ${materia.obs} </textarea> <br />
<button type="submit">Enviar</button>
</fieldset> 
</form>
<script type="text/javascript">
jQuery.extend(jQuery.validator.messages, {
	required: "Este campo é requerido",
	minlength:  jQuery.validator.format("Este campo tem quer ter mais que {0} caracteres")
	});
$('#materiaForm').validate();
</script>
</body>
</html>