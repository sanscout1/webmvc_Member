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

<style>
    body {
        font-family: 'Arial', sans-serif;
        margin: 0;
        padding: 0;
        background: #f4f4f4;
    }

    h1 {
        color: #333;
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

    div {
        margin-bottom: 10px;
    }

    label {
        display: block;
        margin-bottom: 5px;
        color: #666;
    }

    input[type=text] {
        width: 100%;
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