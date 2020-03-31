<%@page import="it.dstech.ortofrutta.Prodotto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="css/style.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
<title>Modifica prodotto</title>
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


<%List<Prodotto> listaProdotti = (List<Prodotto>)request.getAttribute("lista");%>

<form action="ModificaProdotto">
   <label for="modify">Seleziona il prodotto da modificare</label><br>
   <select name = "modify">
 
	<%for(Prodotto p : listaProdotti){%>
		<option value ="<%=p.getNome()%>"> <%=p.getNome()%> </option>
	<% } %>
	</select>
</form>


Inserisci le nuove caratteristiche del prodotto:

<form action="ModificaProdotto">
  <label for="nome">Nome</label><br>
  <input type="text" id="nome" name="nome" value=""><br>
  <label for="prezzo">Prezzo</label><br>
  <input type="text" id="prezzo" name="prezzo" value=""><br>
  <label for="quantita">Quantità</label><br>
  <input type="text" id="quantita" name="quantita" value=""><br>
  <label for="descrizione">Descrizione</label><br>
  <input type="text" id="descrizione" name="descrizione" value=""><br>
  <input type="submit" value="Modifica">
  <input type="reset">
</form>


<% } %>


</div>
</body>
</html>