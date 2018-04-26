<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Todos</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
	.footer {
		position: absolute;
		bottom: 0;
		width: 100%;
		height: 60px;
		background-color: #f5f5f5;
	}
</style>
</head>

<body>

	<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand"> TODO Application </a>
		<a href="/" style="font-size:10px" class="navbar-brand"> by Technorohit Corportation </a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/list-todos.do">Todos</a></li>
			<li><a href="/add-todo.do">Add todo</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right" style="margin-right:30px">
			<li><a href="/logout.do">Logout</a></li>
		</ul>

	</nav>

	<div class="container">
	
	<%// scriplets tag
	System.out.println(request.getParameter("name"));
	java.util.Date date= new java.util.Date();
	%>
	<div class="text-right"> <b>Current date is : <%=date %></b></div>
	
	
	
		<h1><b>Welcome ${name}</b> </h1>
<p>Your Todos are :-----------------------------</p>

<table class="table table-striped">
<thead>
<th>Description</th>
<th>Category</th>
<th>Action</th>
</thead>
<tbody>
<c:forEach items="${todos}" var="todo">
<tr>
	<td>${todo.name} </td>
	<td>${todo.category }</td>
	<td><a class="btn btn-danger" href="\delete-todo.do?todo=${todo.name}&category=${todo.category}"> Delete</a> </td>
</tr>
</c:forEach>

</tbody>
</table>

<a class="btn btn-success" href="\add-todo.do"> Add New Todo</a>
	</div>

	<footer class="fixed footer">
		<p class="text-center" style="height:10px;margin-top:30px;">
<b>		©2018-2019 All Right Reserved</b>
		</p>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>