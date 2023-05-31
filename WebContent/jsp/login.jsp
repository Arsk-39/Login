<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${errormsg != null }">${errormsg}</c:if>
<c:if test="${errormsg != null }">${eroormsg}</c:if>
<c:remove var="errormsg"/>
<p>パスワード</p>
<form action="/LoginServlet" method="post">
<input type="text" name="user_id">
<input type="password" name="password">
<input type="submit" value="ログイン">
</form>
</body>
</html>