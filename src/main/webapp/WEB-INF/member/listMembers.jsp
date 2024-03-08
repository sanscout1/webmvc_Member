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
        <th>기입일</th>
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
