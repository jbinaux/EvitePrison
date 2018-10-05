<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<form action="FormulaireLicence" method="post">
		<div class="form-group">
			<label for="nom">Nom</label> <input type="text" class="form-control"
				id="nom" placeholder="Entrez votre nom" name="nom">
		</div>
		<div class="form-group">
			<label for="Categorie">Categorie</label> <input type="text"
				class="form-control" id="Categorie" name="categorie">
		</div>
		<div class="form-group">
			<label for="Type">Type</label> <input type="text"
				class="form-control" id="Type" name="type">
		</div>
		<div class="form-group">
			<label for="Compatibilite">Compatibilite</label> <input type="text"
				class="form-control" id="Compatibilite" name="compatibilite">
		</div>
		<div class="form-group">
			<label for="Droits">Droits</label> <input type="text"
				class="form-control" id="Droits" name="droits">
		</div>
		<div class="form-group">
			<label for="Description">Description</label>
			<textarea type="text" class="form-control" id="Description" name="description"></textarea>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>