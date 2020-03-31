<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
<%if(session.getAttribute("userid")!=null){ %>
1. <a href="/DataInput.jsp"><input type=button value=정보입력></a>
<br><br>
2. <a href="/Data.do?action=list"><input type=button value=목록조회></a>
<br><br>
3. <a href="/DataSearch.jsp"><input type=button value=정보검색></a>
<br><br>
<a href="/Login.do"><input type=button value=로그아웃></a> <br><br>
<%Cookie[] cookies = request.getCookies(); %>
<%for(Cookie c : cookies) {%>
쿠키이름 : <%=c.getName() %>, 쿠키 값 : <%=c.getValue() %>, 쿠키 유지 시간 : <%=c.getMaxAge() %><br>
<%} %>
<% } else { response.sendRedirect("/Login.jsp"); }%>


</body>
</html>