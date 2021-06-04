<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>샴푸 성분리스트</title>
	</head>
	<body>
		<h3>샴푸 성분리스트</h3>
 			<table border="1" width="700">
				<tr><th>성분이름</th><th>EWG등급</th><th>유해성</th>
					    <th>성분특징</th></tr>
			 
				
			   <c:forEach items="${ingdList}" var="ingd">   
					<tr>      
			      <td>${ingd.ingd_name}</td>			      
			      <td>${ingd.ewg}</td> 
			      <td>${ingd.hazzard}</td> 
			      <td>${ingd.description}</td>
 
			   </tr>		
				</c:forEach>							
				</table><br>
				<!-- <a href="/shampoorang/controller/">메인 화면으로 이동</a><br><br> -->
				<a href="<c:url value='/'/>">메인 화면으로 이동</a><!-- 같은 표현 -->
				
	</body>
				
</html>