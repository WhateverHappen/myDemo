<%--
  Created by IntelliJ IDEA.
  User: 嘲讽脸
  Date: 2017/7/25
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<%
    String path = request.getContextPath();
    String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<head>
    <base href="<%=basepath%>">
    <title>Sign in error</title>
</head>
<body>
<h1 align="center" >用户名或密码不正确</h1>
</body>
</html>
