<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Registration Form</title>
	<style>
		body {
			font-family: Arial, sans-serif;
			background-color: #f2f2f2;
			padding: 2px;
		}
		form {
			background-color: #fff;
			padding: 2px;
			border-radius: 5px;
			box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
		}
		h2 {
			text-align: center;
			margin-bottom: 30px;
			color: #446688;
		}
		label {
			display: block;
			margin-bottom: 5px;
			font-weight: bold;
			color: #333;
		}
		input[type="text"], input[type="email"], input[type="password"], input[type="tel"] {
			width: 20%;
			padding: 3px;
			border-radius: 2px; 
			border: 1px solid #ddd;
			margin-bottom: 5px;
			box-sizing: border-box;
		}
		input[type="checkbox"] {
			margin-right: 10px;
		}
		input[type="submit"] {
			background-color: #446688;
			color: #fff;
			padding: 5px 10px;
			border: none;
			border-radius: 5px;
			cursor: pointer;
			margin-top: 10px;
		}
		input[type="submit"]:hover {
			background-color: #334d66;
		}
	</style>
</head>
<body>
<h1>${no}</h1>
	<form action="register" method="post">	
		<label for="fullName">Full Name:</label><br>
		<input type="text" id="fullName" name="fullName" required><br>
		<label for="email">Email:</label><br>
		<input type="email" id="email" name="email" required><br>
		<label for="password">Password:</label><br>
		<input type="password" id="password" name="password" required><br>
		<label for="confirmPassword">Confirm Password:</label><br>
		<input type="password" id="confirmPassword" name="confirmPassword" required><br>
		<label for="phoneNumber">Phone Number:</label><br>
	<input type="tel" id="phoneNumber" name="phoneNumber" required><br>
		<input type="checkbox" id="rememberMe" name="rememberMe">
		<label for="rememberMe">Remember Me</label><br>
		<input type="checkbox" id="subscribeToNewsletter" name="subscribeToNewsletter">
		<label for="subscribeToNewsletter">Subscribe to Newsletter</label><br>
		<input type="submit" value="REGISTER">
	</form>
</body>
</html>