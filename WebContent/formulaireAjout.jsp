<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Formulaire d'ajout</title>
</head>
<body>
<%@include file="menu.jsp" %></br></br>
<form action="EtudiantAjoutServlet">
	numero d'etudiant = 
	<input type="text" name="numEtudiant"></input></br>
	nom = 
	<input type="text" name="nom"></input></br>
	prenom = 
	<input type="text" name="prenom"></input></br>
	moyenne = 
	<input type="text" name="moyenne"></input></br>
	
	<input type="submit" value="Ajouter"></input>
	</form>
</body>
</html>