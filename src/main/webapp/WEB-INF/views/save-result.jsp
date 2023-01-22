<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
  <li>id=<%=((Member)request.getAttribute("member")).getId()%></li>
  <li>username=${member.username}</li>
  <li>age=${member.age}</li>
<%-- ${} 문법으로 간편하게 자바 빈 인스턴스에 접근이 가능하다. (JSP의 EL 표현식)--%>
</ul>
<a href="/index.html">메인</a>
</body>
</html>
