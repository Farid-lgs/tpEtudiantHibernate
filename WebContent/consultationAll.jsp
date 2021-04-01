<%@page import="persistence.entites.Etudiant, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="style.css" />
		<title>Listing</title>
	</head>
	
	<body>
	<%@include file="menu.jsp" %><br>
	
	 <% List<Etudiant> listEtudiant= (ArrayList<Etudiant>) request.getAttribute("listEtudiant"); %>
	 <table>
    <thead>
        <tr>
            <th colspan="4">Liste d'etudiant</th>
        </tr>
        <tr>
            <th> Numero d etudiant </th>
            <th> Nom </th>
            <th> Prenom </th>
            <th> Moyenne </th>
        </tr>
    </thead>
     	<tbody>
	 	<% for(Etudiant etu : listEtudiant) {
	  		out.print("<tr><td>"+ etu.getNumEtudiant()+"</td>");
	  		out.print("<td>"+ etu.getNom()+"</td>");
	  		out.print("<td>"+ etu.getPrenom() +"</td>");
	  		out.println("<td>"+ etu.getMoyenne()+"</td></tr>");
	 	}%>
	  </tbody>
	</table>
	</body>
</html>