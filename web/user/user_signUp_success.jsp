<%--
  Created by IntelliJ IDEA.
  User: 嘲讽脸
  Date: 2017/7/24
  Time: 15:51
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
    <title>Sign up success</title>
</head>
<body>
<h1 align="center">Sign up success!</h1>
<div align="center">
    <table>
        <tr><td>userName:<s:property value="userName"/></td></tr>
        <tr><td>password:<s:property value="password"/></td></tr>
        <tr><td>sex:<s:property value="sex"/></td></tr>
        <tr><td>age:<s:property value="age"/></td></tr>
    </table>
</div>
</body>
</html>
