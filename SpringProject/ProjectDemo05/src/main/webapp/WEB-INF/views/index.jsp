<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>index首頁</h1>

GET請求(Servlet)
<a href="ts1?name=yom&pass=123">傳送servlet參數</a>
<br>
<hr>
GET請求(SpringMVC)
<a href="ts2?name=yom&pass=123">傳送SpringMVC參數</a>
<hr>
POST請求(SpringMVC)
<form action="ts2" method="post">
	帳號:<input type="text" name="name"><br>
	密碼:<input type="password" name="pass"><br>
	喜好:<input type="checkbox" name="hobby" value="A">A
	<input type="checkbox" name="hobby" value="B">B
	<input type="checkbox" name="hobby" value="C">C<br>
	<input type="submit" value="ok">
</form>
<hr>
POST請求(SpringMVC，當傳入參數名稱不一樣)
<form action="ts4" method="post">
	帳號:<input type="text" name="username"><br>
	密碼:<input type="password" name="pass"><br>
	喜好:<input type="checkbox" name="hobby" value="A">A
	<input type="checkbox" name="hobby" value="B">B
	<input type="checkbox" name="hobby" value="C">C<br>
	<input type="submit" value="ok">
</form>


</body>
</html>