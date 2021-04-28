<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <title>所有书籍</title>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/book/searchBook" method="get">
        <input type="text" name="bookName">
        <input type="submit" value="搜索"/>
    </form>
<table>
    <table align="1" border="2">
    <tr>
    <th>ID</th>
    <th>书名</th>
    <th>数量</th>
    <th>描述</th>
    <th>修改</th>
    <th>删除</th>

      </tr>
         <c:forEach var="book" items="${requestScope.get('books')}">
           <tr>
            <td>${book.getBookID()}</td>
            <td>${book.getBookName()}</td>
            <td>${book.getBookCounts()}</td>
            <td>${book.getDetail()}</td>
            <td>
                <a href="${pageContext.request.contextPath}/book/toUpdateBook?bookID=${book.getBookID()}">修改</a>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/book/deleteBook?bookID=${book.getBookID()}">删除</a>
            </td>
           </tr>
    </c:forEach>
     
    </table>
    <br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="${pageContext.request.contextPath}/book/toAddBook">添加</a>

</table>
</div>
</body>
</html>
