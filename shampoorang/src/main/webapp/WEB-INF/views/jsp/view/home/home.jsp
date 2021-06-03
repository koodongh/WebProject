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
	
    <title>Shampoorang</title>

  </head>

  <body cellpadding="0" cellspacing="0" marginleft="0" margintop="0" width="100%" height="100%" align="center">

	<div class="card align-middle" style="width:30rem; margin-top:100px; height: 40rem; border-radius:20px;">
		<div class="card-title" >
			<h2 class="card-title text-center" style="color:#000000; font-size: 60px; margin-top: 100px;">샴푸랑</h2>
		</div>

		<div class="card-body">
      <form class="form-signin" method="POST" onSubmit="logincall();return false">
        <button id="btn-Con" onclick = "location.href = 'result/result'" class="btn btn-lg btn-primary btn-block" type="button" style="width:25rem; height: 3rem; border-radius:10px;margin-top : 20px; color : #ffffff; background:#000000">그냥 쓸께요</button>
        <button id="btn-Log" onclick = "location.href = 'home/login'" class="btn btn-lg btn-primary btn-block" type="button" style="width:25rem; height: 3rem; border-radius:10px;margin-top : 20px; color : #ffffff; background:#000000">로그인</button>
        <!-- a 태그사용 -->
        <button id="btn-Reg" onclick = "location.href = 'home/register'" class="btn btn-lg btn-primary btn-block" type="button" style="width:25rem; height: 3rem; border-radius:10px;margin-top : 20px; color : #ffffff; background:#000000">아직 회원이 아니신가요?</button>

      </form>
      
		</div>
	</div>
</body>
</html>