<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>

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

<nav class="navbar navbar-expand-lg navbar-light bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">Navbar</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="#">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">
						Dropdown </a>


					<div class="text-center">
						<img
							src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
							class="rounded" width=140 depth=120>
					</div>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
						<li><a class="dropdown-item" href="#">Action</a></li>
						<li><a class="dropdown-item" href="#">Another action</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="#">Something else here</a></li>
					</ul></li>
				<li class="nav-item"><a class="nav-link disabled" href="#"
					tabindex="-1" aria-disabled="true">Disabled</a></li>
			</ul>
			<form class="d-flex">
				<input class="form-control me-2" type="search" placeholder="Search"
					aria-label="Search">
				<button class="btn btn-outline-success" type="submit">Search</button>
			</form>
		</div>
	</div>
</nav>
<body>

	<h1>page to send Interview Details</h1>
	<form action="attend" method="post">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name
			</label><input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="enter name " />
		</div>

        <div>
		<select class="form-select" aria-label="Default select example">
			<option selected>Select Company</option>
			<option value="X-workz-Raj">X-workz-Raj</option>
			<option value="X-workz-Raj-BTM">X-workz-Raj-BTM</option>
			<option value="X-workz">X-workz</option>
		</select>
		</div>
		

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Role
			</label> <input type="text" class="form-control" name="role"
				id="exampleFormControlInput1" placeholder="enter desired role" />
		</div>

	<input type="submit" value="send" />

	</form>
	


</body>
</html>