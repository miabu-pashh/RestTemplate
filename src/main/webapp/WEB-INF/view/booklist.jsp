<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Books</title>

	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
		integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
		crossorigin="anonymous">

</head>
<body>

	<div align="center" class="container my-2">
		<label><b>Welcome User</b></label> 
			<h2>Books Listing</h2> 
				
		<div class="container text-center">
			<form method="post" action="addAnother"
				class="offset-md-5.5 form-inline my-2 my-lg-0">
				<button class="btn btn-primary btn-sm mb-3" type="submit">Add a Book</button>
			</form>
	
			<form method="post" action="getAllBooks"
				class="offset-md-5.5 form-inline my-2 my-lg-0">
				<button class="btn btn-success btn-sm mb-3"" type="submit">Display Books</button>
			</form>
		</div>
		
	<table border="1" class="table table-striped table-responsive-md">
		<thead>
			<tr>
				<th>Book Code</th>
				<th>Book Name</th>
				<th>Author</th>
				<th>Added On</th>
				<th>Actions</th>
			</tr>
		</thead>
		
		<tbody>
		<c:forEach items="${list}" var="list">
 			<tr>
				<th scope="row">${list.bookcode}</th>
					<td>${list.bookname}</td>
					<td>${list.author}</td>
					<td>${list.date}</td>
				<td> <a href="editBookAndRedirect/${list.bookcode}" 
						class="btn btn-outline-secondary">Edit</a>
					<a href="deleteBookAndRedirect/${list.bookcode}" 
						class="btn btn-outline-danger"> Delete</a>
				</td>
 			</tr> 	 
 		</c:forEach>
		</tbody>
		
	</table>
		<form method="post" action="logout" class="offset-md-5.5 form-inline my-2 my-lg-0">
			<button class="btn btn-outline-primary" type="submit">Logout</button>
		</form>
	</div>
</body>
</html>