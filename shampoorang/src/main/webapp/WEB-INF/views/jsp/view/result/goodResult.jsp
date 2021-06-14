<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/css/result/detailResult.css">

<title>badResult</title>
</head>

<body>
	<div class="container">
		<div class="card-align-middle">
			<div class="card-title">
				<h2 class="card-title text-center">
					좋은 성분
				</h2>
			</div>
				<div class="table">
				
				   <c:forEach items="${ingdList}" var="ingd"> 
					   <c:if test="${ ingd.hazzard < '3'}">  
						<tr>      
					      
					      <h2>${ingd.ingd_name}</h2>
					      <br>
					      <h3>-${ingd.description}</h3>
		 				  <br>
					     </tr>	
					    </c:if>	
					</c:forEach>							
				<br>
			</div>
			
				<a href="<c:url value='/result/analysisView'/>">뒤로 가기</a>
		</div>
	</div>
</body>
</html>