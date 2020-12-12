<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/11
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息注册界面</title>
</head>
<body>
<div style="color: blue" align="center">
    <form action="/add.do" method="post">
        <table border="1px" width="20%">
            <tr>
                <td>姓名：</td>
                <td><input type="text" name="name"/> </td>
            </tr>
            <tr>
                <td>年龄：</td>
                <td><input type="text" name="age"/> </td>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;</td>
                <td><input type="submit" value="提交"/> </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
