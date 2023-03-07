<%--
  Created by IntelliJ IDEA.
  User: 李龙
  Date: 2023/3/7
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center">学员调查问卷</h1>
<form action="/question">
  您的姓名: <br/>
  <input type="text" name="name"><br/>
    <h2>您正在学的技术方向:</h2><br/>
    <select name="option">
        <option name="option">java</option>
        <option name="option">C</option>
        <option name="option">Python</option>
    </select><br/>
    <h2>您学习的目的:</h2><br/>
    <input type="checkbox" name="checkbox" value="就业找工作">就业找工作
    <input type="checkbox" name="checkbox" value="工作要求">工作要求
    <input type="checkbox" name="checkbox" value="兴趣爱好">兴趣爱好
    <input type="checkbox" name="checkbox" value="其他">其他<br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
