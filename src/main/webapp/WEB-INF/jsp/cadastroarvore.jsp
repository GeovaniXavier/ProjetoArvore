<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Formul�rio de cadastro!</h1>
	<form action="/cadastroarvore" method="post">
		<label for="name">Especie: </label> 
		<input name="especie" type="text" id="especie" placeholder="Especie"> 
		<label for="especie">Data Plantio: </label> 
		<input type="text" name="dataPlantio" id="especie" placeholder="Data Plantio"><br>
		<br> 
		
		<label for="name">� frutifera: </label> 
		
		<label for="Sim">Sim</label>
		<input type="radio" id="Sim" name="eFrutifera" value="true"/>
				
		<label for="N�o">N�o</label>
		<input type="radio" id="N�o" name="eFrutifera" value="false"/>
		
		<br> <br> 
		
		
		<input type="submit" value="Cadastrar!">
	</form>
</body>
</html>