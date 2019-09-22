<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/Includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Task Management</title>
</head>
<body>
<h1>Task Data</h1>
<form:form action="user.do" method="POST" commandName="student">
	<table>
		<tr>
			<td>Task ID</td>
			<td><form:input path="taskId" /></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Task</td>
			<td><form:input path="task" /></td>
		</tr>
		<tr>
			<td>Description</td>
			<td><form:input path="description" /></td>
		</tr>
		<!--<tr>
			<td>Date</td>
			<td><form:input path="date" /></td>
		</tr> -->
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>Task ID</th>
	<th>Name</th>
	<th>Task</th>
	<th>Description</th>
	<th>Date</th>
	<c:forEach items="${studentList}" var="student">
		<tr>
			<td>${student.taskId}</td>
			<td>${student.name}</td>
			<td>${student.task}</td>
			<td>${student.description}</td>
			<td>${student.date}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>