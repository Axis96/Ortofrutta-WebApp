<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="css/style.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
<title>Sito di Ortofrutta</title>
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

<h1>CASSA</h1>

Da qui puoi gestire la cassa dell'ortofrutta.<br>


Seleziona un'opzione:

<form action="Cassa"><br>
  <input type="radio" id="acquisto" name="scelta" value="1">
  <label for="acquisto"><B>Effettua un acquisto</B></label>: dopo aver inserito i dati del prodotto, rimuove la quantità richiesta e restituisce il costo della spesa<br>  
  <input type="radio" id="stampa" name="scelta" value="2">
  <label for="stampa"><B>Controlla magazzino</B></label>: stampa i prodotti rimasti nel magazzino <br> 
  <input type="submit" class = "button" value="Esegui" /> 
</form>

<a href="javascript:history.go(-1)" 
onMouseOver="self.status=document.referrer;return true">
Torna indietro</a>
<% } %>
</div>
</body>
</html>