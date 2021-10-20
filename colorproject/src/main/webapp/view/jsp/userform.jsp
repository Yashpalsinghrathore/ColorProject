<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.colorproject.model.Color"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="submitForm" method="post">
name: <input type="text" name="userName">

 
 Colors:
           <select name="colors" multiple>
           
           
                        	<c:forEach items="${listOfColor}" var="allColor">
							<option><c:out value="${allColor.color}"/></option>
							</c:forEach>
							
							
             </select>
           
<input type="submit" value="submit">

<a href="getAllUser">Get All User</a>

</form>
</body>
</html>