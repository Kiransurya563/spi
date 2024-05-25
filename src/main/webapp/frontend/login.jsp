<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${pass}</h1>
<h1>${loginid}</h1>
<h1>${fail}</h1>
<form action="customerlogin" method="post">
<input type="number" name="id" placeholder="enter user id"><br>
<input type="password" name="pwd" placeholder="enter pwd"><br>
<button>login</button>
<button>cancel</button>
</form>
</body>
</html>