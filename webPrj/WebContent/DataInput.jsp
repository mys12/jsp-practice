<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 입력</title>
</head>
<body>
<h2>회원 정보 입력</h2>
<form action="/Data.do" method=post>
이름 : <input type=text name=name><br>
연락처 : <input type=text name=tel><br>
<input type=submit value=저장>
<input type=reset value=취소>
</form>
</body>
</html>