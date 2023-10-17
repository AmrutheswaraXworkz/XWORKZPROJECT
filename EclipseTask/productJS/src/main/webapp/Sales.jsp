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
            background-color:gray;
            border-radius: 5px;
        }

        
        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"],
        select {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
         input[type="number"],
        select {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
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
	        background-color:olive;
}

    </style>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">Product Info</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
				


			</ul>
		</div>
	</div>
</nav>






  
<form action="send"  method="post" name="form"  onsubmit="return validate()">
Name<input type="text" id="name" name="name" placeholder="Name"/>
Type<input type="text" id="type" name="type" placeholder="Type of the Product"/>
Price<input type="number" id="price" name="price" placeholder="Enter the price" required="required"/>
Brand<input type="text" id="brand" name="brand" placeholder="Enter the Brand"/>
Quantity<input type="number" id="quantity" name="quantity" placeholder="Enter the quantity" required="required"/>
<input type="submit" value="save"/>

</form>







<script>
function validate() {
	var name=document.getElementById("name").value;
	var type=document.getElementById("type").value;
	var price=document.getElementById("price").value;
	var brand=document.getElementById("brand").value;
	var quantity=document.getElementById("quantity").value;
	
	
	
	if(  name=="" || name.length<3) {
		alert("name is invalid");
		return false;
	}

	if(   type.length<3 || type=="") {
		alert("type is invalid");
		return false;
	}
	if( price<=0  ){
		alert("price is invalid");
		return false;
	}
	if(   brand=="" || brand.length<3 ){
		alert("brand is invalid");
		return false;
	}
	if(quantity<=0){
		alert("quantity is invalid");
		return false;
	}
	
	
}

  

  
</script>






	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>