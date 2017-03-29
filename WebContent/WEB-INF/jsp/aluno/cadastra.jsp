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
<form id="alunosForm" action="<c:url value="/aluno"/>" method="POST">
<fieldset> 
<legend> Adicionar Aluno</legend>
<label for="nome">Nome:</label>
<input id="nome" class="required" minlength="3" type="text" name="aluno.nomeAluno" value="${aluno.nomeAluno}" /> <br />
<label for="pai">Nome do Pai</label>
<input id="pai"  type="text" name="aluno.paiAluno" value="${aluno.paiAluno}" /> <br />
<label for="mae">Nome da Mae</label>
<input id="mae" type="text" name="aluno.maeAluno" value="${aluno.maeAluno}" /> <br />
<label for="endereco">Endereço</label> 
<input id="endereco" type="text" name="aluno.enderecoAluno" value="${aluno.enderecoAluno}"  /> <br />
<label for="telefone">Telefone</label> 
<input id="telefone" type="text" name="aluno.telefone" value="${aluno.telefone}"  /> <br />
<label for="obs">Observação</label> <br />
<textarea rows="4" cols="50" id="obs" name="aluno.obs">
"${aluno.obs}" 
</textarea> <br />
<label for="data">Data de Nascimento</label>
<fmt:formatDate value="${aluno.dataNascimento.time}" pattern="dd/MM/yyyy"  var="data"/> 
<caelum:campoData id="dataNascimento" name="aluno.dataNascimento" value="${data}" />  <br />
<button type="submit">Enviar</button> 
</fieldset>
</form>
<script type="text/javascript">
jQuery.extend(jQuery.validator.messages, {
	required: "Este campo é requerido",
	minlength:  jQuery.validator.format("Este campo tem quer ter mais que {0} caracteres")
	});
  $('#alunosForm').validate();
</script>
</div>
</body>
</html>