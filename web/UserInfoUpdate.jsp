<%--
  Created by IntelliJ IDEA.
  User: lunat
  Date: 2023-04-17
  Time: 오후 2:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>업데이트</title>
</head>
<body>
<%@include file="menu.jsp"%>
<h1>회원 정보 수정</h1>
<form method="post" action="/ControllerServlet?command=update">
	<p> 아이디 : <input type="text" name="id">
	<p> 비밀번호 : <input type="password" name="pw">
	<p> 이름 : <input type="text" name="name">
	<p><input type="submit" value="submit">
</form>
</body>
</html>
