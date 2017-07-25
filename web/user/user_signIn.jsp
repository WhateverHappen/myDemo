<%--
  Created by IntelliJ IDEA.
  User: 嘲讽脸
  Date: 2017/7/24
  Time: 15:00
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
    <title>Sign in</title>
    <base href="<%=basepath%>">
</head>
<body>
<form action="user/user_signIn" method="post">
    name:<input type="text" name="userName" id="userName"/>
    password:<input type="text" name="password" id="password"/>
    <input type="submit" name="sign in">
</form>
<s:debug></s:debug>
</body>
</html>
