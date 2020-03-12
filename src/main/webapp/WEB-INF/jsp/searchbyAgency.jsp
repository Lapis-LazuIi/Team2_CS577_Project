<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert hell here</title>
</head>
<body>
<p>Hello</p>

<p>
<c:forEach var="routes" items="${routes}">
    <li>${routes}</li>
</c:forEach>
</p>
</body>
</html>