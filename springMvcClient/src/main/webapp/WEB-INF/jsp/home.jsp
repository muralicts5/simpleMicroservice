<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script type="text/javascript">
console.log("inside the javacritp")
$(document).ready(function(){
	console.log(localStorage.getItem("token"))

	$('#list').click(function(e){
		console.log(localStorage.getItem("token"))
		$.ajax({
		    url: "http://localhost:4780/user/list",
		    type: "GET",
		    headers:{ "Authorization": 'Bearer '+localStorage.getItem("token")},
		    success: function(data) {
		    	$('#content').html(data);
		    }
		});
	})
		$('#add').click(function(e){
			console.log(localStorage.getItem("token"))
			$.ajax({
			    url: "http://localhost:4780/admin/addEmployee",
			    type: "GET",
			    headers:{ "Authorization": 'Bearer '+localStorage.getItem("token")},
			    success: function(data) {
			    	$('#content').html(data);
			    }
			});
		})
			
	
});</script>
<title>Insert title here</title>
</head>
<body>
<h1>Employee Management Page</h1>
<a href="#" id="list">list</a><br>
<a href="#" id="add">add</a><br>
<a href="/login">login</a><br>
<div id="content"></div>
</body>
</html>