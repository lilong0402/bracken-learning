<%--
  Created by IntelliJ IDEA.
  User: 李龙
  Date: 2023/3/7
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>

</head>

<body>
<form action="/login" method="get">
    用户名：<input type="text" name="username"><br/>
    <div id="usernameinfo"></div><br/>
    密码： <input type="password" name="password"><br/>
    <div id="passwordinfo"></div>
    <input type="submit" id="submit" value="提交">
</form>
</body>
</html>
