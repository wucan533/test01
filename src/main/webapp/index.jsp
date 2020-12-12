<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + 	request.getServerPort() + request.getContextPath() + "/";
%>

<html>
<head>
    <title>欢迎光临学生信息管理系统</title>
    <base href="<%=basePath%>">
    <script src="js/jquery-3.1.1.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"show.do",
                    type:"get",
                    dataType:"json",
                    success: function (data) {
                        alert(data)
                    }
                })
            })
        })
    </script>
</head>
<body>
<div align="center" style="color: deeppink">
    <p><h1>欢迎光临学生信息管理系统</h1></p>
    <table align="center" border="1px" width="12%">
        <tr>
            <td><a href="show.do">点击显示学生列表</a> </td>
        </tr>
        <tr>
            <td><a href="/add.jsp">点击添加学生信息</a> </td>
        </tr>
        <tr>
            <td><form action="delete.do" method="post">请输入学生学号：<input type="text" name="id"><input type="submit" value="删除"></form> </td>
        </tr>
    </table>
</div>
<button id="btn">点击</button>
<br>
<div id="btnclick" style="width: 200px; height: 200px;background-color: deepskyblue">
qqwwwe
</div>
</body>
</html>