<%--
  Created by IntelliJ IDEA.
  User: alassane
  Date: 18-05-2022
  Time: 08:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="/webjars/bootstrap/4.6.1/css/bootstrap.min.css"/>">
    <title>UPDATE EMPLOYEE</title>
</head>
<body>

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="<c:url value=""/>">STS</a>
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
        <form action="/employees/update/${employee.matricule}" method="post" class="col-10 align-items-center">
            <div class="form-group">
                <label class="form-check-label" for="fullName">Full Name</label>
                <input class="form-control" value="${employee.fullName}" type="text" name="fullName" id="fullName">
            </div>
            <div class="form-group">
                <label class="form-check-label" for="hireDate">HireDate</label>
                <input class="form-control" value="${employee.hireDate}" type="date" name="hireDate" id="hireDate">
            </div>
            <div class="form-group">
                <label class="form-check-label" for="salary">Salary</label>
                <input class="form-control" value="${employee.salary}" type="number" name="salary" id="salary">
            </div>
            <div class="form-group">
                <label class="form-check-label">Manager : </label>
                <input class="custom-radio" type="radio"  value="true" name="manager">Yes
                <input class="custom-radio" type="radio"  value="false" name="manager">No
            </div>
            <div class="form-group">
                <label class="form-check-label" for="idDept">Department</label>
                <select name="idDept" id="idDept">
                    <c:forEach var="dept" items="${departments}">
                        <option value="${dept.id}">${dept.name}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="form-group">
                <input class="form-control btn btn-primary" type="submit" value="Create">
            </div>
        </form>
    </div>

    <script src="<c:url value="/webjars/jquery/3.6.0/jquery.min.js"/>"></script>
    <script src="<c:url value="/webjars/popper.js/2.9.3/cjs/popper.js"/>"></script>
    <script src="<c:url value="/webjars/bootstrap/4.6.1/js/bootstrap.bundle.min.js"/>"></script>
</body>
</html>
