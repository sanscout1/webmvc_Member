<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Todo List</title>
</head>
<body>
<h1>회원정보</h1>
<table>
    <thead>
    <tr>
        <th>아이디</th>
        <th>비밀번호</th>
        <th>이름</th>
        <th>이메일</th>
        <th>가입일</th>
        <th>수정</th>
        <th>삭제</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${dtolist}" var="dto">
    <tr>
        <td>${dto.id}</td>
        <td>${dto.password}</td>
        <td>${dto.name}</td>
        <td>${dto.email}</td>
        <td>${dto.regdate}</td>
        <td><a href="modMember.do?id=${dto.id}">수정</a></td>
        <td><a href="delMember.do?id=${dto.id}">삭제</a></td>
    </tr>
    </c:forEach>

    </tbody>
</table>

<span><a href="/member/addMember.do">회원 가입하기</a></span>
</body>
</html>

<style>
    h1 {
        text-align: center;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
        font-family: 'Noto Sans KR', sans-serif;
    }


    th {
        background-color: mediumpurple;
        color: white;
        padding: 15px;
    }


    td {
        text-align: center;
        padding: 8px;
        border-bottom: 1px solid #ddd;
    }


    tr:hover {
        background-color: #f5f5f5;
    }


    a {
        text-decoration: none;
        color: #333;
    }

    a:hover {
        font-weight: bold;
        color: mediumpurple;
    }

    span {
        display: block;
        text-align: center;
    }
    span a {
        /* inline 처럼 글자 만큼 사이즈 차지하지만 block 특성도 가진다*/
        display: inline-block;
        margin-top: 20px;
        padding: 10px 15px;
        background-color: mediumpurple;
        color: white;
        border-radius: 5px;
        font-size: 14px;
    }

    span a:hover {
        background-color: rebeccapurple;
    }

</style>
