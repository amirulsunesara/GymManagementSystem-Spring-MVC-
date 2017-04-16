<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="/WEB-INF/jsp/includes.jsp" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script src="../bootstrap/js/jquery-2.2.3.min.js"></script>

<title>Equipment</title>
</head>
<body style="background-color:lightgray; font-family: Times New Roman;">
  <section>
 <style>
        body {
                background-color: lightyellow;
                //border: 3px dotted black;
                margin: 10px;
                padding-bottom: 20px;
                width:50%;
                margin:auto;
            }
            section {
                background-color: white;
                //border: 2px solid black;
                width: 700px;
                margin: 20px; /* all four sides */
                padding: 10px; /* all four sides */
            }
            h1,p{
                //background-color: white; 
                //border: 1px dashed black;
                padding: 10px;
            }
            h1 ,p{

                margin: .0em 0 0em; /* .5em top, 0 right and left, .25em bottom */
                padding-left: 15px;
            }
            p {

                margin: 0; /* all four sides */
                padding-left: 15px;
            }

.error {
		    font-size: 0.8em;
			color: #ff0000;
		}
</style>


<h1 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">Equipments</h1>
<div>
<form action="equipment.add" method="POST" >
Item Name <input name ="item_name"><br>
Manufacturer <input name ="manufacturer_name"><br>
Supplier <input name ="supplier_name"><br>
Cost <input name ="cost"><br>

<input type="submit" name="action" value="add" class=" btn btn-primary-bg"/>
</form>
</div>
<h3>List</h3>

<form action ="" method = "GET">
<table  BORDER="8" bgcolor="lightgray" cellspacing="6" cellpadding="10">
  <tr>
    <th>id</th>
    <th>item name</th>
    <th>manufacturer name</th>
    <th>supplier name</th>
    <th>cost</th>
    </tr>
    <c:forEach items="${equipments}" var="equipment">
  
        <tr>
            <td><c:out value="${equipment.id}"/></td>
            <td><c:out value="${equipment.item_name}" /></td>
		    <td><c:out value="${equipment.manufacturer_name}" /></td>
		    <td><c:out value="${equipment.supplier_name}" /></td>
 			<td><c:out value="${equipment.cost}" /></td>
            <td><a href = "<c:url value = 'equipment.del/${equipment.id}'/>">Delete</a></td>
            
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

<form:form method="post" modelAttribute="Equipment" action="equipment.search">
		<form:input path="id" type="text"  placeholder = "Enter Id"/>
		<form:errors path="id" /> 
		
		<input class=" btn btn-primary-bg" type="submit" name="action" value = "Search"/>
		
	</form:form>



<table  BORDER="8" bgcolor="lightgray" cellspacing="6" cellpadding="10">
  <tr>
    <th>id</th>
    <th>item name</th>
    <th>manufacturer name</th>
    <th>supplier name</th>
    <th>cost</th>
    </tr>
   
        <tr>
           <td><c:out value="${oneequipment.id}"/></td>
            <td><c:out value="${oneequipment.item_name}" /></td>
		    <td><c:out value="${oneequipment.manufacturer_name}" /></td>
		    <td><c:out value="${oneequipment.supplier_name}" /></td>
 			<td><c:out value="${oneequipment.cost}" /></td>
            
    
          
         
        </tr>
</table>

<h3>Edit</h3>

<form:form method="post" modelAttribute="Equipment" action="equipment.edit">
 ID <select path="id" name="id">
      <c:forEach items="${equipments}" var="equipment">
    <option value="${equipment.id}">${equipment.id}</option>
       </c:forEach>
</select>

	<form:input path="item_name" type="text"  placeholder = "Item Name"/>
		<form:errors path="item_name" /> 
		<form:input path="manufacturer_name" type="text"  placeholder = "Manufacturer Name"/>
		<form:errors path="manufacturer_name" /> 
		<form:input path="supplier_name" type="text"  placeholder = "Supplier Name"/>
		<form:errors path="supplier_name" /> 
		<form:input path="cost" type="text"  placeholder = "Cost"/>
		<form:errors path="cost" /> 
<input type="submit" name="action" value = "Edit" class=" btn btn-primary-bg"/>	
</form:form>
   <h4 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">2016 GYM Mgt System.</h4>
</section>

</body>
</html>