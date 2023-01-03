<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSP Home index page</h1>


GET請求
<a href="get01">get01</a>




POST請求
<form action="testPostMapping" method="POST">
	<input type="text" name="name"><br>
	<input type="text" name="pass"><br>
	<input type="submit" name="ok"><br>
</form>


PUT請求
<form action="testPutMapping" method="PUT">
	<input type="text" name="name"><br>
	<input type="submit" name="ok"><br>
</form>


<a href="testPutMapping">PUT</a>

</body>
</html>