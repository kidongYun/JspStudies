<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%!
    	Connection connection;
    	Statement statement;
    	ResultSet resultSet;
    	
    	String name, id, pw, phone1, phone2, phone3, gender;
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		id = (String)session.getAttribute("id");
	
		String query = "SELECT * FROM member WHERE id = '" + id + "'";
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##scott", "tiger");
		statement = connection.createStatement();
		resultSet = statement.executeQuery(query);
		
		while(resultSet.next()) {
			name = resultSet.getString("name");
			pw = resultSet.getString("pw");
			phone1 = resultSet.getString("phone1");
			phone2 = resultSet.getString("phone2");
			phone3 = resultSet.getString("phone3");
			gender = resultSet.getString("gender");
		}
	%>
	
	<form action="ModifyOk" method="post">
		Name : <input type="text" name="name" size="10" value=<%= name %>> <br/>
		ID : <%= id %> <br/>
		Password : <input type="text" name="pw" size="10"> <br/>
		Phone : <select name="phone1">
			<option value="010">010</option>
			<option value="016">016</option>
			<option value="017">017</option>
			<option value="018">018</option>
			<option value="019">019</option>
			<option value="011">011</option>
		</select> -
		<input type="text" name="phone2" size="5" value=<%= phone2 %>> - <input type="text" name="phone3" size="5" value=<%= phone3 %>> <br/>
		
		<% if(gender.equals("man")) { %>
			Sex : <input type="radio" name="gender" value="man" checked="checked"> Man &nbsp; <input type="radio" name="gender" value="woman"> Woman <br/>
		<% } else { %>
			Sex : <input type="radio" name="gender" value="man"> Man &nbsp; <input type="radio" name="gender" value="woman" checked="checked"> Woman <br/>
		<% } %>
		 
		 <input type="submit" value="Modify"> <input type="reset" value="Cancel">
	</form>
</body>
</html>