<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("Server : " + request.getServerName() + "<br />");
		out.println("Port : " + request.getServerPort() + "<br />");
		out.println("Method : " + request.getMethod() + "<br />");
		out.println("Protocol : " + request.getProtocol() + "<br />");
		out.println("URL : " + request.getRequestURL() + "<br />");
		out.println("URI : " + request.getRequestURI() + "<br />");
	%>

</body>
</html>