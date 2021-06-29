<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
console.log("inside the javacritp")
$(document).ready(function(){
  $("button").click(function(){
				console.log('inside the click')
				  var username = $("#username").val();
				  var password = $("#password").val();
				console.log({'username':username, 'password':password });
				$.post("http://localhost:8080/authenticate", {'username':username, 'password':password},  function(data, result){
					alert('123');
					localStorage.setItem("token",data)
					window.location.href ="http://localhost:4780/home";
				});		
			});
});



</script>
</head>
<body>
<h1>Login Page</h1>
<c:url value="/authenticate" var="loginUrl"/>
<form  method="post">       
	<c:if test="${param.error != null}">        
		<p>
			Invalid username and password.
		</p>
	</c:if>
	<c:if test="${param.logout != null}">       
		<p>
			You have been logged out.
		</p>
	</c:if>
	<p>
		<label for="username">Username</label>
		<input type="text" id="username" name="username"/>	
	</p>
	<p>
		<label for="password">Password</label>
		<input type="password" id="password" name="password"/>	
	</p>
	<input type="hidden"                        
		name="${_csrf.parameterName}"
		value="${_csrf.token}"/>
			<button type="button" class="btn" id="test">Test</button>
		
	<button type="submit" class="btn">Log in</button>
</form>
</body></html>