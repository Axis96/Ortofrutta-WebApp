<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="css/style.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
<title>Aggiunta prodotto</title>
</head>
<body class="sfondo">
	<div>
		<% String messaggio = (String) request.getAttribute("messaggio"); 
	if (messaggio != null ){
		%>
		<h1>ERRORE</h1>
		<%=messaggio%>
		<% }
	else {
%>

		Inserisci le caratteristiche del nuovo prodotto da aggiungere:

		<form action="AggiungiProdotto">
			<label for="nome">Nome</label><br> <input type="text" id="nome"
				name="nome" value=""><br> <label for="prezzo">Prezzo</label><br>
			<input type="text" id="prezzo" name="prezzo" value=""><br>
			<label for="quantita">Quantità</label><br> <input type="text"
				id="quantita" name="quantita" value=""><br> <label
				for="descrizione">Descrizione</label><br> <input type="text"
				id="descrizione" name="descrizione" value=""><br> <input
				type="submit" value="Aggiungi"> <input type="reset">
		</form>


		<% } %>

		<a href="http://localhost:8080/servlet-ortofrutta/Homepage?scelta=1"
			onMouseOver="self.status=document.referrer;return true"> Torna
			indietro</a>


	</div>
</body>
</html>