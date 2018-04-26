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
			<li><a href="http://www.in28minutes.com">In28Minutes</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right" style="margin-right:30px">
			<li><a href="/login.do">Login</a></li>
		</ul>

	</nav>

	<div class="container"><form action="/login.do" method="post">

<%// scriplets tag
System.out.println(request.getParameter("name"));
java.util.Date date= new java.util.Date();
%>
<div> <b>Current date is : <%=date %></b></div>
<h1 ><font color="Red">${ErrorMsg}</font></h1>
Enter your name <input type="text" name="name" >
Enter password <input type="password" name="password" >
<input type="submit" value="Submit"></form>

	</div>

	<footer class="footer">
		<p>footer content</p>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>



