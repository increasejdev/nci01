<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:out value="Hello World"></c:out>
<jsp:useBean id="test" class="beans.TestBean" scope="page"></jsp:useBean>

<p>Value of Info attribute</p><c:out value="${test.info}" />

Name parameter: <c:out value="${param.name}"> </c:out>
<c:if test="${param.name == 'Bob' }">
Hello Bob
</c:if>

<c:choose>
	<c:when test="${param.id == 1}">
		<b>ID is equal to 1</b>
	</c:when>
	<c:when test="${param.id == 2}">
		<b>ID is equals to 2</b>
	</c:when>
	<c:otherwise>
		ID is neither 1 or 2.
	</c:otherwise>
</c:choose>

<c:forEach var="i" begin="0" end="10" step="2" varStatus="status">
	Loop counter is: <c:out value="${i}" /><br/>
	
	<c:if test="${status.first}">
	This was the first iteration
	</c:if>
	
	<c:if test="${status.last}">
	This was last
	</c:if>
	
</c:forEach>

<c:out value="${user1.name}" /> <br/>
<c:out value="${user2.name}" /> <br/>
<c:out value="${user3.name}" /> <br/>

<c:out value="${link}" /><br/>
${link}<br/>

</body>
</html>