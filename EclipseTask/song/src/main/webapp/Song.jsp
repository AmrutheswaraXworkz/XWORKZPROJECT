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
						aria-current="page" href="#">Song</a></li>
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
	
	<form action="song" method="post" onclick="return validate()">
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="name" id="name"
					placeholder="Song name" value="${dto.getName()}" onchange="handleName()"/>
					<span id="nameError" style="color: red"></span><br> 
			</div>
					</div>
					
					<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="singerName" id="singerName"
					placeholder="Singer name" value="${dto.getSingerName()}" onchange="handleSinger()"/>
					<span id="singerError" style="color: red"></span><br> 
			</div>
					</div>
					
		
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="composer" id="composer"
					placeholder="Composer" value="${dto.getComposer()}" onchange="handleComposer()"/>
					<span id="composerError" style="color: red"></span><br>
			</div>
			
		</div>
		
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="duration" id="duration"
					placeholder="Duration" value="${dto.getDuration()}" onchange="handleDuration()"/>
					<span id="durationError" style="color: red"></span><br>
			</div>
		</div>
		
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="album" id="album"
					placeholder="Album Name" value="${dto.getAlbum()}" onchange="handleAlbum()"/>
					<span id="albumError" style="color: red"></span><br>
			</div>
		</div>
		
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="language" id="language"
					placeholder="Language" value="${dto.getLanguage()}" onchange="handleLanguage()"/>
					<span id="languageError" style="color: red"></span><br>
			</div>
		</div>
		
		
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="date" id="date"
					placeholder="Release Date" value="${dto.getDate()}" onchange="handleDate()"/>
					<span id="dateError" style="color: red"></span><br>
			</div>
		</div>
		
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="lyricist" id="lyricist"
					placeholder="Lyricist" value="${dto.getLyricist()}" onchange="handleLyricist()"/>
					<span id="lyricistError" style="color: red"></span><br>
			</div>
		</div>
		
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="producer" id="producer"
					placeholder="Producer" value="${dto.getProducer()}" onchange="handleProducer()"/>
					<span id="producerError" style="color: red"></span><br>
					
					<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="director" id="director"
					placeholder="Director" value="${dto.getDirector()}" onchange="handleDirector()"/>
					<span id="directorError" style="color: red"></span><br>
			</div>
		</div>
		
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
	
	<script>
		function validate() {
			let name = document.getElementById("name").value;
			let singerName = document.getElementById("singerName").value;
			let composer = document.getElementById("composer").value;
			let duration = document.getElementById("duration").value;
			let album = document.getElementById("album").value;
			let language = document.getElementById("language").value;
			let date = document.getElementById("date").value;
			let lyricist = document.getElementById("lyricist").value;
			let producer = document.getElementById("producer").value;
			let director = document.getElementById("director").value;
			
			let button=document.getElementById("submit").value;

			if (name.length < 3 || name.length > 20) {
				document.getElementById("nameError").innerHTML = "Please enter the valid name..";
				return false;
			}
			else{
				document.getElementById("nameError").innerHTML ="";
			}
			
			if (singerName.length<3 || singerName.length>20) {
				document.getElementById("singerError").innerHTML = "Please enter valid singer name here..";
					return false;
			}
			else{
				document.getElementById("singerError").innerHTML ="";
			}
			
			if (composer.length <3 || composer.length>20) {
				document.getElementById("composerError").innerHTML = "Please enter the valid composer name here.."
				return false;
			}
			else{
				document.getElementById("composerError").innerHTML ="";
			}
			
			if (duration.length===0) {
				document.getElementById("durationError").innerHTML = "Please enter valid duration here..";
					return false;
			}
			else{
				document.getElementById("durationError").innerHTML ="";
			}
			
			if (album.length < 3 || album.length > 20) {
				document.getElementById("albumError").innerHTML = "Please enter the valid album name here..";
				return false;
			}
			else{
				document.getElementById("albumError").innerHTML ="";
			}
			if (language.length < 3 || language.length > 20) {
				document.getElementById("languageError").innerHTML = "Please enter the valid language here..";
				return false;
			}
			else{
				document.getElementById("languageError").innerHTML ="";
			}
			if (date.length===0) {
				document.getElementById("dateError").innerHTML = "Please enter the valid date here..";
				return false;
			}
			else{
				document.getElementById("dateError").innerHTML ="";
			}
			if (lyricist.length < 3 || lyricist.length > 20) {
				document.getElementById("lyricistError").innerHTML = "Please enter the valid lyricist name here..";
				return false;
			}
			else{
				document.getElementById("lyricistError").innerHTML ="";
			}
			if (producer.length < 3 || producer.length > 20) {
				document.getElementById("producerError").innerHTML = "Please enter the valid producer name here..";
				return false;
			}
			else{
				document.getElementById("producerError").innerHTML ="";
			}
			if (director.length < 3 || director.length > 20) {
				document.getElementById("directorError").innerHTML = "Please enter the valid director name here..";
				return false;
			}
			else{
				document.getElementById("directorError").innerHTML ="";
			}
			
			button.removeAttribute('submitButton');
			return true;

		}
		function handleName() {

			var name = document.getElementById("name");
			var btn= document.getElementById("submit");

			if (name.value.length > 3 && name.value.length < 20) {
				document.getElementById("nameError").innerHTML = "";
				btn.removeAttribute("disabled")
			} 
			else {
				document.getElementById("nameError").innerHTML = "Please enter the valid  name here..";
				btn.setAttribute("disabled", "");
				return;
			}
		}
		
		function handleSinger() {

			var singer = document.getElementById("singerName");
			var btn= document.getElementById("submit");

			if (experience.value.length <= 2) {
				document.getElementById("singerError").innerHTML = ""
				btn.removeAttribute("disabled")
			} 
			
			else {
				document.getElementById("singerError").innerHTML = "Please enter the valid singer name here..";
				btn.setAttribute("disabled", "");
				return;
			}
		}
		
		function handleComposer() {

			var composer = document.getElementById("composer");
			var btn= document.getElementById("submit");

			if (composer.value.length > 3 && composer.value.length < 20) {
				document.getElementById("composerError").innerHTML = "";
				btn.removeAttribute("disabled")
			} 
			else {
				document.getElementById("composerError").innerHTML = "Please enter the valid composer name here..";
				btn.setAttribute("disabled", "");
				return;
			}
		}
		
		function handleDuration() {

			var duration = document.getElementById("duration");
			var btn= document.getElementById("submit");

			if (duration.value.length > 3 && achivement.value.length < 20) {
				document.getElementById("durationError").innerHTML = "";
				btn.removeAttribute("disabled")
			} 
			else {
				document.getElementById("durationError").innerHTML = "Please enter the valid  duration here..";
				btn.setAttribute("disabled", "");
				return;
			}
		}
		
		function handleAlbum() {

			var album = document.getElementById("album");
			var btn= document.getElementById("submit");

			if (album.value.length > 3 && album.value.length < 20) {
				document.getElementById("albumError").innerHTML = "";
				btn.removeAttribute("disabled")
			} 
			else {
				document.getElementById("albumError").innerHTML = "Please enter the valid  album here..";
				btn.setAttribute("disabled", "");
				return;
			}
		}
		
		function handleLanguage() {

			var language = document.getElementById("language");
			var btn= document.getElementById("submit");

			if (language.value.length > 3 && language.value.length < 20) {
				document.getElementById("languageError").innerHTML = "";
				btn.removeAttribute("disabled")
			} 
			else {
				document.getElementById("languageError").innerHTML = "Please enter the valid language here..";
				btn.setAttribute("disabled", "");
				return;
			}
		}
		
		function handleDate() {

			var date = document.getElementById("date");
			var btn= document.getElementById("submit");

			if (date.value.length > 3 && date.value.length < 20) {
				document.getElementById("dateError").innerHTML = "";
				btn.removeAttribute("disabled")
			} 
			else {
				document.getElementById("dateError").innerHTML = "Please enter the valid date here..";
				btn.setAttribute("disabled", "");
				return;
			}
		}
		
		function handleLyricist() {

			var lyricist = document.getElementById("lyricist");
			var btn= document.getElementById("submit");

			if (lyricist.value.length > 3 && lyricist.value.length < 20) {
				document.getElementById("lyricistError").innerHTML = "";
				btn.removeAttribute("disabled")
			} 
			else {
				document.getElementById("lyricistError").innerHTML = "Please enter the valid lyricist name here..";
				btn.setAttribute("disabled", "");
				return;
			}
		}
		
		function handleProducer() {

			var producer = document.getElementById("producer");
			var btn= document.getElementById("submit");

			if (producer.value.length > 3 && producer.value.length < 20) {
				document.getElementById("producerError").innerHTML = "";
				btn.removeAttribute("disabled")
			} 
			else {
				document.getElementById("producerError").innerHTML = "Please enter the valid producer name here..";
				btn.setAttribute("disabled", "");
				return;
			}
		}
		
		function handleDirector() {

			var director = document.getElementById("director");
			var btn= document.getElementById("submit");

			if (director.value.length > 3 && director.value.length < 20) {
				document.getElementById("directorError").innerHTML = "";
				btn.removeAttribute("disabled")
			} 
			else {
				document.getElementById("directorError").innerHTML = "Please enter the valid director name here..";
				btn.setAttribute("disabled", "");
				return;
			}
		}
	</script>
</body>
</html>