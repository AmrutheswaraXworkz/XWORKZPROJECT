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
<nav class="navbar navbar-expand-lg navbar-dark bg-success">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">Iyengar Bakery</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
				</li>


			</ul>
		</div>
	</div>
</nav>
<h3>
Item name:${dto.name}<br>
Item price:${dto.price1}Rs<br>
Item quantity:${dto.quantity1}<br>
Item discount:${dto.discount1}%<br>
GST:${dto.gst}%<br>
Manufactured date:${dto.mDate}<br>
Expiry date:${dto.eDate}<br>
Is saved!!!!<br>
Current date:${date}<br>
Current time:${time}<br>
Number of item is ${dto.quantity1},price per item is ${dto.price1},discount applied is ${dto.discount1}% and total is ${total}Rs!!!<br>
Thankyou Visit again :)


</h3>






	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>