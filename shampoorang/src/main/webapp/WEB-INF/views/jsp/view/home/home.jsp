<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
 	<head>
	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <link href="/css/home/home.css" rel="stylesheet">
  	</head>
	<body>
		<div class="container">
			<div class="shampoorang">
				<h2>Shampoorang</h2>			
			</div>
			<div>
	      		<form class="form-signin d-flex home-buttons-list" method="POST" onSubmit="logincall();return false">
	        		<button id="btn-Log" onclick = "location.href = 'home/login'" class="btn btn-lg login" type="button">로그인</button>
			        <button id="btn-Reg" onclick = "location.href = 'home/register'" class="btn btn-lg signin" type="button">회원가입</button>
	        		<button id="btn-Con" onclick = "location.href = 'result/ocrResult'" class="btn btn-lg guest" type="button">그냥 쓸게요 :)</button>
	      		</form>
			</div>
		</div>
	</body>
</html>