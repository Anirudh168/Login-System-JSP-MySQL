<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.LoginSystem.Model.Delete" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String roll = request.getParameter("roll");
	Delete obj = new Delete();
	obj.removeData(roll);
	%>
	<script type="text/javascript">
	window.location.href = "http://localhost:8080/Login_System/index.jsp";
	</script>
</body>
</html>