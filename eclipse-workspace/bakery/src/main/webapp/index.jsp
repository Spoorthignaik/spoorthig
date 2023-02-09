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
<body>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    
    <div class="text-center">
			<img
		src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
		class="rounded" width=120 depth=100>
					</div>
  </div>
</nav>



<h2>WEB PAGE IS WORKING HERE</h2>

<form action="bake" method="post">

      <div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Bakery Name</label> 
			<input type="text" class="form-control" name="name" id="exampleFormControlInput1" placeholder="enter bakery name" />
		</div>
		
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Bakery Owner</label> 
			<input type="text" class="form-control" name="ownerName" id="exampleFormControlInput1" placeholder="enter bakery owner name" />
		</div>
		
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Wife Name</label> 
			<input type="text" class="form-control" name="wife" id="exampleFormControlInput1" placeholder="enter bakery owner wife name" />
		</div>
		
		
		
		
		<div>
		Married Yes<input type="radio"  name="married"    value="yes"/>
		        No<input type="radio"  name="married"    value="No"/>
		</div>
		
		
		<div class="form-floating">
		Famous For<label for="exampleFormControlInput1" class="form-label">comments </label> 
       <textarea class="form-control" name="famous" placeholder="Leave a comment here" id="floatingTextarea" width=50 depth=800></textarea>
         
         </div>
		
		
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label"> Since </label> 
			<input type="text" class="form-control" name="since" id="exampleFormControlInput1" placeholder="ente since" />
		</div>
     
     <input type="submit" value="click" />
     <a href="BakerySuccess.jsp" >click</a>
           
</form>


  


</body>
</html>