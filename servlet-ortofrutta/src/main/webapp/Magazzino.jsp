<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="css/style.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
<title>Magazzino</title>
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
<h1>Magazzino</h1>


Ecco le opzioni disponibili per il tuo magazzino
<form action="Magazzino">

  <input type="radio" id="aggiungi" name="scelta" value="1">
  <label for="aggiungi">Aggiungi prodotto</label><br>
  <input type="radio" id="rimuovi" name="scelta" value="2">
  <label for="rimuovi">Rimuovi prodotto</label><br>
  <input type="radio" id="modifica" name="scelta" value="3">
  <label for="modifica">Modifica caratteristiche di un prodotto</label><br>
  <input type="radio" id="stampa" name="scelta" value="4">
  <label for="stampa">Stampa la lista dei prodotti</label><br><br>
  
  <input type="submit" class = "button" value="Esegui" /> 
</form>


<a href="javascript:history.go(-1)" 
onMouseOver="self.status=document.referrer;return true">
Torna indietro</a>
<% } %>

</div>
</body>
</html>