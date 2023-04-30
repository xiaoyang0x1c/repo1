<%--
  Created by IntelliJ IDEA.
  User: Xiaoyang
  Date: 2023/4/7
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>requestParam</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/user/simpleParam?id=1&username=杰克">
    基本类型
</a>
<form action="${pageContext.request.contextPath}/user/pojoParam" method="post">
    用户编号：<input type="text" name="id"><br>
    用户名称：<input type="text" name="username"><br>
    <input type="submit" value="对象类型">
</form>
<form action="${pageContext.request.contextPath}/user/arrayParam">
    编号：<br>
    <input type="checkbox" name="ids" value="1">1<br>
    <input type="checkbox" name="ids" value="2">2<br>
    <input type="checkbox" name="ids" value="3">3<br>
    <input type="checkbox" name="ids" value="4">4<br>
    <input type="checkbox" name="ids" value="5">5<br>
    <input type="submit" value="提交数组">
</form>
<form action="${pageContext.request.contextPath}/user/queryParam" method="post">
    搜索关键词：
    <input type="text" name="keyword"><br>
    User对象：
    <input type="text" name="user.id" placeholder="编号">
    <input type="text" name="user.username" placeholder="用户名"><br>
    UserList对象：
    <input type="text" name="userList[0].id" placeholder="第一个用户编号">
    <input type="text" name="userList[0].username" placeholder="第一个用户名"><br>
    UserMap对象：
    <input type="text" name="userMap.get('u1').id" placeholder="Map中第一个用户编号">
    <input type="text" name="userMap['u1'].username" placeholder="Map中第一个用户名"><br>
    <input type="text" name="userMap['u2'].id" placeholder="Map中第二个用户编号">
    <input type="text" name="userMap['u2'].username" placeholder="Map中第二个用户名"><br>
    <input type="submit" value="复杂类型">
</form>
<form action="${pageContext.request.contextPath}/user/converterParam">
    生日：<input type="text" name="birthday">
    <input type="submit" value="自定义类型转换器">
</form>
<a href="${pageContext.request.contextPath}/user/findByPage?pageNo=2">
    分页查询
</a>
</body>
</html>
