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
	border: 1px solid #ccc;
	border-radius: 3px;
}

input[type="number"], select {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

input[type="date"], select {
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

input[type="reset"] {
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

input[type="checkbox"], select {
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
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img
				src="https://www.x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="Bootstrap" width="60" height="40"></a>
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
					<li class="nav-item"><a class="nav-link" href="#">Enquiry</a>
					</li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Dropdown </a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Something else
									here</a></li>
						</ul></li>
					<li class="nav-item"><a class="nav-link disabled"
						aria-disabled="true">Disabled</a></li>
				</ul>
				<form class="d-flex" role="search">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>
	<form id="form" name="form" method="post"  action="enq"
		onclick="return validate()">
		<div class="container">

			<span id="valid" style="color: red"></span> 
			Name <input type="text"
				id="name" name="name" class="form-control" onchange="handleName()" />
			<span id="nameError" style="color: red"></span><br> 
			
			Mobile Number<input type="number" id="number" name="number"
				class="form-control" onchange="handleNumber()" /> 
				<span id="errorNumber" style="color: red"></span><br>
			
		    Email<span
				id="errorEmail" style="color: red"></span><input type="email"
				id="email" name="email" class="form-control" /> 
				 
			Date of Birth<span id="errorDate"
				style="color: red"></span><br> <input type="date" id="date"
				name="date" class="form-control" required="required" />



			Location<span id="errorLocation" style="color: red"></span> <input
				type="text" id="location" name="location" class="form-control"
				onchange="handleLocation()" /> 
				
			Password<input type="password"
				id="pass" name="pass" class="form-control" onchange="handlePass()" />
			<span id="errorPass" style="color: red"></span><br> 
			
			Confirm Password<input type="password" id="confirm" name="confirm"
				class="form-control" onchange="handleConf" /> <span
				id="errorConf" style="color: red"></span><br> 
 			
			<div class="g-recaptcha"
						data-sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI" id="recaptch" onblur="recaptchaCallback()"></div>
						<span id="errorCaptcha"></span><br>
			<input type="reset" value="cancel" /><br>

			<input type="submit" value="Submit" id="submit"
				class="btn btn-success px-5 py-2" disabled="disabled" />
				</div>
				
</form>

<script>
function validate(){
	var name = document.getElementById("name").value;
	var number = document.getElementById("number").value;
	var date = document.getElementById("date").value;
	var location = document.getElementById("location").value;
	var password = document.getElementById("pass").value;
	var confirm = document.getElementById("confirm").value;
	var robo=grecaptcha.getResponse();
	console.log(robo.length);
	
	var emailInput = document.getElementById("email");
	var errorEmail = document.getElementById("errorEmail");
	var email =document.getElementById("email");
	var emailPattern = /^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}$/;
	
	var button = document.getElementById("submit");
	
	
	if (name.length < 4 || name.length > 20) {
		document.getElementById("nameError").innerHTML = "Please enter the name here.."
		return false;
	}
	else{
		document.getElementById("nameError").innerHTML ="";
	}
	

	if (number<1000000000 || number>9999999999) {
		document.getElementById("errorNumber").innerHTML = "Please enter the name here.."
			return false;
	}
	else{
		document.getElementById("errorNumber").innerHTML ="";
	}

	
	if (location.length < 4 || location.length >20) {
		document.getElementById("errorLocation").innerHTML = "Please enter  here.."
			return false;
	}
	else{
		document.getElementById("errorLocation").innerHTML ="";
	}
	
	if (password.length < 4 || password.length === "") {
		document.getElementById("errorPass").innerHTML = "Please enter here.."
			return false;
	}
	else{
		document.getElementById("errorPass").innerHTML ="";
	}
	
	if (confirm.length < 4 || confirm!=password) {
		document.getElementById("errorConf").innerHTML = "password doesnt match"
		return false;
	}
	else{
		document.getElementById("errorConf").innerHTML ="";
	}
	
	if(date==null){
		document.getElementById("errorDate").innerHTML="enter the date"
		return false;
	}
	else{
		document.getElementById("errorDate").innerHTML=""
	}
	
	if(robo.length===0){
		document.getElementById("errorCaptcha").innerHTML = "click me"
			return false;
	}else{
		document.getElementById("errorCaptcha").innerHTML = ""

	}

	
	
}


function handleName(event){
var name=document.getElementById("name");
var btn=document.getElementById("submit");

if(name.length>4 && name.length<20){
	document.getElementById("nameError").innerHTML=""
	btn.removeAttribute("disabled")
}
else{
	document.getElementById("nameError").innerHTML="Please enter valid name";
	btn.setAttribute("disabled", "");
	
}
}

function handleNumber(event){
var number=document.getElementById("number").value;
var btn=document.getElementById("submit");

if(number>1000000000 && number<9999999999){
	document.getElementById("errorNumber").innerHTML=""
		btn.removeAttribute("disabled")
}else{
	btn.setAttribute("disabled", "");
	document.getElementById("errorNumber").innerHTML = "please enter valid Host Name";
}
}

function handleLocation(event){
var location=document.getElementById("location");
var btn=document.getElementById("submit");

if(location.length>4 && location.length<20){
	document.getElementById("errorLocation").innerHTML=""
	btn.removeAttribute("disabled")
}
else{
	document.getElementById("errorLocation").innerHTML="Please enter valid location";
	btn.setAttribute("disabled", "");
	
}



}

function handlePass(event){
var pass = document.getElementById("pass").value;
var btn= document.getElementById("submit");

if (pass.length > 4 && name.length < 10) {
	document.getElementById("errorPass").innerHTML = "";
	btn.removeAttribute("disabled")

} else {
	btn.setAttribute("disabled", "");
	document.getElementById("errorPass").innerHTML = "please enter valid password";

}
}

function handleConf(event){
var conf = document.getElementById("confirm").value;
var btn= document.getElementById("submit");

if(conf==pass){
	document.getElementById("errorConf").innnerHTML="";
	btn.removerAttribute("disabled")
}else{
	btn.setAttribute("disabled", "");
	document.getElementById("errorConf").innerHTML = "password doesnt match";	
}
}

function handleCheck() {
var checkbox = document.getElementById("check");
var errorCheck = document.getElementById("errorCheck");
var btn= document.getElementById("submit");

if (checkbox.checked) {
    // Checkbox is checked, no error.
    errorCheck.textContent = "";
    btn.removeAttribute("disabled")
} else {
    // Checkbox is not checked, display an error message.
    btn.setAttribute("disabled", "");
    errorCheck.textContent = "You must check the 'I am not a robot' box.";
}
}

function validateEmail() {
    var emailInput = document.getElementById("email");
    var errorEmail = document.getElementById("errorEmail");
    var btn= document.getElementById("submit");
    var email = emailInput.value;

    // Regular expression to match a valid email format
    var emailPattern = /^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}$/;

    if (emailPattern.test(email)) {
        // Valid email format, clear the error message
        errorEmail.innerHTML = "";
        btn.removeAttribute("disabled")
    } else {
        // Invalid email format, display an error message
        btn.setAttribute("disabled", "");
        errorEmail.innerHTML = "Please enter a valid email address";
    }
}

function handleDate(){
	var date=document.getElementById("date");
	var btn= document.getElementById("submit");
	if(date==""){
		 btn.setAttribute("disabled", "");
		 document.getElementById("errorDate").innerHTML = "enter the date";
	     
	}
	else{
		btn.removeAttribute("disabled")
		document.getElementById("errorDate").innerHTML =""
		
	}
}

// Callback function to be called when reCAPTCHA is completed


</script>

<script>
function recaptchaCallback() {
	var captch=getElementById("recaptch").value;
	
    var btn= document.getElementById("submit");
    
    if(captch.length==0){
    	 btn.setAttribute("disabled", "");
    	 console.log("it is invalid")
		 document.getElementById("errorCaptcha").innerHTML = "didnt clicked";
    }
    else{
    	btn.removeAttribute("disabled")
    	console.log("it is valid")
		document.getElementById("errorCaptcha").innerHTML =""
    }
}


</script>

<script>
        const emailInput = document.getElementById('email');
        const errorEmail = document.getElementById('errorEmail');

        emailInput.addEventListener('blur', validateEmail);

        function validateEmail() {
        	var btn= document.getElementById("submit");
            const email = emailInput.value;
            const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

            if (!emailPattern.test(email)) {
                errorEmail.textContent = 'Invalid email address';
                emailInput.style.border = '1px solid red';
                btn.setAttribute("disabled", "");
            } else {
                errorEmail.textContent = '';
                emailInput.style.border = '';
                btn.removeAttribute("disabled")
            }
        }
        
       
    </script>




<script src='https://www.google.com/recaptcha/api.js'></script>

<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

</body>
</html>