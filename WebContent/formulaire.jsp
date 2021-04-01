<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Rechercher un Etudiant</title>
</head>
<body>
<%@include file="menu.jsp" %></br></br>
	<form action="EtudiantServlet" >
		Veuillez saisir votre numero d'etudiant :
		<input name="numEtudiant"></input><br>
		<input type="submit" value="Valider"></input>
	</form>
</body>
</html>