<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Signup</title>
</head>
<body>
<form action="signup" method="post">
<input type="text" name="name" placeholder="enter name" required="required"><br>
<input type="email" name="email" placeholder="enter email" required="required"><br>
<input type="number" name="mobile" placeholder="enter mobile" required="required"><br>
<input type="password" name="password" placeholder="enter pwd" required="required"><br>
<button>create Account</button>
<button>cancel</button>
</form>
</body>
</html>