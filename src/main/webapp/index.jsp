<%--
  Created by IntelliJ IDEA.
  User: 19960412
  Date: 2019/9/7
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td>
                <input type="text" name="uname">
            </td>
        </tr>
        <tr>
            <td>密码</td>
            <td>
                <input type="text" name="pwd">
            </td>
        </tr>
        <tr>
            <td colspan="20">
                <input type="submit" value="登录">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
