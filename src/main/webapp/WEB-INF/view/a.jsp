<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'a.jsp' starting page</title>
    
	
  </head>
  <frameset rows="30%,*">
      <frame src="top.jsp">
      <frameset cols="20%,*">
           <frame src="left.jsp">
           <frame src="right.jsp" name="right">
      </frameset>
  </frameset>
  <body>
    This is my JSP page. <br>
  </body>
</html>
