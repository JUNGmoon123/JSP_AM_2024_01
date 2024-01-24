
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
		<h2>회원가입</h2>

 	<form method="POST" action="memberjoin">
		<div>
			아이디 : <input type="text" placeholder="제목을 입력해주세요" name="loginId" />
		</div>
		<div>
			비번 :
			<textarea type="text" placeholder="내용을 입력해주세요" name="loginPw"></textarea>
		</div>
		<div>
			이름 :
			<textarea type="text" placeholder="이름을 입력해주세요" name="name"></textarea>
		</div>
		<button type="submit">가입</button>
	</form>


	<div>
		<a style="color: green" href="../article/list">리스트로 돌아가기</a>
	</div>
</body>
</html>