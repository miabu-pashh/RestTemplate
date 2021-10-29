<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
	<div align="center" class="container">
		<h2>Library Management System</h2> 
		<label><b>Welcome User</b></label> 
	<div align="center">
		<form method="post" action="logout" class="form-inline my-2 my-lg-0">
			<button class="btn btn-outline-primary" type="submit">Logout</button>
		</form>
</div>
		<hr>
		
		<h2>Edit Book details</h2>
		<form action="editBook" method="post" >

	<div class="container col-md-5">
			<div class="card">
				<div class="card-body">
		
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
				</div>
			</div>
		</div>
								
			<button type="submit" class="btn btn-primary">Submit</button>
			<button type="botton" class="btn btn-danger">Cancel</button>
	</form>
	</div> 

</body>
</html>