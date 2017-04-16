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
<form action="student.do" method="POST" >

<input name="firstName" />
<input type="submit" name="action" value="add" />
</form>
<form action = "student.del" method="POST">
ID <input name = "id">
<button type ="submit" value="Delete">Delete</button>
</form>
<form action = "student.edit" method = "POST">
ID <input name ="id">
First Name <input name = "firstName">
<button type = "submit" value = "Edit">Update</button>
</form>




</body>
</html>