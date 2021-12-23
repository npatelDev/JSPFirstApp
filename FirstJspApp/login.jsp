<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/login.do" method="post">
	<p><font color="red">${errorMessage}</font></p>
	Enter Your Name<input type="text" name="name"><br><br>
	Enter Your email<input type="text" name="email"><br><br>
	Enter Your password<input type="password" name="password"><br><br>
	<input type="submit" value="Login">
	</form>
</body>
</html>