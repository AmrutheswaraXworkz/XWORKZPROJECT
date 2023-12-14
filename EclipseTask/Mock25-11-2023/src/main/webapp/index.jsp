<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

	<form action="mock" method="post" onclick="return validate()">
	
	
		slNO : <input type="number" name="slNo" id="slNo"
			onchange="handleSlNo()" /><span id="slNoError" style="color: red"></span>
		FirstName : <input type="text" name="fName" id="fName"
			onchange="handleFName()" /><span id="fNameError" style="color: red"></span>
		MiddleName : <input type="text" name="mName" id="mName"
			onchange="handleMName()" /><span id="mNameError" style="color: red"></span>
		LastName : <input type="text" name="lName" id="lName"
			onchange="handleLName()" /><span id="lNameError" style="color: red"></span>
		E-Mail : <input type="email" name="email" id="email"
			onchange="handleEmail()" /><span id="emailError" style="color: red"></span>
		Gender : <input type="text" name="gender" id="gender"
			onchange="handleGender()" /><span id="genderError"
			style="color: red"></span> Mobile : <input type="number"
			name="mobile" id="mobile" onchange="handleMobile()" /><span
			id="mobileError" style="color: red"></span> Area : <input type="text"
			name="area" id="area" onchange="handleArea()" /><span id="areaError"
			style="color: red"></span> District :<span id="distError"
			style="color: red"></span> <select name="dist" id="dist">
			<option></option>
			<option>Chitradurga</option>
			<option>Davanagere</option>
			<option>Banglore</option>
			<option>Chickamagalur</option>
			<option>Tumkur</option>
		</select> State :<span id="stateError" style="color: red"></span> <select
			name="state" id="state">
			<option></option>
			<option>Karnataka</option>
			<option>AndraPradesh</option>
			<option>TamilNadu</option>
			<option>Kerala</option>
			<option>Goa</option>
		</select> Pincode :<input type="text" name="pin" id="pin"
			onchange="handlePincode()" /><span id="pinError" style="color: red"></span>
		<input type="submit" value="Submit" id="submit" />

	</form>
	

	<script>

function validate(){
var slNo=document.getElementById("slNo").value;
var fName=document.getElementById("fName").value;
var mName=document.getElementById("mName").value;
var lName=document.getElementById("lName").value;
var email=document.getElementById("email").value;
var gender= document.getElementById("gender").value;
var mobile=document.getElementById("mobile").value;
var area=document.getElementById("area").value;
var dist=document.getElementById("dist").value;
var state=document.getElementById("state").value;
var pin=document.getElementById("pin").value;

var button=document.getElementById("submit").value;

if (slNo.length <= 0) {
	document.getElementById("slNoError").innerHTML = "Please enter the valid Number here.."
	return false;
}
else{
	document.getElementById("slNoError").innerHTML ="";
}

if (fName.length < 4 || fName === "") {
	document.getElementById("fNameError").innerHTML = "Please enter the valid name here.."
		return false;
}
else{
	document.getElementById("fNameError").innerHTML ="";
}

if(mName.length < 4 || mName === ""){
	document.getElementById("mNameError").innerHTML ="Please enter name here..";
	return false;
		
}
else{
	document.getElementById("mNameError").innerHTML ="";
}

if (lName.length < 4 || lName === "") {
	document.getElementById("lNameError").innerHTML = "Please enter name here.."
		return false;
}
else{
	document.getElementById("lNameError").innerHTML ="";
}

if (email.length < 4 || email === "") {
	document.getElementById("emailError").innerHTML = "Please enter email here.."
		return false;
}
else{
	document.getElementById("emailError").innerHTML ="";
}

if (gender.length < 4 || gender === "") {
	document.getElementById("genderError").innerHTML = "Please enter gender here.."
		return false;
}
else{
	document.getElementById("genderError").innerHTML ="";
}

if (mobile.length != 10) {
	document.getElementById("mobileError").innerHTML = "Please enter Number here.."
		return false;
}
else{
	document.getElementById("mobileError").innerHTML ="";
}

if (area.length < 4 || area === "") {
	document.getElementById("areaError").innerHTML = "Please enter area here.."
		return false;
}
else{
	document.getElementById("areaError").innerHTML ="";
}

if (dist==="") {
	document.getElementById("distError").innerHTML = "Please select here.."
		return false;
}
else{
	document.getElementById("distError").innerHTML ="";
}

if (state=== "") {
	document.getElementById("stateError").innerHTML = "Please select here.."
		return false;
}
else{
	document.getElementById("stateError").innerHTML ="";
}

if (pin.length != 6) {
	document.getElementById("pinError").innerHTML = "Please enter pincode here.."
		return false;
}
else{
	document.getElementById("pinError").innerHTML ="";
}

button.removeAttribute('submitButton');
	return true;

}


function handleSlNo() {

	var slNo = document.getElementById("slNo");
	var btn= document.getElementById("submit");

	if (fName.value.length > 3 && fName.value.length < 20) {
		document.getElementById("slNoError").innerHTML = ""
		btn.removeAttribute("disabled")
	} 
	
	else {
		document.getElementById("slNoError").innerHTML = "Please enter the valid  slNo here..";
		btn.setAttribute("disabled", "");
		return;
	}}

function handleFName() {

	var fName = document.getElementById("fName");
	var btn= document.getElementById("submit");

	if (fName.value.length > 3 && fName.value.length < 20) {
		document.getElementById("fNameError").innerHTML = ""
		btn.removeAttribute("disabled")
	} 
	
	else {
		document.getElementById("fNameError").innerHTML = "Please enter the valid  name here..";
		btn.setAttribute("disabled", "");
		return;
	}}
	
	function handleMName() {

		var mName = document.getElementById("mName");
		var btn= document.getElementById("submit");

		if (mName.value.length > 3 && mName.value.length < 20) {
			document.getElementById("mNameError").innerHTML = ""
			btn.removeAttribute("disabled")
		} 
		
		else {
			document.getElementById("mNameError").innerHTML = "Please enter the valid  name here..";
			btn.setAttribute("disabled", "");
			return;
		}}
		
		function handleLName() {

			var lName = document.getElementById("lName");
			var btn= document.getElementById("submit");

			if (fName.value.length > 3 && fName.value.length < 20) {
				document.getElementById("lNameError").innerHTML = ""
				btn.removeAttribute("disabled")
			} 
			
			else {
				document.getElementById("lNameError").innerHTML = "Please enter the valid  name here..";
				btn.setAttribute("disabled", "");
				return;
			}}
			
			function handleEmail() {

				var email = document.getElementById("email");
				var btn= document.getElementById("submit");

				if (email.value.length > 3 && email.value.length < 20) {
					document.getElementById("emailError").innerHTML = ""
					btn.removeAttribute("disabled")
				} 
				
				else {
					document.getElementById("emailError").innerHTML = "Please enter the valid  email here..";
					btn.setAttribute("disabled", "");
					return;
				}}
				
		function handleGender() {

					var gender = document.getElementById("gender");
					var btn= document.getElementById("submit");

					if (gender.value.length > 3 && gender.value.length < 12) {
						document.getElementById("genderError").innerHTML = ""
						btn.removeAttribute("disabled")
					} 
					
					else {
						document.getElementById("genderError").innerHTML = "Please enter the valid Gender here..";
						btn.setAttribute("disabled", "");
						return;
					}}
					
					function handleMobile() {

						var mobile = document.getElementById("mobile");
						var btn= document.getElementById("submit");

						if (mobile.value.length == 10) {
							document.getElementById("mobileError").innerHTML = ""
							btn.removeAttribute("disabled")
						} 
						
						else {
							document.getElementById("mobileError").innerHTML = "Please enter the valid Number here..";
							btn.setAttribute("disabled", "");
							return;
						}}
						
						function handleArea() {

							var area = document.getElementById("area");
							var btn= document.getElementById("submit");

							if (area.value.length > 3 && area.value.length < 20) {
								document.getElementById("areaError").innerHTML = ""
								btn.removeAttribute("disabled")
							} 
							
							else {
								document.getElementById("areaError").innerHTML = "Please enter the valid Area name here..";
								btn.setAttribute("disabled", "");
								return;
							}
						}
							function handlePincode() {

								var pin = document.getElementById("pin");
								var btn= document.getElementById("submit");

								if (pin.value.length == 6) {
									document.getElementById("pinError").innerHTML = ""
									btn.removeAttribute("disabled")
								} 
								
								else {
									document.getElementById("pinError").innerHTML = "Please enter valid pincode here..";
									btn.setAttribute("disabled", "");
									return;
								}
							}


</script>

</body>
</html>