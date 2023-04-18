<%--
  Created by IntelliJ IDEA.
  User: lunat
  Date: 2023-04-17
  Time: 오후 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="mvc.model.UserInfo" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<link rel="stylesheet"
	      href="./resources/css/bootstrap.min.css"/>
	<title>회원정보</title>
</head>
<body>
<%@include file="menu.jsp" %>
<div calss="container">
	<h1 class="display-5">회원목록</h1>
</div>
<div calss="container">
	<div style="padding-top: 10px">
		<table class="table table-hover">
			<tr>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
			</tr>
			<%
				List<UserInfo> userInfos = (ArrayList<UserInfo>) request.getAttribute("userInfos");
				for (UserInfo userInfo : userInfos) {
			%>
			<tr>
				<td><%=userInfo.getId()%>
				</td>
				<td><%=userInfo.getPw()%>
				</td>
				<td><%=userInfo.getName()%>
				</td>
			</tr>
			<% } %>
		</table>
	</div>
</div>
<a href="UserInfoDelete.jsp">삭제</a>
<a href="UserInfoUpdate.jsp">수정</a>
<%@include file="footer.jsp" %>

</body>
</html>
