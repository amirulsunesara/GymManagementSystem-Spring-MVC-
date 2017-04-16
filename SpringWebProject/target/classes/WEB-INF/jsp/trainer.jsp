<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp" %>
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trainer</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script src="../bootstrap/js/jquery-2.2.3.min.js"></script>

 </head>
<body>
<h3>Add</h3>
<div>
<form action="trainer.add" method="POST" >
Trainer Style <input name ="trainer_style"><br>
<input type="submit" name="action" value="add" />
</form>
</div>
<h3>List</h3>

<form action ="" method = "GET">
<table>
    <c:forEach items="${trainers}" var="trainer">
        <tr>
            <td><c:out value="${trainer.id}"/></td>
            <td><c:out value="${trainer.trainer_style}" /></td>
    
<%--             <td><a href = "<c:url value = 'teacher.edit/${teacher.teacherId}/${teacher.firstName}/${teacher.subject}'/>">Edit</a></td> --%>
            <td><a href = "<c:url value = 'trainer.del/${trainer.id}'/>">Delete</a></td>
            
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

<form:form method="post" modelAttribute="Trainer" action="trainer.search">
		<form:input path="id" type="text" placeholder="Enter id"/>
		<form:errors path="id" /> 
		<input class=" btn btn-primary-bg" type="submit" name="action" value = "Search"/>
		
	</form:form>



<table>
   
        <tr>
            <td><c:out value="${onetrainer.id}"/></td>
            <td><c:out value="${onetrainer.trainer_style}" /></td>
    
          
         
        </tr>
</table>

<h3>EDIT</h3>

<form:form method="post" modelAttribute="Trainer" action="trainer.edit">
 <select path="id" name="id">
      <c:forEach items="${trainers}" var="trainer">
    <option value="${trainer.id}">${trainer.id}</option>
       </c:forEach>
</select>
	<form:input path="trainer_style" type="text" placeholder = "Trainer Style"/>
		<form:errors path="trainer_style" />
<input type="submit" name="action"value = "Submit"/>	
</form:form>


</html>