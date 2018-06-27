<%--
  Created by IntelliJ IDEA.
  User: zhezi
  Date: 2018/6/25
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach items="${list}" var="book">
        <tr>
            <td>${book.book_id}</td>
            <td>${book.name}</td>
            <td>${book.number}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
