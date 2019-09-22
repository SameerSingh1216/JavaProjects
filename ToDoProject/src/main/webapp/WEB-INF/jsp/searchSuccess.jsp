<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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