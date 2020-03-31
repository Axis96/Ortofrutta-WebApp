<%@page import="it.dstech.ortofrutta.Prodotto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="css/style.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
<title>Rimozione prodotto</title>
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

<form action="RimuoviProdotto">
   <label for="idProdotto">Seleziona il prodotto da rimuovere</label><br>
  <p>NomeProdotto : <select name = "idProdotto">
 
	<%for(Prodotto p : listaProdotti){%>
		<option value =<%=p.getId()%> > <%=p.getId()%> <%=p.getNome()%>
	<% } %>
	</select></p>
    <input type="submit" value="Rimuovi">
</form>
	<% } %>
<a href="http://localhost:8080/servlet-ortofrutta/Homepage?scelta=1" 
onMouseOver="self.status=document.referrer;return true">
Torna indietro</a>

</div>
</body>
</html>