<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
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
 input[type="date"],
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
        
      

    </style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">X-Workz</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home
				</a></li>
				
		</div>
	</nav>


	<form action="cricket" name="form" method="post"
		onclick="return validate()">
		<div class="container">

			<span id="valid" style="color: red"></span>
					Tournament Name <input type="text" id="name" name="tournamentName"
						placeholder="Tournament Name" class="form-control"
						onchange="handleName()" /> <span id="nameError"
						style="color: red"></span><br>
				
				
					Hosting Country<input type="text" id="host" name="host"
						placeholder="Hosting Country" class="form-control"
						onchange="handleHost()" /> <span id="errorHost"
						style="color: red"></span><br>
				
			
		

			
					Match Date <span id="errorDate" style="color: red"></span><input
						type=number id="date" name="date" placeholder="Match Date"
						class="form-control" onchange="dateHandle()" />

				
					Team 1 <span id="errorTeam1" style="color: red"></span><br> <input
						type="text" id="team1" name="team1" placeholder="Team 1  name"
						class="form-control" onchange="team1Handle()" />
				

			
					Team 2 <span id="errorTeam2" style="color: red"></span> <input
						type="text" id="team2" name="team2" placeholder="Team 2  name"
						class="form-control" onchange="team2Handle()" />

				
					Team1 Captain Name<input type="text" id="captain1" name="captain1"
						placeholder="Team 1 captain name" class="form-control"
						onchange="cap1Handle()" /> <span id="errorCap1"
						style="color: red"></span><br>
				
			
					Team2 Captain Name<input type="text" id="captain2" name="captain2"
						placeholder="Team 2 captain name" class="form-control"
						onchange="cap2Handle()" /> <span id="errorCap2"
						style="color: red"></span><br>
				
					Umpire Name<input type="text" id="umpire" name="umpire"
						placeholder="Umpire Name" class="form-control"
						onchange="umpHandle()" /> <span id="errorUmp" style="color: red"></span><br>
				
			


			
					Stadium Name<input type="text" id="stadium" name="stadium"
						placeholder="Stadium Name" class="form-control"
						onchange="stadHandle()" /> <span id="errorStad"
						style="color: red"></span><br>
				
					Third Umpire Name<input type="text" id="umpire3" name="3umpire"
						placeholder="3rd Umpire Name" class="form-control"
						onchange="ump3Handle()" /> <span id="errorUmp3"
						style="color: red"></span><br>
				
			
					Stadium Capacity<input type="number" id="capacity" name="capacity"
						placeholder="Stadium Capacity" required="required"
						class="form-control" onchange="capHandle()"/><span id="errorCap"
						style="color: red"></span><br>
				
			
				<input type="submit" value="Submit" id="submit"
					class="btn btn-success px-5 py-2" />
			
	</form>

	<script>
	
	function validate(){
		var name = document.getElementById("name").value;
		var host = document.getElementById("host").value;
		var date = document.getElementById("date").value;
		var team1 = document.getElementById("team1").value;
		var team2 = document.getElementById("team2").value;
		var captain1 = document.getElementById("captain1").value;
		var captain2 = document.getElementById("captain2").value;
		var umpire = document.getElementById("umpire").value;
		var stadium = document.getElementById("stadium").value;
		var umpire3 = document.getElementById("umpire3").value;
		var capacity = document.getElementById("capacity").value;
		
		var button = document.getElementById("submit");
		
		
		if (name.length < 4 || name.length > 20) {
			document.getElementById("nameError").innerHTML = "Please enter the name here.."
			return false;
		}
		else{
			document.getElementById("nameError").innerHTML ="";
		}

		if (host.length < 4 || host === "") {
			document.getElementById("errorHost").innerHTML = "Please enter the name here.."
				return false;
		}
		else{
			document.getElementById("errorHost").innerHTML ="";
		}

		if(date > 0 && date < 32){
			document.getElementById("errorDate").innerHTML = ""
				
		}
		else{
			document.getElementById("errorDate").innerHTML ="Please enter Date here..";
			return false;
		}

		if (team1.length < 4 || team1.length === "") {
			document.getElementById("errorTeam1").innerHTML = "Please enter  here.."
				return false;
		}
		else{
			document.getElementById("errorTeam1").innerHTML ="";
		}
		
		if (team2.length < 4 || team2.length === "") {
			document.getElementById("errorTeam2").innerHTML = "Please enter here.."
				return false;
		}
		else{
			document.getElementById("errorTeam2").innerHTML ="";
		}
		
		if (captain1.length < 4 || captain1 == "") {
			document.getElementById("errorCap1").innerHTML = "Please enter the Captain 1 Name here.."
				return false;
		}
		else{
			document.getElementById("errorCap1").innerHTML ="";
		}
		
		if (captain2.length < 4 || captain2 === "") {
			document.getElementById("errorCap2").innerHTML = "Please enter the Captain  Name here.."
				return false;
		}
		else{
			document.getElementById("errorCap2").innerHTML ="";
		}
		
		if (umpire.length < 4 || umpire === "") {
			document.getElementById("errorUmp").innerHTML = "Please enter the umpire name here.."
				return false;
		}
		else{
			document.getElementById("errorUmp").innerHTML ="";
		}

		if (stadium.length < 4 || stadium === "") {
			document.getElementById("errorStad").innerHTML = "Please enter the stadium name here.."
				return false;
		}
		else{
			document.getElementById("errorStad").innerHTML ="";
		}
		
		if (umpire3.length < 4 || umpire3 == "") {
			document.getElementById("errorUmp3").innerHTML = "Please enter the 3rd umpair name here.."
			return false;
		}	
		else{
			document.getElementById("errorUmp3").innerHTML ="";
		}
		
		 button.removeAttribute('submitButton');
			return true;
	
	}

		function handleName(event) {

			var tName = document.getElementById("name");
			var btn= document.getElementById("submit");

			if (tName.value.length > 3 && tName.value.length < 20) {
				document.getElementById("nameError").innerHTML = ""
				btn.removeAttribute("disabled")
			} 
			
			else {
				document.getElementById("nameError").innerHTML = "Please enter the valid  name here..";
				btn.setAttribute("disabled", "");
				return;
			}

		}

		function handleHost(event) {

			var hName = document.getElementById("host").value;
			var btn= document.getElementById("submit");

			if (hName.length > 3 && hName.length < 20) {
				document.getElementById("errorHost").innerHTML = "";
				btn.removeAttribute("disabled")

			} else {
				btn.setAttribute("disabled", "");
				document.getElementById("errorHost").innerHTML = "please enter valid Host Name";

			}

		}

		function dateHandle(event) {

			var date = document.getElementById("date").value;
			var btn= document.getElementById("submit");

			if (date.value <0 && date.value>31) {
				document.getElementById("errorDate").innerHTML = "please enter valid Host Name";
				btn.setAttribute("disabled", "");
			}
			else{
				
				btn.removeAttribute("disabled")
				document.getElementById("errorDate").innerHTML = "please enter valid Host Name";
			}

		}

		function team1Handle(event) {

			var name = document.getElementById("team1").value;
			var btn= document.getElementById("submit");

			if (name.length > 3 && name.length < 20) {
				document.getElementById("errorTeam1").innerHTML = "";
				btn.removeAttribute("disabled")

			} else {
				btn.setAttribute("disabled", "");
				document.getElementById("errorTeam1").innerHTML = "please enter valid Name";

			}

		}

		function team2Handle(event) {

			var name = document.getElementById("team2").value;
			var btn= document.getElementById("submit");

			if (name.length > 3 && name.length < 20) {
				document.getElementById("errorTeam2").innerHTML = "";
				btn.removeAttribute("disabled")

			} else {
				btn.setAttribute("disabled", "");
				document.getElementById("errorTeam2").innerHTML = "please enter valid Name";

			}

		}

		function cap1Handle(event) {

			var cName = document.getElementById("captain1").value;
			var btn= document.getElementById("submit");

			if (cName.length > 3 && cName.length < 20) {
				document.getElementById("errorCap1").innerHTML = "";
				btn.removeAttribute("disabled")

			} else {
				btn.setAttribute("disabled", "");
				document.getElementById("errorCap1").innerHTML = "please enter valid Name";

			}

		}
		
		function cap2Handle(event) {

			var cName = document.getElementById("captain1").value;
			var btn= document.getElementById("submit");

			if (cName.length > 3 && cName.length < 20) {
				document.getElementById("errorCap2").innerHTML = "";
				btn.removeAttribute("disabled")

			} else {
				btn.setAttribute("disabled", "");
				document.getElementById("errorCap2").innerHTML = "please enter valid Name";

			}

		}
		
		function umpHandle(event) {

			var uName = document.getElementById("umpire").value;
			var btn= document.getElementById("submit");

			if (uName.length > 3 && uName.length < 20) {
				document.getElementById("errorUmp").innerHTML = "";
				btn.removeAttribute("disabled")

			} else {
				btn.setAttribute("disabled", "");
				document.getElementById("errorUmp").innerHTML = "please enter valid  Name";

			}

		}

		function stadHandle(event) {

			var uName = document.getElementById("stadium").value;
			var btn= document.getElementById("submit");

			if (uName.length > 3 && uName.length < 20) {
				document.getElementById("errorStad").innerHTML = "";
				btn.removeAttribute("disabled")

			} else {
				btn.setAttribute("disabled", "");
				document.getElementById("errorStad").innerHTML = "please enter valid Name";

			}

		}

		function ump3Handle(event) {

			var uName = document.getElementById("umpire3").value;
			var btn= document.getElementById("submit");

			if (uName.length > 3 && uName.length < 20) {
				document.getElementById("errorUmp3").innerHTML = "";
				btn.removeAttribute("disabled")

			} else {
				btn.setAttribute("disabled", "");
				document.getElementById("errorUmp3").innerHTML = "please enter valid Name";

			}

		}
		
		function capHandle(){
			var cap=document.getElementById("capacity").value;
			var btn=document.getElementById("submit");
			
			if(cap>0){
				document.getElementById("errorCap").innerHTML="";
				btn.removeAttribute("disabled")
			}
			else{
				btn.setAttribute("disabled", "");
				document.getElementById("errorCap").innerHTML="please enter correct capacity value"
			}
		}
	</script>

</body>
</html>