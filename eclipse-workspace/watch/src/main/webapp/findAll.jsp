<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>




<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    
    <div class="text-center">
			<img
		src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTy3DiMfcvQkcAz3DPpPOtoGbnvmcJfhjr8w&usqp=CAU"
		class="rounded" width=200 depth=130>
					</div>
					
					
					
					<a href="index.jsp">Home</a>
					
  </div>
</nav>





</head>
<body>




<h3 style="color: green;">Find All</h3>
	<h3>
		<span style="color: red;">${messege }</span>
	</h3>

	

	<div>
	<table class="table table-bordered">
	<tr>
	<th scope="col">Id</th>
	<th scope="col">Brand</th>
	<th scope="col">Color</th>
	<th scope="col">Price</th>
	<th scope="col">Warranty</th>
	<th scope="col">Type</th>
	<th scope="col">Edit</th>
	<th scope="col">Delete</th>
	
	 
	</tr>
	
	<c:forEach items="${dto}" var="d">
	<tr>
	<td>${d.id}</td>
	<td>${d.brand}</td>
	<td>${d.color}</td>
	<td>${d.price}</td>
	<td>${d.warranty}</td>
	<td>${d.type}</td>
	<td> <a href="update?id=${d.id }">Edit</a></td>
	<td> <a href="delete?id=${d.id }">Delete</a></td>
	
	</tr>
	
	</c:forEach>
	</table>
	
	
	</div>





</body>
</html>