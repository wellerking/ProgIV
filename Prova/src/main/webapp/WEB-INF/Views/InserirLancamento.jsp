<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prova Inserir Lancamento</title>
</head>
<body>
	<form:form modelAttribute="">
		<form:label path="Lancamento.data">Data do Lancamento:</form:label>
		<form:input path="Lancamento.data" type="date"/>
		
		<form:label path="Lancamento.descricao">Descricao:</form:label>
		<form:input path="Lancamento.descricao"/>
		
		<form:label path="Lancamento.valor">Valor:</form:label>
		<form:input path="Lancamento.valor"/>
		
		<form:label path="Lancamento.tipo">Tipo:</form:label>
		<form:radiobutton path="Lancamento.tipo"/>Entrada
		<form:radiobutton path="Lancamento.tipo"/>Saida
		
		<input type="submit" value="salvar">
	</form:form>
</body>
</html>