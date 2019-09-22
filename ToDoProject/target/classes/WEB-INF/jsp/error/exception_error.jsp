<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>

	<c:if test="${not empty exception.errCode}">
		<h1>${exception.errCode} : System Errors</h1>
	</c:if>
	
	<c:if test="${empty exception.errCode}">
		<h1>Input Error: Please re-check your inputs</h1>
	</c:if>

	<c:if test="${not empty exception.errMsg}">
		<h2>${exception.errMsg}</h2>
	</c:if>
	
</body>
</html>