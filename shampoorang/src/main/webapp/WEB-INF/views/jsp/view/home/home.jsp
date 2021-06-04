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
    <link rel="stylesheet" href="/css/home/home.css">
    <title>Shampoorang</title>

  </head>

  <body>

	<div class= "container">
		<div class="card-title" >
			<h2>샴푸랑</h2>
		</div>

		<div class="card-body">
      <form class="form-signin" method="POST" onSubmit="logincall();return false">
        <button id="btn-Con" onclick = "location.href = 'result/imgSelect'" class="btn btn-lg btn-primary btn-block" type="button">그냥 쓸께요</button>
        <br>
        <button id="btn-Log" onclick = "location.href = 'home/login'" class="btn btn-lg btn-primary btn-block" type="button">로그인</button>
        <br>
        <!-- a 태그사용 -->
        <button id="btn-Reg" onclick = "location.href = 'home/register'" class="btn btn-lg btn-primary btn-block" type="button">아직 회원이 아니신가요?</button>

      </form>
      
		</div>
	</div>
</body>
</html>