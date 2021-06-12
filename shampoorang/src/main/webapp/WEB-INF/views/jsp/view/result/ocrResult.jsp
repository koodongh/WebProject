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
			<h2>샴푸 분석</h2>
			<h3>샴푸성분 캡쳐사진 업로드</h3>
			<h4>(샴푸 성분이 보이도록 뒷면을 찍어주세요!)</h4>
				<div class="file">
					<form id="ocrForm"  method="post" enctype="multipart/form-data">	         
			         파일 :  <input type="file" id="uploadFile" name="uploadFile"> 
				</div>	
					<div class="result"> 
				         <input type="submit" value="텍스트 확인">
					</div>  
					</form><br><br>		
				
			<h3> OCR : 이미지에서 텍스트 추출 결과</h3>
			<div id="resultDiv"></div>
			
			<br><br>
			<button type="button" class="btn btn-primary" id="save-ana" onclick="location.href = 'analysisView'">결과 분석</button>
		</div>
	</body>
</html>

