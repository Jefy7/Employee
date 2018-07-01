<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
</head>


<body>

 <form:form modelAttribute="usermodelattribute" action="addemp">
<h2>Add Employee</h2>
<label>Employee ID:</label><form:input type="number" id="id" placeholder="employee id" path="ID"></form:input><br>
<label>Employee Name:</label><form:input type="text" class="form-control" name="text" placeholder="Name..." path="name"></form:input><br>
<label>Employee Age</label><form:input type="number" id="age" placeholder="employee age" path="age" ></form:input><br>
<input type="button" value="submit" >
</form:form>
</body>

</html>