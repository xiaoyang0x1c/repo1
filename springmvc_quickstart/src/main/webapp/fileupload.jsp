<%--
  Created by IntelliJ IDEA.
  User: Xiaoyang
  Date: 2023/4/16
  Time: 0:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fileupload</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/fileupload" method="post" enctype="multipart/form-data">
    名称：<input type="text" name="username"><br>
    文件：<input type="file" name="filePic"><br>
    <input type="submit" value="单文件上传">
</form>
<form action="${pageContext.request.contextPath}/fileuploads" method="post" enctype="multipart/form-data">
    名称：<input type="text" name="username"><br>
    文件1：<input type="file" name="files"><br>
    文件2：<input type="file" name="files"><br>
    <input type="submit" value="多文件上传">
</form>
</body>
</html>
