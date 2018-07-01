<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="5px" bgcolor="red" items="${employeelistmodelattribute }">
<th>Employee ID</th>
<th>Employee name</th>
<th>Status</th>
<th>start date</th>
<th>end date</th>
<th>Assign to</th>
<th>summary</th>
<tr>
	<td>${emplist.getID()}</td>
	<td>${emplist.getName()}</td>
	<td>${emplist.getStatus()}</td>
	<td>${emplist.getStartDate()}</td>
	<td>${emplist.getEndDate()}</td>
	<td>	<form:select id="employeename"		 path="employeename">
					<c:forEach items="${employeelistmodelattribute }" var="empname">
					<c:set   var="employee" value="${empname.getEmployeeName() }"></c:set>
						<form:option value="${employee }">${employee }</form:option>

						</c:forEach>											
				</form:select>
	
	</td>
</tr>


</table>

</body>
</html>