<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details Application</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
<style>
form {
	max-width: 800px;
	margin: 10px auto;
	padding: 20px;
	border: 1px solid #ccc;
	background-color: gray;
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
	/* display: inline-block; */
	display: flex;
	/* flex-direction: row; */
	/* padding: 10px; */
	/* margin: 10px; */
	/* justify-content: center; */
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
			<a class="navbar-brand" href="#">Blood Details</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index.jsp">Home</a></li>
				</ul>
				<div class="d-flex" role="search">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</div>
			</div>
		</div>
	</nav>
	<h3>${msg }</h3>
	<form action="blood" method="post">  
        <div class="row">
            <div class="col">
              <input type="text" class="form-control" name="name" placeholder="Enter Your Name" aria-label="name">
            </div>
        </div>
        
        
            <div class="col">
              <input type="text" class="form-control" name="group" placeholder="Enter your blood group">
            </div>
            
             <div class="col">
              <input type="text" class="form-control" name="weight" placeholder="Enter your weight">
            </div>
       
        
        
           
         
        
      
            <div class="col">
             
           
            <div class="col">
               <h4>Age:</h4> <select name="age" class="form-control" id="ageSelect"></select>
            </div>
        </div>
        <div class="row">
            <div class="col">
              <select name="alcohol" class="form-control">
              	<option>-Alcohol-</option>
              	<option>Yes</option>
              	<option>No</option>
              	
              </select>
            </div>
            </div>
            
            <div class="row">
            <div class="col">
              <select name="sickness" class="form-control">
              	<option>-Sickness-</option>
              	<option>Yes</option>
              	<option>No</option>
              	
              </select>
            </div>
        
        
        
            
        </div>
        
        
        <div class="row">
            <div class="col">
                <button type="reset" class="form-control text-bg-secondary p-3">Reset</button>
                <!-- <input type="text" class="form-control" placeholder="First name" aria-label="First name"> -->
            </div>
            <div class="col">
                <button type="submit" class="form-control text-bg-secondary p-3">Submit</button>
              <!-- <input type="text" class="form-control" placeholder="Last name" aria-label="Last name"> -->
            </div>
        </div>
    </form>
    
    <script>
        let ageSelect = document.getElementById("ageSelect");
        let contents;

        for (let i = 1; i <= 100; i++) {
            contents += "<option>" + i + "</option>";
        }
        ageSelect.innerHTML = contents;

    </script>
</body>
</html>