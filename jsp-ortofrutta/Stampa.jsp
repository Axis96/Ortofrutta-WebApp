<%@page import="it.dstech.ortofrutta.Prodotto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="css/style.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
<title>Esposizione Ortofrutta</title>
</head>
<body>

<%List<Prodotto> listaProdotti = (List<Prodotto>)request.getAttribute("lista"); 
for(Prodotto p : listaProdotti){
%>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>


<h2>Esposizione Ortofrutta</h2>

<table>
  <tr>
    <th>Prodotto</th>
    <th>Prezzo</th>
    <th>Quantità in magazzino</th>
    <th>Descrizione</th>
  </tr>
  <tr>
    <th><%=p.getNome()%></th>
    <th><%=p.getPrezzo()%></th>
    <th><%=p.getQuantitàResidua()%></th>
    <th><%=p.getDescrizione()%></th>
  </tr>
</table>

<% } %>

<form action="Homepage">
<input type="submit" value="Torna in home"> </form>
</body>
</html>