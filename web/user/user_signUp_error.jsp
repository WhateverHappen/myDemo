<%--
  Created by IntelliJ IDEA.
  User: 嘲讽脸
  Date: 2017/7/26
  Time: 15:27
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
    <title>sign up error</title>
</head>
<body>
<h1>该用户名已被申请</h1>
</body>
</html>
