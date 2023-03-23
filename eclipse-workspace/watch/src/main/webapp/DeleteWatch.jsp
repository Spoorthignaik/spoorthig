<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    
    <div class="text-center">
			<img
		src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
		class="rounded" width=120 depth=100>
					</div>
					
					<a href="WatchSearch.jsp">WatchSearch</a>
					<a href="index.jsp">Home</a>
  </div>
</nav>


 	<h3>
		<span style="color: green;">${message }</span>
	</h3>
	<h3>
		<span style="color: red;">${error }</span>
	</h3>

	<form action="delete" method="get">

	Search by Brand <input type="text" name="Brand" /> <input type="submit"
			value="search" />
	</form>&nbsp;&nbsp;&nbsp;

	<div>
	<tab
	le class="table table-bordered">
	<tr>
	<th scope="col">Id</th>
	<th scope="col">Brand</th>
	<th scope="col">Color</th>
	<th scope="col">Price</th>
	<th scope="col">Warranty</th>
	<th scope="col">Type</th>
	 
	</tr>
	
	<c:forEach items="${dto}" var="d">
	<tr>
	<td>${d.id}</td>
	<td>${d.brand}</td>
	<td>${d.color}</td>
	<td>${d.price}</td>
	<td>${d.warranty}</td>
	<td>${d.type}</td>
	
	
	</tr>
	
	</c:forEach>
	</table>
	
	
	</div>



</body>
</html>