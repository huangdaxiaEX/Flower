<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>test</title>
  </head>
  
  <body>
    <form action="activityZhangController/methodTemplate.do" method="post">
  	  <input type="text" name = "YYY">
    	<input type="submit" value="click">
    </form>
  </body>
</html>
