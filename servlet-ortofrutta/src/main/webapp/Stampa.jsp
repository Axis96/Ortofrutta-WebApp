<%@page import="it.dstech.ortofrutta.Prodotto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="css/style.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
</head>
<body>


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


<CENTER><h2>Esposizione Ortofrutta</h2></CENTER>
<table>
  <tr>
    <th><CENTER>Prodotto</CENTER></th>
    <th><CENTER>Prezzo</CENTER></th>
    <th><CENTER>Quantità in magazzino</CENTER></th>
    <th><CENTER>Descrizione</CENTER></th>
  </tr>
  
<%List<Prodotto> listaProdotti = (List<Prodotto>)request.getAttribute("lista"); 
for(Prodotto p : listaProdotti){
%>

  <tr>
    <th><CENTER><%=p.getNome()%></CENTER></th>
    <th><CENTER><%=p.getPrezzo()%></CENTER></th>
    <th><CENTER><%=p.getQuantitàResidua()%></CENTER></th>
    <th><CENTER><%=p.getDescrizione()%></CENTER></th>
  </tr>


<% } %>
</table>
<form action="Homepage">
<CENTER><input type="submit" value="Torna in home"> </form></CENTER>
</body>
</html>