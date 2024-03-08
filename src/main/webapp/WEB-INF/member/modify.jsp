<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>회원 수정</h1>
<form action="/member/modMember.do" method="post">
    <div>
        <label>아이디
            ${dto.id}
            <input type="hidden" name="id" value="${dto.id}">
        </label>
    </div>
    <div>
        <label>비밀번호
            <input type="text" name="password" value="${dto.password}">
        </label>
    </div>
    <div>
        <label>이름
            <input type="text" name="name" value="${dto.name}">
        </label>
    </div>
    <div>
        <label>이메일
            <input type="text" name="email" value="${dto.email}">
        </label>
    </div>
    <div>
        <label>이메일
            <input type="text" name="regdate" value="${dto.regdate}">
        </label>
    </div>

    <div>
        <button type="submit">수정하기</button>
        <button type="reset">다시입력</button>
    </div>
</form>
</body>
</html>
