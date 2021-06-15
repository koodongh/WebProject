<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>OCR</title>
		<script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
		<script src="<c:url value='/js/ocr.js'/>"></script>
		<link href="/css/result/ocrResult.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<div class="notice-text">
				<h1>샴푸 성분 분석</h1>
				<hr style="border: solid 6px rgb(76 185 249); border-radius: 10px;">
			</div>
			<div class="file">
				<h5 class="text-center">샴푸성분 캡쳐사진 업로드</h5>
				<form id="ocrForm" method="post" enctype="multipart/form-data">
					<p class="text-center">샴푸 뒷면의 성분표를 찍어주세요!</p>
					<input type="file" id="uploadFile" name="uploadFile">
					<div class="result">
						<input class="btn btn-lg mt-3" type="submit" value="텍스트 확인">
					</div>
				</form>
			</div>
			<div class="ocr">
				<h5> OCR : 이미지 텍스트 추출 결과</h5>
				<form action="/result/ocr" method="POST">
					<div class="d-flex justify-content-center">
						<textarea id="ocr_text" name="ocr_text" rows="10" cols="40" ></textarea>					
					</div>
					<div class="result-btn d-flex justify-content-center mt-3">
						<button type="submit" class="btn btn-lg" id="submit">결과 분석</button>					
					</div>
			    </form>
			</div>
		</div>
	</body>
</html>


