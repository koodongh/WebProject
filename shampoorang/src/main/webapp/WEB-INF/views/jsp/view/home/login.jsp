<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<head>
	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
 	   <link rel="stylesheet" href="/css/home/common.css">
  	</head>
  	<body>
  		<div class="container">
			<div class="card-title" >
				<h2>Log in</h2>
			</div>
			<div class="card-body">
     			<form class="form-signin" method="POST" onSubmit="logincall();return false">
        			<h5 class="form-signin-heading">로그인 정보를 입력하세요</h5>
        			<label for="inputEmail" class="sr-only" >Your  ID</label>
        			<input type="text" id="uid" class="form-control" placeholder="Your ID" required autofocus><BR>
        			<label for="inputPassword" class="sr-only" >Password</label>
       			 	<input type="password" id="upw" class="form-control" placeholder="Password" required><br>
        			<div class="button-location">
       					<button id="btn-Yes" class="btn btn-lg btn-primary btn-block" type="submit">>LOG IN</button>
     		 		</div>
     		 	</form>
			</div>
		</div>
  	</body>
</html>