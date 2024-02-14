<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>등급</th>
				<th>아이디</th>
				<th>회원이름</th>
				<th>가입날짜</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list }" var="row">
			<tr>
				<td>${row.mno }</td>
				<td>${row.mgrade }</td>
				<td>${row.mid }</td>
				<td>${row.mname }</td>
				<td>
				<fmt:parseDate value="${row.mdate}" pattern="yyyy-MM-dd'T'HH:mm:SS" var="pDate" type="both"/>
           		<fmt:formatDate value="${pDate}" pattern="yyyy-MM-dd HH:mm:SS" var="newDate"/>
           		${newDate }
           		</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>