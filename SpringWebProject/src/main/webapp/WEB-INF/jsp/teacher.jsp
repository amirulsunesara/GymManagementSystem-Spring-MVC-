<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="teacher.add" method="POST" >

First Name<input name="firstName" />
Subject <input name ="subject">
<input type="submit" name="action" value="add" />
</form>

<form action ="" method = "GET">
<table>
    <c:forEach items="${teachers}" var="teacher">
        <tr>
            <td><c:out value="${teacher.teacherId}"/></td>
            <td><c:out value="${teacher.firstName}" /></td>
            <td><c:out value="${teacher.subject}" /></td>
            <td><a href = "<c:url value = 'teacher.edit/${teacher.teacherId}/${teacher.firstName}/${teacher.subject}'/>">Edit</a></td>
            <td><a href = "<c:url value = 'teacher.del/${teacher.teacherId}'/>">Delete</a></td>
            
        </tr>
    </c:forEach>
</table>
</form>
</body>
</html>