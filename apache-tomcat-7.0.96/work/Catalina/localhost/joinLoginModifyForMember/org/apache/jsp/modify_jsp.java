/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.96
 * Generated at: 2019-08-19 13:11:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class modify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    	Connection connection;
    	Statement statement;
    	ResultSet resultSet;
    	
    	String name, id, pw, phone1, phone2, phone3, gender;
    
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");

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
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"ModifyOk\" method=\"post\">\r\n");
      out.write("\t\tName : <input type=\"text\" name=\"name\" size=\"10\" value=");
      out.print( name );
      out.write("> <br/>\r\n");
      out.write("\t\tID : ");
      out.print( id );
      out.write(" <br/>\r\n");
      out.write("\t\tPassword : <input type=\"text\" name=\"pw\" size=\"10\"> <br/>\r\n");
      out.write("\t\tPhone : <select name=\"phone1\">\r\n");
      out.write("\t\t\t<option value=\"010\">010</option>\r\n");
      out.write("\t\t\t<option value=\"016\">016</option>\r\n");
      out.write("\t\t\t<option value=\"017\">017</option>\r\n");
      out.write("\t\t\t<option value=\"018\">018</option>\r\n");
      out.write("\t\t\t<option value=\"019\">019</option>\r\n");
      out.write("\t\t\t<option value=\"011\">011</option>\r\n");
      out.write("\t\t</select> -\r\n");
      out.write("\t\t<input type=\"text\" name=\"phone2\" size=\"5\" value=");
      out.print( phone2 );
      out.write("> - <input type=\"text\" name=\"phone3\" size=\"5\" value=");
      out.print( phone3 );
      out.write("> <br/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
 if(gender.equals("man")) { 
      out.write("\r\n");
      out.write("\t\t\tSex : <input type=\"radio\" name=\"gender\" value=\"man\" checked=\"checked\"> Man &nbsp; <input type=\"radio\" name=\"gender\" value=\"woman\"> Woman <br/>\r\n");
      out.write("\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\tSex : <input type=\"radio\" name=\"gender\" value=\"man\"> Man &nbsp; <input type=\"radio\" name=\"gender\" value=\"woman\" checked=\"checked\"> Woman <br/>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t <input type=\"submit\" value=\"Modify\"> <input type=\"reset\" value=\"Cancel\">\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}