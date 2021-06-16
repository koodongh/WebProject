<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="/css/mypage/viewIngd.css" rel="stylesheet">
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous"> -->
</head>
<body>
	<div class="container2">
		<div class="notice-text">
			<h1>샴푸 관련 기사 보기</h1>
			<hr style="border: solid 6px rgb(147 191 245); border-radius: 10px;">			
		</div>
	</div>
	<div id="container">	
	        <ul class="list"> 
	            <li class="bx"style="list-style:none"> 
	               <div class="contents"> 
	                       <table class="table" style="text-align:center">
	                          <c:forEach var="url" items="${urls}" varStatus="status" begin="0"
							end="24">
							<c:if test="${titles[status.index]!=''}">
								<tr>
									<th>
									<a href="${urls[status.index]}">${titles[status.index]}</a></th>
								</tr>
							</c:if>
							</c:forEach>                         
	                       </table>
	               </div>       
	           </li>
	       </ul>      
	 </div>
</body>
</html>