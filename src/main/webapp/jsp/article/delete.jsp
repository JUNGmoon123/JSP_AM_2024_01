<%@ page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
Map<String, Object> articleRow = (Map<String, Object>) request.getAttribute("articleRow");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물을 삭제했습니다.</title>
</head>
<body>
	<h1>삭제</h1>
	<div><a style="color:green" href="list">리스트로 돌아가기</a></div>
</body>
</html>