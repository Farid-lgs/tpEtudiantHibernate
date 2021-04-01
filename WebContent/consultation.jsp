<%@page import="beans.javaBean.EtudiantBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Consultation des Resultat</title>
</head>
<body>
<%@include file="menu.jsp" %></br></br>

 <% EtudiantBean bean= (EtudiantBean) request.getAttribute("etudiantJavaBean"); %> 
 Numero d'etudiant : <%=request.getParameter("numEtudiant") %>  <br>
 Nom : <%=bean.getNom()%>  <br>
 Prenom : <%=bean.getPrenom()%>  <br>
 Moyenne : <%=bean.getMoyenne() %>  <br>
 Examen : <%=request.getAttribute("reussi") %> 

</body>
</html>