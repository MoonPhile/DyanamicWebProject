<%--
  Created by IntelliJ IDEA.
  User: lunat
  Date: 2023-04-17
  Time: 오후 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>회원가입</title>
</head>
<body>
<%@include file="menu.jsp"%>
<h1>회원가입</h1>
<form action="ControllerServlet?command=insert" method="post">
	<p>아이디 : <input type="text" name="id">
	<p>비밀번호 : <input type="text" name="pw">
	<p>이름 : <input type="text" name="name">
	<p><input type="submit" value="submit"> <input type="reset"value="reset">
</form>
<%@include file="footer.jsp"%>
</body>
</html>
