<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    
    <!-- Bootstrap CSS -->
	<link rel="stylesheet" href="/css/home/basic.css"> 		
    <title>result</title>
    <style>

      h2{
        font-size:40px;
      }

      h3{
        font-size:30px;  
      }

      h4{
        font-size:10px;  
      }

    </style>
  </head>

  <body>
<div class="container">
	<div class="card align-middle" style="width:30rem; margin-top:100px; height: 80rem; border-radius:20px;">
		<div class="card-title" >
			<h2 class="card-title text-center" style="color:#000000; font-size: 60px; margin-top: 100px;">분석결과</h2>
		</div>

    <div><a href="#"></a><img src="<c:url value='/image/shampoo.jpg'/>" style="width:200px" ></a></div>
    
    <div class="all ingredient">
      <h3 class="text-center" style="margin-top: 20px;">전 성분</h3>
      <h4 class="text-center">가나다라 마바사아</h4>
      <h4 class="text-center">가나다라 마바사아</h4>
      <h4 class="text-center">가나다라 마바사아</h4>
      <h4 class="text-center">가나다라 마바사아</h4><br>
    </div>

    <div class="bad-ingredient" >
			<h3 class="text-center">나쁜 성분</h3>
      <h4 class="text-center">가나다라 마바사아</h4>
      <h4 class="text-center">가나다라 마바사아</h4>
     </div>

		<div class="card-body">
      <form class="form-signin" method="POST" onSubmit="logincall();return false">
        <button id="btn-bad" onclick = "location.href = 'badResult'" class="btn btn-lg btn-primary btn-block" type="button" style="width:15rem; height: 4rem; border-radius:10px;margin-top : 20px; color : #ffffff; background:#000000">나쁜 성분 자세히 보기</button>
        <div class="bad-ingredient" >
          <h3 class="text-center" style="margin-top: 20px;">좋은 성분</h3>
          <h4 class="text-center">가나다라 마바사아</h4>
          <h4 class="text-center">가나다라 마바사아</h4>
         </div>
        <button id="btn-good" onclick = "location.href = 'goodResult'" class="btn btn-lg btn-primary btn-block" type="button" style="width:15rem; height: 4rem; border-radius:10px;margin-top : 20px; color : #ffffff; background:#000000">좋은 성분 자세히 보기</button>

      </form>
      
		</div>
	</div>
  </div>
</body>
</html>  
            
            
            