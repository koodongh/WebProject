<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%  String sNick = (String)session.getAttribute("sNick");%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="/css/mypage/main.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
	        <div class="greeting">
	            <h3>"{ <%= sNick %> }님,<br>오늘도 건강하고<br>안전한 하루 보내세요!"</h3>
	        </div>
	        <div class="d-flex mypage-list">
	            <h1>내 성분 관리하기</h1>
	            <button class="btn good-btn" onclick = "location.href = 'like'"><h4>좋아하는 성분</h4></button>
	            <button class="btn bad-btn" onclick = "location.href = 'dislike'"><h4>피해야 하는 성분</h4></button>
	            <button class="btn search-btn" onclick = "location.href = 'resultList'"><h4>검색한 샴푸 성분 보기</h4></button>
	        </div>
    	</div>
	</body>
</html>