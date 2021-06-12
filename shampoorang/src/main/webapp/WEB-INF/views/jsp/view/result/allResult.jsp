<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/css/result/allResult.css">
<title>analysisResult</title>
</head>

<body>
	<div class="container">
		<div class="card-align-middle">
			<div class="card-title">
				<h2 class="card-title text-center">분석 결과</h2>
			</div>
			<div class="shampoo-image">
				<a href="#"> <img src="/image/shampoo.jpg">
				</a>
			</div>
			<div class="all-ingredient">
				<h3 class="text-center">전 성분</h3>
				<h4 class="text-center">가나다라 마바사아</h4>
				<h4 class="text-center">가나다라 마바사아</h4>
				<h4 class="text-center">가나다라 마바사아</h4>
				<h4 class="text-center">가나다라 마바사아</h4>
			</div>

			<div class="bad-ingredient">
				<h3 class="text-center">나쁜 성분</h3>
				<h4 class="text-center">가나다라 마바사아</h4>
				<h4 class="text-center">가나다라 마바사아</h4>
			</div>

			<div class="card-body">
				<form>
					<button id="btn-bad" onclick="location.href = 'badResult'"
						class="btn btn-lg btn-primary btn-block" type="button">나쁜
						성분 자세히 보기</button>
					<div class="good-ingredient">
						<h3 class="text-center">좋은 성분</h3>
						<h4 class="text-center">가나다라 마바사아</h4>
						<h4 class="text-center">가나다라 마바사아</h4>
						<br>
					</div>
					<button id="btn-good" onclick="location.href = 'goodResult'"
						class="btn btn-lg btn-primary btn-block" type="button">좋은
						성분 자세히 보기</button>
				</form>
			</div>
		</div>
	</div>
</body>