<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<!-- As a link -->
<nav class="navbar navbar-light bg-dark">

  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
   <div class="text-center">
			<img
		src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
		class="rounded" width=120 depth=100>
					</div>
  </div>
  </div>
</nav>

<!-- As a heading -->
<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <span class="navbar-brand mb-0 h1">Navbar</span>
  </div>
</nav>
<body>
<h1> welcome to beach</h1>
<form action="beach" method="post" >
<pre>
Name<input type="text" name="name" />
Location<input type="text" name="location" />
Clean Yes<input type="radio" name="clean" value="true" />
      No<input type="radio" name="clean" value="false"/>
 Games<input type="text" name="games" />
 
 <input type="submit" value="send" />

 <a href="BeachSuccess.jsp">Send to beach</a>
 
</pre>
</form>

</body>
</html>