<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding more aliens</title>
</head>
<body>
	<% 
	 	int aid = (int)session.getAttribute("aid");
		out.println("The id is "+aid);
	%>
	
	<form action = "add">
		Enter Alien name : <input type="text" name="aname"> <br>
		Enter Tech Skill : <input type="text" name="tech"> <br>
		<input type = "submit"  name = "submit">
	</form>
</body>
</html>