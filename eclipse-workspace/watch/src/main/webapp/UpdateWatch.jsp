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


<h1>Welcome to  Watch Data Update...</h1>

<c:forEach items="${errors}" var="e">
<span style="color:red;">${e.message}</span><br>
</c:forEach>

<h2><span style="color:blue;">${message}</span></h2>

<form action="update" method="post">
<pre>
ID<input type="text" name="id" value="${dto.id}"/>
Type<input type="text" name="type" value="${dto.type}"/>
Warranty<input type="number" name="warranty" value="${dto.warranty}"/><br>
price<input type="number" name="price" value="${dto.price}"/><br>
Brand<select name="brand">
<option value="${dto.brand}">${dto.brand}</option>
<c:forEach items="${brand}" var="b">
<option value="${b}">${b}</option>
</c:forEach>
</select><br>

Color<select name="color">
<option value="${dto.color}">${dto.color}</option>
<c:forEach items="${color}" var="c">
<option value="${c}">${c}</option>
</c:forEach>
</select><br>
<input type="submit" value="Update"/>

</pre>

</form>

</body>
</html>