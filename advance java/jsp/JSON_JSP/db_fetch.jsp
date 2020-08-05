<%@ page import="java.io.*,java.sql.*,org.json.* " %>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
 
<%
		System.out.println("Hello JSP");
            response.setContentType("text/xml");

            String sn = request.getParameter("ok");
            int i = Integer.parseInt(sn);
 
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
                    Statement st=con.createStatement();
                    ResultSet rs = st.executeQuery("select*from emp2 where empno="+i);
		 
		JSONObject obj = new JSONObject();	
		JSONArray arr = new JSONArray();		
		
                    while(rs.next())
                    {                            
                	arr.put(rs.getInt(1));	
		    }
                    obj.put("amount",arr);
		
			out.println(obj);	

	
		rs.close();
		st.close();
		con.close();
 
%>