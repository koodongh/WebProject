<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link href="/css/mypage/viewIngd.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<div class="notice-text">
				<h1>피해야 하는 성분 목록</h1>
				<hr style="border: solid 6px rgb(245, 147, 147); border-radius: 10px;">
				<p>성분을 더 등록하고 싶다면 추가 버튼을,<br/>삭제하고 싶다면 X 버튼을 클릭해 주세요!</p>			
			</div>
			<div class="plus-btn d-flex justify-content-center">
				<button class="btn btn-lg btn-light " onclick = "location.href = '/mypage/dislike/${member_id}/edit'">추가하기</button>
			</div>
			<div class="dislikeList">
				<c:forEach items="${ dislikeList }" var="dislike">
					<div class="d-flex dislike-name justify-content-between mb-2">
						<li>${ dislike.ingd_name }</li>
						<button class="btn btn-sm" onclick = "location.href = '/mypage/dislike/${ dislike.member_id }/${ dislike.dislikes_id }/delete'">X</button>
					</div>
				</c:forEach>
			</div>
		</div>
	</body>
</html>