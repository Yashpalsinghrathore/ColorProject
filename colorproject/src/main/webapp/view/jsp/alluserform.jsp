<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
<table border="2px" align="center">
<tr>
<td style="color:red">UserName</td>
<td style="color:red">Colors</td>
</tr>
<c:forEach var="User" items="${listOfUser}">
<tr>
<td>
${User.userName}
</td>
<td>
<c:forEach var="color" items="${User.colors}">
    <c:out value="${color}"/>
</c:forEach>
</td>
</tr>
</c:forEach>
</table>
</h1>
</body>
</html>