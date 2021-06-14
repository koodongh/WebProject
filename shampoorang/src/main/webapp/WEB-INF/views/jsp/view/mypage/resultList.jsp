<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="/css/mypage/resultList.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<div class="notice-text">
				<h1>검색한 샴푸 성분 보기</h1>
				<hr style="border: solid 6px rgb(173, 172, 162); border-radius: 10px;">
				<p>날짜를 선택하면 자세히 볼 수 있어요!</p>			
			</div>
			<c:forEach items="${memberAnalysisList}" var="analysis">
				<div class="result-date d-flex justify-content-center">
					<button class="date btn btn-lg btn-light mb-2">
						<fmt:formatDate value="${ analysis.joinDate }" pattern="yyyy-MM-dd a hh:mm" var="date"/>
						<c:out value="${ date }"/>
					</button>
				</div>
			</c:forEach>
		</div>
	</body>
</html>