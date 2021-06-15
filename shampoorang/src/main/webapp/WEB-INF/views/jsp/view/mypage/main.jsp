<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="/css/mypage/main.css" rel="stylesheet">
  		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
  	</head>
	<body>
		<div class="container">
	        <div class="greeting">
	        	<hr/>
	            <h3 class="animate__animated animate__fadeInDown text-center">"${ sNick }님,<br>오늘도 건강하고<br>안전한 하루 보내세요!"</h3>
	            <hr/>
	        </div>
	        <div class="d-flex mypage-list">
	            <h1>내 성분 관리하기</h1>
	            <button class="btn bad-btn" onclick = "location.href = 'dislike/${ sid }'"><h4>피해야 하는 성분</h4></button>
	            <button class="btn search-btn" onclick = "location.href = 'resultList/${ sid }'"><h4>검색한 샴푸 성분 보기</h4></button>
				<button class="btn logout-btn" onclick = "location.href='/logout'" value="Submit"><h4>로그아웃</h4></button>
	        </div>
    	</div>
	</body>
</html>