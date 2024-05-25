<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>${pass}</h2>
<h2>${fail}</h2>
<form action="verify-otp" method="post">
<input type="hidden" name="id"  value="${id}">
<input type="number" name="otp" placeholder="enter otp">
<button>submit</button>
</form>
</body>
</html>