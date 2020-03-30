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

<CENTER><h1>Benvenuto nel negozio di Ortofrutta!</h1>

Da qui puoi gestire il tuo sito di ortofrutta.<br>

 </CENTER>
Seleziona un'opzione:

<form action="Homepage"><br>
  <input type="radio" id="magazzino" name="scelta" value="1">
  <label for="magazzino"><B>Entra nel magazzino</B></label>: controlla e gestisci i prodotti presenti nel magazzino <br>
  
  <input type="radio" id="cassa" name="scelta" value="2">
  <label for="cassa"><B>Cassa</B></label>: effettua un acquisto per conto di un cliente<br> 
  <input type="radio" id="clienti" name="scelta" value="3">
  <label for="clienti"><B>Registro clienti</B></label>: controlla e gestisci la lista dei clienti e ciò che hanno acquistato<br><br>
  <input type="submit" class = "button" value="Esegui" /> 
</form>

<% } %>

</div>
</body>
</html>