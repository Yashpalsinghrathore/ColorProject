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
<table border="2px">
<tr>
<td style="color:red">UserName</td>
<td style="color:red">Colors</td>
</tr>
<tr>
<td>
${saveUser.userName}
</td>
<td>
<c:forEach var="color" items="${saveUser.colors}">
    <c:out value="${color}"/>
</c:forEach>
</td>
</tr>
</table>
<a href="getAllUser">Get All User</a>
</body>
</h1>
</html>