<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script>

function employeeInfo(event,id){
	console.log(event);
	console.log(id);
	event.preventDefault();
	var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
		  	alert(this.readyState);
		 	alert(this.responseText);
	    if (this.readyState == 4 && this.status == 200) {
	   
	     document.getElementById("employeeInfo").innerHTML = this.responseText;
	    }
	  };
	  $.ajax({
		    url: "http://localhost:4780/user/employee?id="+id,
		    type: "GET",
		    headers:{ "Authorization": 'Bearer '+localStorage.getItem("token")},
		    success: function(data) {
		    	$('#employeeInfo').html(data);
		    }
		});
}


</script>
<h2>Employee Details</h2>
<table border="2" class="table table-striped table-bordered table-hover">
<tbody>
<tr>
	<td>Id</td>
	<td>Name</td>
	<td>Salary</td>
</tr>
<c:forEach items="${employees}" var="employee"> 
  <tr>
    <td><a href="" onclick="employeeInfo(event,${employee.employeeId})">${employee.employeeId}</a></td>
    <td>${employee.name}</td>
    <td>${employee.salary}</td>
  </tr>
</c:forEach>
</tbody>
</table>
<div id="employeeInfo">
</div>
