<%@page import="java.util.HashMap"%>
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


<CENTER>
	<h2>Carrello</h2>
</CENTER>
<table>
	<tr>
		<th><CENTER>Prodotto</CENTER></th>
		<th><CENTER>Prezzo</CENTER></th>
		<th><CENTER>Quantità in magazzino</CENTER></th>
		<th><CENTER>Descrizione</CENTER></th>
		<th><CENTER>Carrello</CENTER></th>
	</tr>

	<%List<Prodotto> listaProdotti = (List<Prodotto>)request.getAttribute("lista"); 
 
  for(Prodotto p : listaProdotti){
%>

	<tr>
		<th><CENTER><%=p.getNome()%></CENTER></th>
		<th><CENTER><%=p.getPrezzo()%></CENTER></th>
		<th><CENTER><%=p.getQuantitàResidua()%></CENTER></th>
		<th><CENTER><%=p.getDescrizione()%></CENTER></th>
		<CENTER>
			<form action="AggiungiCarrello">

				<th><p>
						<select name=<%=p.getId()%>>
							<%for(int i=0; i<=p.getQuantitàResidua(); i++){%>

							<option value=<%=i%>>
								<%=i%>

								<% } %>
							
						</select>
					</p>
		</CENTER>
		</th>
	</tr>
	<% } %>
</table>

<CENTER>
	<input type="submit" value="Acquista dal carrello">
</CENTER>
</form>

<CENTER>
	<a href="http://localhost:8080/servlet-ortofrutta/"
		onMouseOver="self.status=document.referrer;return true"> Torna
		indietro</a>
</CENTER>
</body>
</html>