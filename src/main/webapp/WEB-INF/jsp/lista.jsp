<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<table>
			<caption>
				<h3>Resultado:</h3>
			</caption>
			<thead>
				<tr>
					<td>Id</td>
					<td>Especie</td>
					<td>EFrutifera</td>
					<td>DataPlantio</td>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${arvores}" var="arvore">
					<tr>
						<td>${arvore.id}</td>
						<td>${arvore.especie}</td>
						<td>${arvore.eFrutifera ? "Sim" : "Não"}</td>
						<td>${arvore.dataPlantio}</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script src="webjars/jquery/2.2.4/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>