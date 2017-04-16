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
<title>Customer</title>
</head>
<body>
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


<h1 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">Customers</h1>
<div>
<form action="customer.add" method="POST" >
First Name <input name ="firstname">
Last Name <input name ="lastname">
Fee <input name ="fee">
<input type="submit" name="action" value="add" />
</form>
</div>
<h3>List</h3>

<form action ="" method = "GET">
<table BORDER="8" bgcolor="lightgray" cellspacing="6" cellpadding="10">
<tr>
<th>Id</th>
<th>first Name</th>
<th>Last Name</th>
<th>Fee</th>
</tr>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td><c:out value="${customer.id}"/></td>
            <td><c:out value="${customer.firstname}" /></td>
		    <td><c:out value="${customer.lastname}" /></td>
		    <td><c:out value="${customer.fee}" /></td>

            <td><a href = "<c:url value = 'customer.del/${customer.id}'/>">Delete</a></td>
            
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

<form:form method="post" modelAttribute="Customer" action="customer.search">
		<form:input path="id" type="text" />
		<form:errors path="id" /> 
		
		<input class=" btn btn-primary-bg" type="submit" name="action" value = "Search"/>
		
	</form:form>



<table>
   
        <tr>
            <td><c:out value="${onecustomer.id}"/></td>
            <td><c:out value="${onecustomer.firstname}" /></td>
   		    <td><c:out value="${onecustomer.lastname}" /></td>
		    <td><c:out value="${onecustomer.fee}" /></td>
            
    
          
         
        </tr>
</table>

<h3>EDIT</h3>

<form:form method="post" modelAttribute="Customer" action="customer.edit">
 <select path="id" name="id">
      <c:forEach items="${customers}" var="customer">
    <option value="${customer.id}">${customer.id}</option>
       </c:forEach>
</select>
	<form:input path="firstname" type="text"  placeholder = "First Name"/>
		<form:errors path="firstname" /> 
		<form:input path="lastname" type="text"  placeholder = "Last Name"/>
		<form:errors path="lastname" /> 
		<form:input path="fee" type="text"  placeholder = "Fee Amount"/>
		<form:errors path="fee" /> 
<input type="submit" name="action" value = "Edit"/>	
</form:form>
 <h4 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">2016 GYM Mgt System.</h4>
</body>
</html>