<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Xworkz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">Cricket</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				
				<li class="nav-item"><a class="nav-link" href="Stadium.jsp">Stadium</a>
				</li>


			</ul>
		</div>
	</div>
</nav>

<h3 style=" text-align:center;">
Tournament name:${dto.name}<br>
Host Country:${dto.host}<br>
Date:${dto.date}<br>
Team 1:${dto.team1}<br>
Team 2:${dto.team2}<br>
Captain 1:${dto.captain1}<br>
Captain 2:${dto.captain2}<br>
Umpire:${dto.umpire}<br>
Stadium:${dto.stadium}<br>
Third Umpire:${dto.umpire3}<br>
Capacity:${dto.capacity}<br>
Is Saved!!!!!
</h3>







	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>