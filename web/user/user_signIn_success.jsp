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
    <title>Sign in success</title>
</head>
<body>
<h1 align="center">Sign in success!</h1>
<div align="center">
    <table>
    <tr><td>用户：<s:property value="userName"/></td></tr>
    <tr><td>密码：<s:property value="password"/></td></tr>
    </table>
</div>


<s:debug></s:debug>
</body>
</html>
