<%--
  Created by IntelliJ IDEA.
  User: xioix
  Date: 2024-03-08
  Time: 오전 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>login Page</title>
</head>
<body>
<c:if test="${param.result =='error'}">
    <span style="color: red"><h1>로그인 에러입니다. 다시 시도하세요</h1></span>
</c:if>
<form action="/login" method="post">
    <input type="text" name="id">
    <input type="text" name="pw">
    <button type="submit">LOGIN</button>
</form>

</body>
</html>
