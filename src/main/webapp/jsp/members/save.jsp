<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  // jsp도 결국 서블릿으로 변환되어 사용되므로, request, response는 별도의 import 없이 사용 가능하다.
  MemberRepository memberRepository = MemberRepository.getInstance();
  System.out.println("request = " + request);
  String username = request.getParameter("username"); // GET의 쿼리스트링 방식 요청, POST의 HTML Form 전송방식 요청의 파라미터 값을 모두 꺼낼 수 있다.
  int age = Integer.parseInt(request.getParameter("age"));

  Member member = new Member(username, age);
  memberRepository.save(member);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
  <li>id=<%=member.getId()%></li>
  <li>username=<%=member.getUsername()%></li>
  <li>age=<%=member.getAge()%></li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>
