<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 페이지</title>
</head>
<body>
<%if(request.getAttribute("tel")==null) { %>
입력하신 이름은 <%=request.getParameter("name")%>. 현재 데이터가 없습니다.
<% }else{ %>
이름 : <%=request.getParameter("name")%><br>
연락처 : <%=request.getAttribute("tel")%>
<% } %>


</body>
</html>