<%--
  Created by IntelliJ IDEA.
  User: 嘲讽脸
  Date: 2017/7/24
  Time: 15:01
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
    <title>Sign up</title>
</head>
<body>
<div align="center">
    <form action="user/user_signUp" method="post">
        <table  cellspacing=8 border=5 bodercolor=#ffaa00 >
            <tr>
                <th colspan="6" align="center"  bgcolor=#ffaa00>用户注册</th>
            </tr>
            <tr>
                <td align="center">用户名：</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td align="center">密码：</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td align="center">密码确认：</td>
                <td><input type="password" name="passwordCheck"></td>
            </tr>
            <tr>
                <td align="center">性别：</td>
                <td><input type="text" name="sex"></td>
            </tr>
            <tr>
                <td align="center">年龄：</td>
                <td><input type="text" name="age"></td>
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
<script type="text/javascript">
    var password=document.getElementById('password').innerHTML;
    var passwordCheck=document.getElementById('passwordCheck').innerHTML;
    if(password!=passwordCheck)
        alert("密码不一致")
</script>
</body>
</html>
