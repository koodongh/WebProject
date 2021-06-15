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
			<table border="1" width="800">
			 <tr><td>dislike_id</td><td>member_id</td><td>ingd_name</td>
			 	     <td>ewg</td><td>hazzard</td><td>description</td>
			 	     <td>ewg_encode</td></tr>
			<c:forEach items="${ joinList }" var="join">
				<tr><td>${join.dislike_id}</td><td>${join.member_id}</td><td>${join.ingd_name}</td>
				        <td>${join.ewg}</td><td>${join.hazzard}</td><td>${join.description}</td>
				         <td>${join.ewg_encode}</td>  </tr>
			</c:forEach> 
			</table>
			
				
		</div>
	</body>
</html>