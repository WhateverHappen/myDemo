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
    <base href="<%=basepath%>">
    <title>Sign in</title>
</head>
<body>
<div align="center">
    <form action="user/user_signIn" method="post" >
        <table  cellspacing=5 border=5 bodercolor=#ffaa00 >
            <tr>
                <th colspan="3" align="center"  bgcolor=#ffaa00>用户登录</th>
            </tr>
            <tr>
                <td align="center">用户名：</td>
                <td><input type="text" class="message" name="username"></td>
            </tr>
            <tr>
                <td align="center">密码：</td>
                <td><input class="message" type="password" name="password"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="登录">
                    <input type="reset" value="重置">
                </td>
            </tr>
        </table>
    </form>
</div>
<s:debug></s:debug>
</body>
</html>
