<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
	
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
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

<h1> Cheif Minister Info Page</h1>

<form action="cm" method="post">
<pre>
CM Name <input type="text" name="name"/>
Party Name<select name="party">
<option>Select</option>
<option>BJP</option>
<option>KJP</option>
<option>Congress</option>
<option>JDS</option>
<option>AAJP</option>
<option>others</option>
</select>

State Name<select name="state">
<option>Select</option>
<option>karnataka</option>
<option>kerala</option>
<option>Goa</option>
<option>TamilNadu</option>
<option>Madhya Pradesh</option>
</select>

Tenure<select name="tenure">
<option>Select</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
</select>

PortFolio<textarea rows="3" cols="50" name="portfolio">
</textarea>

<input type="submit" value="save" class="btn-btn-primary"/>
</pre>

</form>
</body>
</html>