<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ include file="/WEB-INF/jsp/includes.jsp" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script src="../bootstrap/js/jquery-2.2.3.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee</title>
</head>
<body>
<h3>Add</h3>
<div>
<form action="employee.add" method="POST" >
First Name <input name ="firstname">
Last Name <input name ="lastname">
Designation <input name ="designation">
Contact <input name ="contact">
Salary <input name ="salary">
<input type="submit" name="action" value="add" />
</form>
</div>
<h3>List</h3>

<form action ="" method = "GET">
<table>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td><c:out value="${employee.id}"/></td>
            <td><c:out value="${employee.firstname}" /></td>
		    <td><c:out value="${employee.lastname}" /></td>
		    <td><c:out value="${employee.designation}" /></td>
		    <td><c:out value="${employee.contact}" /></td>
		    <td><c:out value="${employee.salary}" /></td>

            <td><a href = "<c:url value = 'employee.del/${employee.id}'/>">Delete</a></td>
            
        </tr>
    </c:forEach>
</table>

</form>

<%-- <form action = "trainer.search/${_id}" method = "GET">
<br>
<h2>Search Trainer</h2>
ID<input type = text name ="_id"> 
<a class = "btn" href = "<c:url value = 'trainer.search/${_id}'/>">Search</a>
</form> --%>

<h3>Search</h3>

<form:form method="post" modelAttribute="Employee" action="employee.search">
		<form:input path="id" type="text" />
		<form:errors path="id" /> 
		
		<input class=" btn btn-primary-bg" type="submit" name="action" value = "Search"/>
		
	</form:form>



<table>
   
        <tr>
             <td><c:out value="${oneemployee.id}"/></td>
            <td><c:out value="${oneemployee.firstname}" /></td>
		    <td><c:out value="${oneemployee.lastname}" /></td>
		    <td><c:out value="${oneemployee.designation}" /></td>
		    <td><c:out value="${oneemployee.contact}" /></td>
		    <td><c:out value="${oneemployee.salary}" /></td>
            
    
          
         
        </tr>
</table>

<h3>EDIT</h3>

<form:form method="post" modelAttribute="Employee" action="employee.edit">
 <select path="id" name="id">
      <c:forEach items="${employees}" var="employee">
    <option value="${employee.id}">${employee.id}</option>
       </c:forEach>
</select>
	<form:input path="firstname" type="text" placeholder = "First Name"/>
		<form:errors path="firstname" /> 
		<form:input path="lastname" type="text" placeholder = "Last Name"/>
		<form:errors path="lastname" /> 
		<form:input path="designation" type="text" placeholder ="Designation"/>
		<form:errors path="designation" /> 
		<form:input path="contact" type="text" placeholder="Contact"/>
		<form:errors path="contact" /> 
		<form:input path="salary" type="text" placeholder ="Salary"/>
		<form:errors path="salary" /> 
<input type="submit" name="action" value = "Edit"/>	
</form:form>

</body>
</html>