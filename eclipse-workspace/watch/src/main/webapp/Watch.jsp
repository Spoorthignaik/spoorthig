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


<h1>Welcome to  Watch data saving...</h1>

<c:forEach items="${errors}" var="e">
<span style="color:red;">${e.message}</span><br>
</c:forEach>

<h2><span style="color:blue;">${same}</span></h2>

<form action="clock" method="post">
<pre>
<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Type</span>
  <input type="text" name="type" class="form-control" placeholder="Enter Type"   value="${dto.type}"/>
</div>

<div class="input-group mb-3">
  <span class="input-group-text">Warranty</span>
  <input type="number" class="form-control" name="warranty" aria-label="Amount (to the nearest dollar)">
  <span class="input-group-text">.00</span>
</div>

<div class="input-group mb-3">
  <span class="input-group-text">Price</span>
  <input type="number" class="form-control" name="price" aria-label="Amount (to the nearest dollar)">
  <span class="input-group-text">.00</span>
</div>

<div class="input-group mb-3">
  <label class="input-group-text">Brand</label>
  <select class="form-select" id="inputGroupSelect01" name="brand">
    <option value="">SELECT</option>
    <c:forEach items="${brand}" var="b">
    <option value="${b}">${b}</option>
    </c:forEach>
  </select>
</div>

<div class="input-group mb-3">
  <label class="input-group-text" >Color</label>
  <select class="form-select" id="inputGroupSelect01" name="color">
    <option value="">SELECT</option>
    <c:forEach items="${color}" var="c">
    <option value="${c}">${c}</option>
    </c:forEach>
  </select>
</div>

<input type="submit" value="Save"/>

</pre>

</form>

</body>
</html>