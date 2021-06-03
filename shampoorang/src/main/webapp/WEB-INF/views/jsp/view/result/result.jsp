<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
  	<link rel="stylesheet" href="/css/home/basic.css"> 
    <title>index</title>

  </head>
	
<body cellpadding="0" cellspacing="0" marginleft="0" margintop="0" width="100%" height="100%" align="center">

	<div class="card align-middle" style="width:30rem; margin-top:50px; height: 80rem; border-radius:20px;">
		<div class="card-title" >
			<h2 class="card-title text-center" style="color:#000000; font-size: 30px; margin-top: 100px;">분석결과</h2>
		</div>

<div class="card-body">			
	<article  id="index"> 
            		<div id="resultBox">
            			<div class='result'>
            				<div><a href="#"><img src="<c:url value='/image/shampoo.jpg'/>"></a></div><br><br>
            				
            			<h1>전 성분</h1><br>
            				<h5>가나다라 마바사아</h5>
            				<h5>가나다라 마바사아</h5>
            				<h5>가나다라 마바사아</h5>
            				<h5>가나다라 마바사아</h5><br><br>

            			<h1>나쁜 성분</h1><br>
            				<h5>가나다라 마바사아</h5>
            				<h5>가나다라 마바사아</h5><br>
 
                		<button id="btn-bad" onclick = "location.href = 'badResult'" class="btn btn-lg btn-primary btn-block" type="button" style="width:15rem; height: 3rem; border-radius:10px;margin-top : 20px; margin-bottom : 20px; color : #ffffff; background:#000000">나쁜 성분 자세히 보기</button>
            			</div>
            			<h1>좋은 성분</h1><br>
            				<h5>가나다라 마바사아</h5>
            				<h5>가나다라 마바사아</h5><br>
            
                		<button id="btn-good" onclick = "location.href = 'goodResult'" class="btn btn-lg btn-primary btn-block" type="button" style="width:15rem; height: 3rem; border-radius:10px;margin-top : 20px; margin-bottom : 20px; color : #ffffff; background:#000000">좋은 성분 자세히 보기</button>
            			</div>
            	  
	</article>       	
    </div>     
     </div>
   </body>
 </html> 
            
            
            
            