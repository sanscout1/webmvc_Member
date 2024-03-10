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
    <span><h1>로그인 에러입니다. 다시 시도하세요</h1></span>
</c:if>
<form action="/login" method="post">
    <label>아이디
    <input type="text" name="id">
    </label>
    <label>비밀번호<br>
    <input type="password" name="pw">
    </label>
    <button type="submit">LOGIN</button>
</form>

</body>
</html>
<style>

    body {
        font-family: 'Arial', sans-serif;
        margin: 0;
        padding: 0;
        background: #f4f4f4;
    }

    h1 {
        color: rebeccapurple;
        text-align: center;
    }


    form {
        max-width: 300px;
        margin: 20px auto;
        padding: 20px;
        background: #fff;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    input[type=text], input[type=password] {
        width: 100%;
        margin-bottom: 10px;
        padding: 8px;
        border: 1px solid #ddd;
        border-radius: 4px;
    }

    button {
        width: 100%;
        margin-bottom: 10px;
        padding: 10px;
        border: none;
        border-radius: 4px;
        background: mediumpurple;
        color: white;
        cursor: pointer;
    }

    button:hover {
        background: rebeccapurple;
    }

</style>
