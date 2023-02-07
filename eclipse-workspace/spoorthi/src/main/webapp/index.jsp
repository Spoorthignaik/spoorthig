<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
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





<h1>WORKING  HERE</h1>

<form action="pastry" >
<h4>Display cake : ${spoo}</h4>
<input type="submit" value="show cake" />
</form>

<form  action="email" >
<h4>Display email : ${mail}</h4>
<input type="submit" value="show email " />
</form>


<form  action="mobileNo" >
<h4>Display mobile no : ${number}</h4>
<input type="submit" value="show number " />
</form>

<form  action="adharNo" >
<h4>Display adhar no : ${adhar}</h4>
<input type="submit" value="show adhar no " />
</form>

<form  action="age" >
<h4>Display age : ${age}</h4>
<input type="submit" value="show age" />
</form>

<form  action="dob" >
<h4>Display date of birth : ${dateOfBirth}</h4>
<input type="submit" value="show date of birth" />
</form>

<form  action="salary" >
<h4>Display salary : ${income}</h4>
<input type="submit" value="show desired salary" />
</form>

<form  action="friends" >
<h4>Display best friends :</h4>
<input type="submit" value="show best friends" />
<ul>
<c:forEach items="${frnd}" var = "item" >
       <li>${item} </li>
      </c:forEach>
</ul>
</form>


<form  action="place" >
<h4>Display place  :</h4>
<input type="submit" value="most visited place" />
<ul>
<c:forEach items="${frnd}" var = "item" >
       <li>${item} </li>
      </c:forEach>
</ul>
</form>


<form  action="skills" >
<h4>Display skills  :</h4>
<input type="submit" value="show skills" />
<ul>
<c:forEach items="${skillSet}" var = "item" >
       <li>${item} </li>
      </c:forEach>
</ul>
</form>

<form action="beverage" >
<h4>Display Beverage Details :${data1}</h4>
<input type="submit" value="show beverage" /> </br>
<label>Beverage Name : ${beverage.getName()}</label>
<label>Beverage Price : ${beverage.getPrice()}</label>
<label>Beverage Location : ${beverage.getLocation()}</label>
<label>Beverage MRP Price : ${beverage.isMrpPrice()}</label>
<label>Beverage Flavours : ${beverage.getFlavours()}</label>

</form>

<form action="chats">
<h4>Display Chat Details :${data2}</h4>
<input type="submit" value="show chats " />
<label>Chat Name : ${chat.getChatName()}</label>
<label>Chat Price : ${chat.getPrice()}</label>
<label>Chat Tasty : ${chat.isTasty()}</label>
<label>Chat Spicy : ${chat.isSpicy()}</label>
<label>Chat Variety : ${chat.getVariety()}</label>
<label>Chat Color : ${chat.getColor()}</label>
<label>Chat ShopName : ${chat.getShopName()}</label>
<label>Chat ContactNo : ${chat.getContactNo}</label>
<label>Chat Good : ${chat.isGood()}</label>
<label>Chat Location : ${chat.getLocation()}</label>
<label>Chat Area : ${chat.getArea()}</label>

</form>


<form action="education">
<h4>Display Chat Details :${data3}</h4>
<input type="submit" value="show chats " />
<label>Education Name : ${edu.getName()}</label>
<label>Education Qualification : ${edu.getQualification()}</label>
<label>Education BoardName : ${edu.getBoardName()}</label>
<label>Education Branch : ${edu.getBranch()}</label>
<label>Education NoOfYears : ${edu.getNoOfYears()}</label>
<label>Education Good : ${edu.isGood()}</label>
<label>Education NoOfSubjects : ${edu.getNoOfSubjects()}</label>
<label>Education NoOfExams : ${edu.getNoOfExams}</label>
<label>Education PrincipalName : ${edu.getPrincipalName()}</label>
<label>Education Compulsory : ${edu.isCompulsory()}</label>
</form>


<form action="family">
<h4>Display Chat Details :${data4}</h4>
<input type="submit" value="show family " />
<label>Family Name : ${fam.getFamilyName()}</label>
<label>Family no of members : ${fam.getNoOfMember()}</label>
<label>Family no od childrens : ${fam.getNoOfChildrens()}</label>
<label>Family no of youths : ${fam.getNoOfYouths()}</label>
<label>Family happy family : ${fam.isHappyFamily()}</label>
<label>Family family head : ${fam.getFamilyHead()}</label>
<label>Family age : ${fam.getAge()}</label>
<label>Family good : ${fam.isGood}</label>
<label>Family educated : ${fam.isEducated()}</label>
<label>Family name of house : ${fam.getNameOfHouse()}</label>
</form>




<form action="mob">
<h4>Display Chat Details :${data5}</h4>
<input type="submit" value="show mob " />
<label>Mobile MobileName : ${fam.getMobileName()}</label>
<label>Mobile Brand : ${fam.getBrand()}</label>
<label>Mobile Version : ${fam.getVersion()}</label>
<label>Mobile Price : ${fam.getPrice()}</label>
<label>Mobile Color : ${fam.getColor()}</label>
<label>Mobile Length : ${fam.getLength()}</label>
<label>Mobile Width : ${fam.getWidth()}</label>
<label>Mobile Warranty : ${fam.isWarranty}</label>
<label>Mobile Emi : ${fam.isEmi()}</label>
<label>Mobile WarrantyYears : ${fam.getWarrantyYears()}</label>
</form>



</body>
</html>