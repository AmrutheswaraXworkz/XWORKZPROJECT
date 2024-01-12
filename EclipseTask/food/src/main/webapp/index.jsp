<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Song Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
<style type="text/css">
form {
	max-width: 800px;
	margin: 10px auto;
	padding: 20px;
	border: 1px solid #ccc;
	background-color: #f1c2c2;
	border-radius: 5px;
}

label {
	display: block;
	margin-bottom: 5px;
}

input[type="text"], select {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #161515;
	border-radius: 3px;
}

input[type="submit"] {
	background-color: black;
	color: #fff;
	padding: 10px 15px;
	border: none;
	border-radius: 3px;
	cursor: pointer;
}

select {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

input[type="submit"]:hover {
	background-color: olive;
}

.radio-btn {
	display: flex;
	align-items: center;
}

.radio-btn div {
	margin: 10px;
}
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg text-bg-info p-3">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp">Home</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Food</a></li>
				</ul>
				<div class="d-flex" role="search">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</div>
			</div>
		</div>
	</nav>
	
	<span style="color:red">
		<c:forEach var="objectErrors" items="${error}">
			${objectErrors.defaultMessage}<br>
		</c:forEach>
	</span>
	
	<form action="food" method="post" >
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="name" id="name"
					placeholder="Song name" value="${dto.getName()}" onchange="handleName()"/>
					<span id="nameError" style="color: red"></span><br> 
			</div>
					</div>
					
					<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="color" id="color"
					placeholder="Color " value="${dto.getColor()}" />
					 
			</div>
					</div>
					
		
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="state" id="state"
					placeholder="State" value="${dto.getState()}" />
					
			</div>
			
		</div>
		
		<div class="row">
			<div class="col">
				<input type="number" class="form-control" name="rating" id="rating"
					placeholder="Rating" value="${dto.getRating()}" />
					
			</div>
		</div>
		
		
		

		<div class="row">
			<div class="col">
				<button type="reset" class="form-control text-bg-secondary p-3">Reset</button>
			</div>
			<div class="col">
				<button type="submit" class="form-control text-bg-secondary p-3" id="submit" >Submit</button>
			</div>
		</div>
	</form>
	

</body>
</html>