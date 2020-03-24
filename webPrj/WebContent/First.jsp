<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>첫 예제</title>
</head>
<body>
<%
int a = (int)(Math.random()*100+2);
int sum = 0;
for(int i = 1; i < a; i++){
	sum += i;
}%>
1+2+3+...<%=a%>까지의 합 : <%=sum%>
</body>
</html>