<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%!
    	Connection connection;
    	Statement statement;
    	ResultSet resultSet;
    	
    	String driver = "oracle.jdbc.driver.OracleDriver";
    	String url = "jdbc:oracle:thin:@localhost:1521:xe";
    	String uid ="c##scott";
    	String upw ="tiger";
    	String query = "select * from member";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, uid, upw);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			
			while(resultSet.next()) {
				String id = resultSet.getString("id");
				String pw = resultSet.getString("pw");
				String name = resultSet.getString("name");
				String phone = resultSet.getString("phone");
				
				out.println("ID : " + id + ", PW : " + pw + ", NAME : " + name + ", PHONE : " + phone + "<br/>");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	%>
</body>
</html>