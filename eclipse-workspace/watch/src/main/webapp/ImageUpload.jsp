<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<<title>X-workz</title>


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
		src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTy3DiMfcvQkcAz3DPpPOtoGbnvmcJfhjr8w&usqp=CAU"
		class="rounded" width=200 depth=130>
					</div>
					
					<a href="index.jsp">Home</a>
			
  </div>
</nav>

		
					
					
<h1>Upload Image Test</h1>
<form action="upload" method="post" enctype="multipart/form-data">
Upload : <input type="file" name="photo"/>
<input type="submit" value="Upload"/>
</form>					
					
</body>
</html>