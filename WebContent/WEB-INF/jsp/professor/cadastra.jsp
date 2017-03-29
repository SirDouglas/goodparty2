<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<form id="professorForm" action="<c:url value="/professor"/>" method="POST">
<fieldset>
<legend>Cadastrar Professores</legend>
<label for="nomeProfessor">Nome do professor </label>
<input type="text" name="professor.nomeProfessor" class="required" value="${professor.nomeProfessor}"    />      <br />
<label for="endereco">Endereço do Professor</label>
<input type="text" name="professor.enderecoProfessor" value="${professor.enderecoProfessor}" />  <br />
<label for="telefone">Telefone</label>
<input  type="text" name="professor.telefoneProfessor" value="${professor.telefoneProfessor}"      /> <br  />
<label for="dataNascimento">Data de Nascimento</label>
<caelum:campoData id="dataNascimento" name="professor.dataNascimento" value="${professor.dataNascimento}"     /> <br />
<label for="obs"></label>
<textarea rows="5" cols="20" name="professor.obs">${professor.obs }</textarea> <br />
<button type="submit">Enviar</button>
</fieldset>
</form>
<script type="text/javascript">
jQuery.extend(jQuery.validator.messages, {
	required: "Este campo é requerido",
	minlength:  jQuery.validator.format("Este campo tem quer ter mais que {0} caracteres")
	});
$('#professorForm').validate();
</script>
</body>
</html>