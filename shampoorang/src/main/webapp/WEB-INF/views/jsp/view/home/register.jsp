<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <title>회원가입:::Shampoorang</title>

  </head>

  <body cellpadding="0" cellspacing="0" marginleft="0" margintop="0" width="100%" height="100%" align="center">

	<div class="card align-middle" style="width:30rem; margin-top:100px; height: 40rem; border-radius:20px;">
		<div class="card-title" >
			<h2 class="card-title text-center" align = "left" style="color:#000000; font-size: 50px; margin-top: 100px;">Register</h2>
		</div>
		<div class="card-body">
      <form class="form-signin" method="POST" onSubmit="logincall();return false">
<!--         <h5 class="form-signin-heading" style="font-size: 15px;">로그인 정보를 입력하세요</h5> -->        
		<label for="inputEmail" class="sr-only" >ID</label>
        <input type="text" id="uid" class="form-control" placeholder="ID" required autofocus><BR>
        <label for="inputPassword" class="sr-only" >Password</label>
        <input type="password" id="upw" class="form-control" placeholder="Password" required><br>
       	<label for="inputName" class="sr-only" >NAME</label>
        <input type="text" id="uname" class="form-control" placeholder="Name" required autofocus><BR>
<!--         <div class="checkbox">
           <label>
            <input type="checkbox" value="remember-me" style = "margin-top: 50px;"> 기억하기
          </label>
        </div> -->
        <button id="btn-Yes" class="btn btn-lg btn-primary btn-block" type="submit" style="width:25rem; height: 3rem; border-radius:10px;margin-top : 20px; color : #ffffff; background:#000000">>NEXT</button>
      </form>
      
		</div>
	</div>

	<div class="modal">
	</div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
	 <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>