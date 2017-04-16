<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="/WEB-INF/jsp/includes.jsp" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script src="../bootstrap/js/jquery-2.2.3.min.js"></script>


<title>Supplements</title>
</head>
<body>
<h3>Add</h3>
<div>
<form action="supplements.add" method="POST" >
Item Name <input name ="item_name">
Manufacturer <input name ="manufacturer_name">
Supplier <input name ="supplier_name">
Cost <input name ="cost">
Stock <input name ="stock">

<input type="submit" name="action" value="add" />
</form>
</div>
<h3>List</h3>

<form action ="" method = "GET">
<table>
    <c:forEach items="${supplements}" var="supplement">
        <tr>
            <td><c:out value="${supplement.id}"/></td>
            <td><c:out value="${supplement.item_name}" /></td>
		    <td><c:out value="${supplement.manufacturer_name}" /></td>
		    <td><c:out value="${supplement.supplier_name}" /></td>
 			<td><c:out value="${supplement.cost}" /></td>
 				<td><c:out value="${supplement.stock}" /></td>
            <td><a href = "<c:url value = 'supplements.del/${supplement.id}'/>">Delete</a></td>
            
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

<form:form method="post" modelAttribute="Supplements" action="supplements.search">
		<form:input path="id" type="text" />
		<form:errors path="id" /> 
		
		<input class=" btn btn-primary-bg" type="submit" name="action" value = "Search"/>
		
	</form:form>



<table>
   
        <tr>
           <td><c:out value="${onesupplements.id}"/></td>
            <td><c:out value="${onesupplements.item_name}" /></td>
		    <td><c:out value="${onesupplements.manufacturer_name}" /></td>
		    <td><c:out value="${onesupplements.supplier_name}" /></td>
 			<td><c:out value="${onesupplements.cost}" /></td>
            <td><c:out value="${onesupplements.stock}" /></td>
    
          
         
        </tr>
</table>

<h3>EDIT</h3>

<form:form method="post" modelAttribute="Supplements" action="supplements.edit">
 <select path="id" name="id">
      <c:forEach items="${supplements}" var="supplement">
    <option value="${supplement.id}">${supplement.id}</option>
       </c:forEach>
</select>
	<form:input path="item_name" type="text" placeholder = "Item Name"/>
		<form:errors path="item_name" /> 
		<form:input path="manufacturer_name" type="text" placeholder = "Manufacturer Name"/>
		<form:errors path="manufacturer_name" /> 
		<form:input path="supplier_name" type="text" placeholder = "Supplier Name"/>
		<form:errors path="supplier_name" /> 
		<form:input path="cost" type="text" placeholder = "Cost Per Piece"/>
		<form:errors path="cost" />
		<form:input path="stock" type="text" placeholder = "Amount in Stock"/>
		<form:errors path="stock" /> 
<input type="submit" name="action" value = "Edit"/>	
</form:form>

</body>
</html>