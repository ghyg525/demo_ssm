<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>login</title>
</head>
<body>

<form action="login" method="post">
	username:<input type="text" name="username"/><br>
	password:<input type="text" name="password"/>
				<input type="submit" value="login">
</form>

<p>${msg}</p>
</body>
</html>