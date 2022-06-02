<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
 	<meta charset="UTF-8">
	<link rel="stylesheet" href="/webjars/bootstrap/4.6.1/css/bootstrap.min.css"/>
	<title>Departments Detail</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="<c:url value="/"/>">STS</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarText">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
					<a class="nav-link active" aria-current="page" href="<c:url value="/"/>"> <i class="fa fa-home"></i> Home</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/departments/"> <i class="fa fa-list"></i> DEPARTMENTS</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/employees/"> <i class="fa fa-plus"></i> EMPLOYEES</a>
				</li>
			</ul>
			<span class="navbar-text">
			  <a href="/logout" class="btn btn-light text-black-50">Logout</a>
			</span>
		</div>
	</nav>
	<div class="container mx-auto mt-lg-5">
		<p>
			<c:out value="${department.id}"/>
			<c:out value="${department.name}"/>
		</p>
	</div>
	<script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
	<script src="/webjars/popper.js/2.9.3/cjs/popper.js"></script>
	<script src=/webjars/bootstrap/4.6.1/js/bootstrap.bundle.min.js"></script>
</body>
</html>