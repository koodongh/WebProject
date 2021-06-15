<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="/css/mypage/viewIngd.css" rel="stylesheet">
		<script type="text/javascript" src="/js/dislikeIngd.js"></script>
	</head>
	<body>
		<div class="container">		
			<table border="1" width="800">
			 <tr><td>dislike_id</td><td>member_id</td><td>ingd_name</td></tr>
			<c:forEach items="${ dislikeList }" var="dislike">
				<tr><td>${dislike.dislike_id}</td><td>${dislike.member_id}</td><td>${dislike.ingd_name}</td></tr>
			</c:forEach> 
			</table>
			
				
		</div>
		
	
	</body>
</html>