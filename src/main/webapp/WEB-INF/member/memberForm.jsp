<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>회원 가입</h1>
<form action="/member/addMember.do" method="post">
    <div>
        <label>아이디
        <input type="text" name="id">
            </label>
    </div>
    <div>
        <label>비밀번호
            <input type="text" name="password">
        </label>
    </div>
    <div>
        <label>이름
            <input type="text" name="name">
        </label>
    </div>
    <div>
        <label>이메일
            <input type="text" name="email">
        </label>
    </div>

    <div>
        <button type="submit">가입하기</button>
        <button type="reset">다시입력</button>
    </div>
</form>
</body>
</html>
