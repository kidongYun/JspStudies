<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="joinOk.jsp" method="post" name="reg_frm">
		ID : <input type="text" name="id" size="20"> <br/>
		Password : <input type="password" name="pw" size="20"> <br/>
		Password Confirm : <input type="password" name="pw_check" size="20"> <br/>
		Name : <input type="text" name="name" size="20"> <br/>
		Mail : <input type="text" name="eMail" size="20"> <br/>
		Address : <input type="text" name="address" size="50"> <br/>
		<input type="button" value="Join" onclick="infoConfirm()">&nbsp;&nbsp;&nbsp; <input type="reset" value="Cancel" onclick="javascript:window.location='login.jsp'">
	</form>
</body>
</html>