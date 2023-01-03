<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>SUCCESS</h1>
Servlet 接值<br>
<%=request.getAttribute("key") %> <br>
${requestScope.key}<br>

ModelAndView<br>
${requestScope.key}<br>
${requestScope.mapkey}<br>
${requestScope.mm}<br>


</body>
</html>