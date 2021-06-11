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
			<div class="notice-text">
				<h1>피해야 하는 성분 등록</h1>
				<hr style="border: solid 6px rgb(245, 147, 147); border-radius: 10px;">
				<p>꼭 피해야 하는 성분을 선택한 후 저장해 주세요.<br/>해당 성분이 분석 결과에 포함되는지 알려드릴게요!</p>			
			</div>
			<form method="POST" action="">
				<c:forEach items="${ingdList}" var="ingd">
						<c:if test="${ ingd.hazzard >= '4'}">
							<div class="form-check mt-2 mb-2">
			  					<input class="form-check-input" type="checkbox" value="${ ingd.ingd_name }" name="ingd">
			  					<label class="form-check-label" for="ingd">
			    					${ ingd.ingd_name }
			  					</label>
							</div>						
						</c:if>
				</c:forEach>
				<c:forEach items="${ingdList}" var="ingd">
						<c:if test="${ ingd.hazzard >= '4'}">
							<div class="form-check mt-2 mb-2">
			  					<input class="form-check-input" type="checkbox" value="${ ingd.ingd_name }" name="ingd">
			  					<label class="form-check-label" for="ingd">
			    					${ ingd.ingd_name }
			  					</label>
							</div>						
						</c:if>
				</c:forEach>
				<c:forEach items="${ dislikeList }" var="dislike">
					<p>${ dislike.ingd_name }</p>
				</c:forEach>
				<div class="d-flex justify-content-center">
					<input class="btn btn-lg btn-secondary mt-3" type="submit" value="저장" onclick="getValue()">				
				</div>
			</form>
		</div>
	</body>
</html>