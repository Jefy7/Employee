<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="5px" bgcolor="red">
<th>Employee ID</th>
<th>Employee name</th>
<th>Age</th>
<th colspan="2">Action</th>
	<c:forEach var="emplist" items="${employeelistmodelattribute}" step="1">
<tr>
	<td>${emplist.getID()}</td>
	<td>${emplist.getName()}</td>
	<td>${emplist.getAge()}</td>
	<td><a href="editemployee?empid=${emplist.getID()}"><button >Edit</button></a></td>
	<td><a href="deleemployee?empid=${emplist.getID()}"><button >Delete</button></a></td>
</tr>

</c:forEach>

</table>

</body>
</html>