<%--
  Created by IntelliJ IDEA.
  User: 小刘子
  Date: 2021/4/15
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
     <title>首页</title>
     <style type="text/css">
         a {
      text-decoration: none;
      color: black;
     font-size: 18px;
    }

    h3 {
  width: 180px;
 height: 38px;
 margin: 100px auto;
 text-align: center;
 line-height: 38px;
 background: deepskyblue;
 border-radius: 4px;
}
     </style>
</head>
<body>

<h3>
     <a href="${pageContext.request.contextPath}/book/allBooks">点击进入列表页</a>
</h3>
</body>
</html>

