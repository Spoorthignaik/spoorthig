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
					
					
					<a href="index.jsp">Home</a>
  </div>
</nav>

<h1>Watch Search By Type</h1>

<h3><span style="color:red;">${message}</span></h3>
<form action="searchByType" method="get">
Search By Type <input type="text" name="type"/>
<input type="submit" value="search"/>
</form>

<table class="table">
   <thead>
   <tr>
     <th>ID</th>
     <th>Brand</th>
     <th>Color</th>
     <th>Type</th>
     <th>Price</th>
     <th>Warranty</th>
     <th>Edit</th>
     <th>Delete</th>
     <tr>
     </thead>
     
     <tbody>
     <c:forEach items="${list}" var="t">
     <th scope="row"></th>
     <tr>
     
     <td>${t.id}</td>
     <td>${t.brand}</td>
     <td>${t.color}</td>
     <td>${t.type}</td>
     <td>${t.price}</td>
     <td>${t.warranty}</td>
     <td><a href="update?id=${t.id}">Edit</a></td>
     <td><a href="delete?id=${t.id}">Delete</a></td>
     </tr>
     </c:forEach>
     </tbody>

</table>
</body>
</html>