<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>web server</title>
</head>
<body>

<h1>favorite person web page</h1>
 <form action="person" method="post">
 <pre>
 FirstName<input type="text" name="firstName" />
 LastName<input type="text" name="lastName" />
 Gender  female<input type="radio" name="gender" value="female" />
         male<input type="radio" name="gender" value="male"  />
         others<input type="radio" name="gender" value="others" />
 Reason<input type="textarea" name="reason" />
 Address<input type="text" name="address" />
 <input type="submit" value="send" />
 </pre>
 </form>

</body>
</html>