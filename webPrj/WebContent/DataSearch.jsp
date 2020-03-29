<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색 페이지</title>
</head>
<body>
<h2>정보 검색</h2>
<form action="/Data.do">
이름을 입력하세요 : <input type=text name=name>
<input type=hidden name=action value=search>
&nbsp;<%--공백 생성--%><input type=submit value=검색>
</form>
</body>
</html>