<%--
  Created by IntelliJ IDEA.
  User: 小刘子
  Date: 2021/4/21
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/book/updateBook" method="get">
      <input type="hidden" name="bookID" value="${book.bookID}">
    书名：<input type="text " name="bookName" value="${book.bookName}"><br/>
    数量：<input type="text " name="bookCounts" value="${book.bookCounts}"><br/>
    描述：<input type="text " name="detail" value="${book.detail}"><br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" value="提交"/>
</form>
</body>
</html>
