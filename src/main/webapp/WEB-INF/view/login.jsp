<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>
<div align="center">
		<form:form action="processLogin" method="post" modelAttribute="loginForm">

			<h2 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Login</h2>

			<div class="form-outline mb-4 col-4">
				<label class="form-label"><b>Username</b></label>
					<input type="text" class="form-control form-control-lg"
						name="username" required /> 			
			</div>
			
			<div class="form-outline mb-4 col-4">
				<label class="form-label"><b>Password</b></label>
					<input type="password" class="form-control form-control-lg"
						name="password" required /> 		
			</div>
			
			<div>
				<button type="submit" class="btn btn-primary">Login</button>
			</div>

		</form:form>
</div>
</body>
</html>