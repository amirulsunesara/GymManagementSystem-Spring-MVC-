    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <meta charset="UTF-8">
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
        <title>
          
        </title>
    </head>
    <body>
    
     <script src="http://code.jquery.com/jquery-latest.min.js"></script>
   <script type="text/javascript">
   $(document).ready(
		   function()
		   {
			   $('#edditor').hide();
		   });
   		function send(){
   			
   			var item_name = document.getElementsByName("item_name").item(0).value;
        	var manufacturer_name = document.getElementsByName("manufacturer_name").item(0).value;
           	var supplier_name = document.getElementsByName("supplier_name").item(0).value;
           	var dpday = document.getElementsByName("dpday").item(0).value;
         	var dpmonth = document.getElementsByName("dpmonth").item(0).value;
         	var dpyear = document.getElementsByName("dpyear").item(0).value;
         	var dmday = document.getElementsByName("dmday").item(0).value;
          	var dmmonth = document.getElementsByName("dmmonth").item(0).value;
          	var dmyear = document.getElementsByName("dmyear").item(0).value;
          	var status = document.getElementsByName("status").item(0).value;
        	   var form = $(this);
        	   
        	   
   		
	        $.ajax
	        ({
	            type: "POST",           
	            data: 'item_name='+item_name+'&manufacturer_name='+manufacturer_name+'&supplier_name='+supplier_name+'&dpday='+dpday+'&dpmonth='+dpmonth+'&dpyear='+dpyear+'&dmmonth='+dmmonth+'&dmyear='+dmyear+'&dmday'+dmday,
	            url: "addEquipment.do",
	        success:function(msg)
	        {
	        	
	        
	        	 $('#result1').html(msg);
	          
              
	              
	        }
	        });
        
   		}
   		function del(clicked_id) {
   			
   			var id = clicked_id;
        
   		
   		
	        $.ajax
	        ({
	            type: "POST",           
	            data: "" ,
	            url: "delete?id="+id,
	        success:function(result)
	        {
	        
	               $('#result1').html(result) 
	              
	
	              
	            }           
	        });
        
   		
   		}
function show(clicked_id) {
   			
   			var id = clicked_id;
        
   		
   		
	        $.ajax
	        ({
	            type: "POST",           
	            data: "" ,
	            url: "edit?id="+id,
	        success:function(result)
	        {
	        	
	        	
	        	 $('#edditor').show();
	        	  $('#edditor').html(result) 
	              
	
	              
	            }           
	        });
        
   		
   		}
function search() {
		
	
	var firstname = document.getElementsByName("firstname").item(0).value;
	
	
    $.ajax
    ({
        type: "POST",           
        data: 'firstname='+firstname,
        url: "search",
    success:function(result)
    {
    	
    	
    	 $('#result1').html(result)
    	  
          

          
        }           
    });

	
	}

	
		
</script>
    
    
       <section>

<fieldset>
                    <legend></legend><br>
<form action="./processNewEquipmentForm" method="POST" >
<h1 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">Equipment add</h1>
<table>


 
    <tr>

        <td>
        <label for="item_name">Item Name: </label>
        <input type="text" id="item_name" />
            
        </td>
    </tr>
    <tr>
  	
       
         <td>
        <label >Manufacturer Name: </label>
        <input type="text" id="manufacturer_name" />
            
        </td>
    </tr>
       <tr>

         <td>
        <label >Supplier Name: </label>
        <input type="text" id="supplier_name" />
            
        </td>
    </tr>
       <tr>
 
         <td>
        <label >Cost : </label>
        <input type="text" id="cost" />
            
        </td>
    </tr>
       <tr>
  
        <td>Date Purchased: </td><td><select id="dpyear">
       <option value="">--Year--</option>
       <option value="2012">2012</option>
       <option value="2013">2013</option>
       <option value="2014">2014</option>
       <option value="2015">2016</option>
        </select></td>
     
     
       <td><select id="dpmonth">
       <option value="">--Month--</option>
       <option value="01">jan</option>
       <option value="02">Feb</option>
       <option value="03">March</option>
       <option value="04">April</option> 
        <option value="05">May</option> 
         <option value="06">June</option> 
          <option value="07">July</option> 
           <option value="08">August</option> 
            <option value="09">September</option> 
             <option value="10">October</option> 
              <option value="11">Novemeber</option> 
               <option value="12">December</option> 
       </select></td>
     
     
 <td><select id="dpday">
       <option value="">--Day--</option>
       <option value="01">01</option>
       <option value="02">02</option>
       <option value="03">03</option>
       <option value="04">04</option>
       <option value="05">05</option>
       <option value="06">06</option>
       <option value="07">07</option>
       <option value="08">08</option>
       <option value="09">09</option>
       <option value="10">10</option>
       <option value="09">11</option>
       <option value="09">12</option>
       <option value="09">13</option>
       <option value="09">14</option>
       <option value="09">15</option>
       <option value="09">16</option>
       <option value="09">17</option>
       <option value="09">18</option>
       <option value="09">19</option>
       <option value="09">20</option>
       <option value="09">21</option>
       <option value="09">22</option>
       <option value="09">23</option>
       <option value="09">24</option>
       <option value="09">25</option>
       <option value="09">26</option>
       <option value="09">27</option>
       <option value="09">28</option>
       <option value="09">29</option>
       <option value="09">30</option>
       <option value="09">31</option>
       
  
       </select></td>
    </tr> 
     <tr>
 
         <td>Date Maintained:</td><td><select id="dmyear">
       <option value="">--Year--</option>
       <option value="2012">2012</option>
       <option value="2013">2013</option>
       <option value="2014">2014</option>
       <option value="2015">2016</option>
        </select></td>
     
     
<td><select id="dmmonth">
       <option value="">--Month--</option>
       <option value="01">jan</option>
       <option value="02">Feb</option>
       <option value="03">March</option>
       <option value="04">April</option> 
        <option value="05">May</option> 
         <option value="06">June</option> 
          <option value="07">July</option> 
           <option value="08">August</option> 
            <option value="09">September</option> 
             <option value="10">October</option> 
              <option value="11">Novemeber</option> 
               <option value="12">December</option> 
       </select></td>
     
     
      <td><select id="dmday">
       <option value="">--Date--</option>
       <option value="01">01</option>
       <option value="02">02</option>
       <option value="03">03</option>
       <option value="04">04</option>
       <option value="05">05</option>
       <option value="06">06</option>
       <option value="07">07</option>
       <option value="08">08</option>
       <option value="09">09</option>
       <option value="10">10</option>
       <option value="09">11</option>
       <option value="09">12</option>
       <option value="09">13</option>
       <option value="09">14</option>
       <option value="09">15</option>
       <option value="09">16</option>
       <option value="09">17</option>
       <option value="09">18</option>
       <option value="09">19</option>
       <option value="09">20</option>
       <option value="09">21</option>
       <option value="09">22</option>
       <option value="09">23</option>
       <option value="09">24</option>
       <option value="09">25</option>
       <option value="09">26</option>
       <option value="09">27</option>
       <option value="09">28</option>
       <option value="09">29</option>
       <option value="09">30</option>
       <option value="09">31</option>
       
  
       </select></td>
    </tr> 
     <tr>
<label>Equipment Status:</label>
       <select id="status">
       <option value="">--Select--</option>
       <option value="01">Available</option>
       <option value="02">Not Available</option>
             <option value="03">Mantainance</option>
       </select>
    </tr> 
      
    <td>    <input type="button" value="Submit" id="btn" onClick="send()"/> </td>
    </tr>
    </table>

    <br><br><br><br>
    <h4 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">2016 GYM Mgt Center Inc.</h4>
      </form>
      </fieldset>
</section>
<div id="result1">
 <h1>Equipment Information</h1>
  <table BORDER="8" bgcolor="lightgray" cellspacing="6" cellpadding="10">
<tr>
	<th>Equipment ID</th>
	<th>Item Name</th>
	<th>Manufacturer name</th>
	<th>Supplier Name</th>
	<th>Cost</th>
	<th>Date Purchased</th>
	<th>Date Maintained</th>
		<th>Status</th>
	
	<th>Delete </th>
	<th>Edit </th>
	
</tr>
	<c:forEach var="equipmentList" items="${EquipmentList}">
		<tr>
		   <td>${equipmentList.id}</td>
		   <td>${equipmentList.item_name}</td>
		   <td>${equipmentList.manufacturer_name}</td>
		    <td>${equipmentList.supplier_name}</td>
		     <td>${equipmentList.cost}</td>
		         <td>${equipmentList.dpdate}-${equipmentList.dpmonth}-${equipmentList.dpyear}</td>
		      <td>${equipmentList.dmdate}/${equipmentList.dmmonth}/${equipmentList.dmyear}</td>
		       <td>${equipmentList.status}</td>
		       
		   <td> <input type="button" value="edit" id="btnEdit" onClick="show(${p.id})"/></td>
                        <td>   <input type="button" value="delete" id="btnDel" onClick="del(${p.id})"/> </td>
		
		</tr>
	</c:forEach>
</table>

  <div id="edditor" style="color:green; display:inline-block; position:absolute; width: 700px; ">
    <c:forEach items="${getEquipmentById}" var="p">
         <form action="edit.do" method="post">
                
                </form>
    
      </c:forEach>
</div>
</div>
    </body>
</html>