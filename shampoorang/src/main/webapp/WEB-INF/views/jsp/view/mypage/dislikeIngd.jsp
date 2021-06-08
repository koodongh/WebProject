<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="/css/mypage/dislikeIngd.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<h3>샴푸 성분리스트</h3>
			<form method="POST" action="">
				<c:forEach items="${ingdList}" var="ingd">
					<div class="form-check mt-2 mb-2">
	  					<input class="form-check-input" type="checkbox" value="${ ingd.ingd_name }" id="flexCheckDefault">
	  					<label class="form-check-label" for="flexCheckDefault">
	    					${ ingd.ingd_name }
	  					</label>
					</div>   		
				</c:forEach>
				<input type="submit" value="저장">
			</form>
		</div>
	</body>
</html>