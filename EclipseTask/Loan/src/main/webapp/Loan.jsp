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
	<style>
	form {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            background-color: aqua;
            border-radius: 5px;
        }
         input[type="text"],
        select {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        
        input[type="submit"] {
            background-color: green;
            color: #fff;
            padding: 10px 15px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
         input[type="submit"]:hover {
	        background-color:lime;
}
        
	
	</style>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">Loan Application</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link " href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="#">Loan</a>
				</li>


			</ul>
		</div>
	</div>
</nav>

<form action="apply" method="post">
Name<input type="text" name="name" placeholder="Enter the name"/>
Amount<input type="text" name="amount" placeholder="Enter the amount"/>
Working<input type="text" name="work" placeholder="Work"/>
Intrest<input type="text" name="intrest" placeholder="Enter the intrest"/>
Surety<input type="text" name="surety" placeholder="Surety Person"/>
Company<input type="text" name="company" placeholder="Company"/>
Loan Tenure<input type="text" name="tenure" placeholder="Enter Tenure"/>
<label>Loan Type</label>
<select id="text" name="type">
<option>Select</option>
<option>Home Loan</option>
<option>Vehicle Loan</option>
<option>Education Loan</option>
</select>
<input type="radio" name="yes" >
<label>Accept the terms and conditions</label><br>
<input type="submit" value="Save"/>
</form>







	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>