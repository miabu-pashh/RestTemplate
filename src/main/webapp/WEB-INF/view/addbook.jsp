<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>

	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
		integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
		crossorigin="anonymous">

</head>
<body>
	<div align="center" class="container">
		<h2>Library Management System</h2> 
			<label><b>Welcome User</b></label> 

		<form method="post" action="logout" class="form-inline my-2 my-lg-0">
			<button class="btn btn-outline-primary" type="submit">Logout</button>
		</form>
		
		<hr>
		
		<h2>Add Book details</h2>
		<form action="addBookAndRedirect" method="post" modelAttribute="book">		
		
			<fieldset class="form-group">
						<label>Book Code</label> <input type="text" class="form-control mb-4 col-4"
							name="bookcode" required="required" />
					</fieldset>

					<fieldset class="form-group">
						<label>Book Name</label> <input type="text" class="form-control mb-4 col-4"
							name="bookname" />
					</fieldset>

					<fieldset class="form-group">
						<label>Author</label> <input type="text" class="form-control mb-4 col-4"
							name="author" />
					</fieldset>

					<fieldset class="form-group">
						<label>Added On</label> <input type="text" class="form-control mb-4 col-4"
							name="date" />
					</fieldset>

					<button type="submit" class="btn btn-success">Add Book</button>
		</form>
	</div>
</body>
</html>