<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		
		<link rel="stylesheet" href="/css/result/analysisView.css">
		<title>분석 결과</title>
	</head>
	<body>
		<div class="container">
			<div class="card-align-middle">
				<div class="notice-text">
					<h1>분석 결과</h1>
					<hr style="border: solid 6px rgb(245, 147, 147); border-radius: 10px;">
				</div>
				
				<div class="shampoo-image">
					<a href="#"> 
						<img src="/image/shampoo.jpg">
					</a>
				</div>

				<div class="dislike-ingd mt-3 mb-5">
					<h4 class="text-center">피해야 하는 성분</h4>
					<c:forEach items="${ ocrJoinList }" var="ocr">				
						<c:set var="break" value="false" />
						<c:forEach items="${ dislikeList }" var="dislike">
							<c:if test="${break ne true}">
								<c:choose>
									<c:when test="${ dislike.ingd_name eq ocr.ingd_name }">
										<c:set var="checkedValue" value="checked" />	
										<c:set var="break" value="true" />			
									</c:when>
									<c:otherwise>
										<c:set var="checkedValue" value="" />								
									</c:otherwise>							
								</c:choose>							
							</c:if>					
						</c:forEach> 	
						<c:if test="${checkedValue eq 'checked'}">
							<div class="form-check mt-2 mb-2">
								<li>${ ocr.ingd_name }</li>
							</div>
						</c:if>	
					</c:forEach>
				</div>
				
				<div class="all-ingredient">
					<h4 class="text-center">전 성분</h4>
					<table class="table">
					  <thead>
					    <tr>
					      <th scope="col">성분명</th>
					      <th scope="col">EWG</th>
					      <th scope="col">유해성</th>
					      <th scope="col">증상</th>
					    </tr>
					  </thead>
					  <tbody class="mb-4">
						<c:forEach items="${ ocrJoinList }" var="ocrJoin">
							<tr>
						      <td>${ocrJoin.ingd_name}</td>
						      <td>${ocrJoin.ewg}</td>
						      <c:choose>
						      	<c:when test="${ocrJoin.hazzard <= '2'}">
						      		<td><span class="badge bg-light text-dark">&nbsp;&nbsp;&nbsp;${ocrJoin.hazzard}&nbsp;&nbsp;&nbsp;</span></td>
						      	</c:when>
						      	<c:when test="${3 < ocrJoin.hazzard <= '6'}">
						      		<td><span class="badge bg-warning text-dark">&nbsp;&nbsp;&nbsp;${ocrJoin.hazzard}&nbsp;&nbsp;&nbsp;</span></td>
						      	</c:when>
						      	<c:otherwise>
						      		<td><span class="badge bg-danger">&nbsp;&nbsp;&nbsp;${ocrJoin.hazzard}&nbsp;&nbsp;&nbsp;</span></td>
						      	</c:otherwise>
						      </c:choose>
						      <td>${ocrJoin.description}</td>       
						</c:forEach>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
				
</html>