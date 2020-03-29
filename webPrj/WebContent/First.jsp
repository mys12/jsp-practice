<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>첫 예제</title>
</head>
<body>
<%int total = 0;
int a = (int)(Math.random()*100+2);
for(int i = 1; i<a; i++){
	total += i;
}%>
1+2+3...<%=a%>까지 더한 값: <%=total%>
</body>
</html>