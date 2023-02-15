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
<title>Insert title here</title>
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


<h1>This is egg Application</h1>
<form action="egg" method="post">
<pre>

Hotel Name <input type="text" name="hotelName" />
Egg Dish Name<select name="dishName" >
<option>Select</option>
<option>Omlet</option>
<option>half-boil</option>
<option>Egg-rice</option>
<option>Egg-biryani</option>
<option>Egg-curry</option>
<option>Egg-gravy</option>
<option>boiled egg</option>
<option>Egg-masala</option>
</select>

Egg Type<select name="type" >
<option>Select</option>
<option>form</option>
<option>nati</option>
<option>broiler</option>
<option>ostrich</option>
<option>snake</option>
</select>

Price<input type="text" name="price"/>
Quantity<Select name="quantity">
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
<option>10</option>
</Select>
Take Away yes:<input type="radio" value="true" name="takeAway" />
          No:<input type="radio" value="false" name="takeAway" />
   <input type="submit" value="order" class="btn-btn-primary" />       
</pre>
</form>

</body>
</html>