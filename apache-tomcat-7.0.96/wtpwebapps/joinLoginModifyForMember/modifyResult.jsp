<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	To modify the information of <%= session.getAttribute("name") %> is successfully complete.
	<a href ="logout.jsp">Logout</a> &nbsp;&nbsp; <a href="modify.jsp">Modify</a>

</body>
</html>