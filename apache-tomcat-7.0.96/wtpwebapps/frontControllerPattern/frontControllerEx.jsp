<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<a href="insert.do">insert</a>
	<hr/>
	<a href="http://localhost:8181<%=request.getContextPath()%>/update.do">update</a>
	<hr/>
	<a href="http://localhost:8181/jsp_25_2_ex1_fontex/select.do">select</a>
	<hr/>
	<a href="<%=request.getContextPath()%>/delete.do">delete</a>

</body>
</html>