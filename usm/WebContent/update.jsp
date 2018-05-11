<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="update.do" method="post">
<pre>
Name<input type="text" name="name" value="${key1.name}">
password <input type="password" name="password"  value="${key1.password }">
EmailID <input type="text" name="email" readonly value="${key1.email }">
Mobile<input type="text" name="mobile" value="${key1.mobile }">
City<input type="text" name="city" value="${key1.city}">
<input type="submit" value="register">

</pre>
</form>
<%-- <%
session.getAttribute();
%> --%>

</body>
</html>