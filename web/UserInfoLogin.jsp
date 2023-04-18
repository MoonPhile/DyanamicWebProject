<%--
  Created by IntelliJ IDEA.
  User: lunat
  Date: 2023-04-17
  Time: 오전 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>로그인</title>
</head>
<body>
<%@include file="menu.jsp" %>
<p style="display: inline">
<br>
		<h1 >로그인 해주세요</h1>
		<form action="ControllerServlet?command=login" method="post">
			<p>아이디 : <input type="text" name="id" style="transform: rotate(10deg)">
			<p>비밀번호 : <input type="text" name="pw">
			<p><input type="submit" value="submit">
		</form>
		<a href="UserInfoInsert.jsp">
			<button>회원가입</button>
		</a>
<%@include file="footer.jsp" %>
</body>
</html>
