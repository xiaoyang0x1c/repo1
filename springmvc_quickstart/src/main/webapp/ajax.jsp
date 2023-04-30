<%--
  Created by IntelliJ IDEA.
  User: Xiaoyang
  Date: 2023/4/13
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax测试</title>
</head>
<body>
<script src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
<button id="btn">ajax异步提交</button>
<script>
$("#btn").click(function(){
    let url = "${pageContext.request.contextPath}/user/ajaxRequest";
    let data = '[{"id":1,"username":"张飞"},{"id":2,"username":"刘备"}]';
    $.ajax({
        type:"POST",
        url:url,
        data:data,
        contentType:"application/json;charset=utf-8",
        success:function(response){
        alert(JSON.stringify(response))
    }
})
})
</script>
</body>
</html>
