<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%@include file="./base.jsp"%>

</head>

<body>

<form action="header-product" method="post">
	產品名稱:<input type="text" name="name" id="name"><br><br>
	說明:<input type="text" name="desc" id="desc"><br><br>
	銷售價:格<input type="text" name="price" id="price"><br><br>
	<input type="submit" name="ADD"><br><br>
	<a href="">Back</a><br><br>
</form>



</body>
</html>