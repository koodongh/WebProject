<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="/css/mypage/viewIngd.css" rel="stylesheet">
		<script type="text/javascript" src="/js/dislikeIngd.js"></script>
		<link rel="stylesheet" href="/css/result/analysisView.css">
		<title>분석 결과</title>
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
<%-- 					<h2>${ sid }</h2> --%>
					<table border="1" width=60%  table style="margin-left: auto; margin-right: auto;">
					<!--result_id랑 member_id 두개는 안떠도 괜찮다 이후수정  -->
			 		<tr><td>성분</td>
			 	     	<td>EWG등급</td><td>성분특징</td>
			 	     	</tr>
			 	     	
					<c:forEach items="${ ocrJoinList }" var="ocrJoin">
						<td>${ocrJoin.ingd_name}</td>
				        <td>${ocrJoin.ewg}</td><td>${ocrJoin.description}</td></tr>
				          
					</c:forEach> 
					</table>
					
				</div>
				
				<div class="bad-ingredient">
					<h3 class="text-center">나쁜 성분</h3>
						<c:forEach items="${ingdList}" var="ingd">
							<c:if test="${ ingd.ewg >= '3'}">   
								<tr>
						     		 "${ ingd.ingd_name }"
						   		</tr>
						   		<br>
						   	</c:if>		
						</c:forEach>
				</div>
	
				<div class="card-body">
					<form>
						<button id="btn-bad" onclick="location.href = 'badResult'"
							class="btn btn-lg btn-primary btn-block" type="button">나쁜
							성분 자세히 보기</button>
						<div class="good-ingredient">
							<h3 class="text-center">좋은 성분</h3>
								<c:forEach items="${ingdList}" var="ingd">
									<c:if test="${ ingd.ewg < '3'}">   
										<tr>
						     				 <value="${ ingd.ingd_name }" name="ingd">	
						   				</tr>
						   				<br>
					   				</c:if>		
								</c:forEach>
						</div>
						<button id="btn-good" onclick="location.href = 'goodResult'"
							class="btn btn-lg btn-primary btn-block" type="button">좋은
							성분 자세히 보기</button>
					</form>
				</div>
			</div>
		</div>
	</body>
				
</html>