<%--
  Created by IntelliJ IDEA.
  User: lunat
  Date: 2023-04-17
  Time: 오후 2:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>회원삭제</title>
</head>
<body>
<%@include file="menu.jsp"%>
<h1>회원 삭제</h1>
<form action="ControllerServlet?command=delete" method="post">
  <p>아이디 : <input type="text" name="id">
  <p><input type="submit" value="submit">
</form>
</body>
</html>
