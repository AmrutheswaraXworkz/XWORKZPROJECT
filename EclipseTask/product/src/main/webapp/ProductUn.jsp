<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Xworkz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
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

        input[type="text"],
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
            background-color: olive;
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


<%
    String price = request.getParameter("price");
    if(!price.isEmpty() ){
	   int price1 = Integer.parseInt(price);
	   if (price1 == 0) {
   
   
%><form action="send" method="post">
    <div style="color:red;">
        Price cannot be 0. Please enter a valid price.</div>
        Name<input type="text" name="name" placeholder="Name" value="${param.name}"/>
    Type<input type="text" name="type" placeholder="Type of the Product" value="${param.type}"/>
    Price<input type="text" name="price" placeholder="Enter the price" value="${param.price}"/>
    Brand<input type="text" name="brand" placeholder="Enter the Brand" value="${param.brand}"/>
    Quantity<input type="text" name="quantity" placeholder="Enter the quantity" value="${param.quantity}"/>
    <input type="submit" value="save"/>
    
    </form>
    <% } %>
<% } else if(price.isEmpty()){ %>

<form action="send" method="post">
<div style="color:red;">
        Price cannot be null. Please enter a valid price.
    </div>
    Name<input type="text" name="name" placeholder="Name" value="${param.name}"/>
    Type<input type="text" name="type" placeholder="Type of the Product" value="${param.type}"/>
    Price<input type="text" name="price" placeholder="Enter the price" value="${param.price}"/>
    Brand<input type="text" name="brand" placeholder="Enter the Brand" value="${param.brand}"/>
    Quantity<input type="text" name="quantity" placeholder="Enter the quantity" value="${param.quantity}"/>
    <input type="submit" value="save"/>
</form>
<% } %>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
