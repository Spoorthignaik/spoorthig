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
		src="data:image/png;base64,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"
		class="rounded" width=120 depth=100>
					</div>
					
					
					<a href="index.jsp">Home</a>
  </div>
</nav>
<h1>Aeroplane Search</h1>
<h3><span style="color:red;">${message}</span></h3>
<form action="search" method="get">
Search By Id <input type="text" name="id"/>
<input type="submit" value="search"/>
</form>



<h3>Search Results</h3>
Company:${dto.company}<br>
Name:${dto.name}<br>
type:${dto.type}<br>
Cost:${dto.cost}<br>
Country :${dto.country}

</body>
</html>