<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <link rel="stylesheet" href="/css/home/common.css">
  	</head>

	<body>
		<div class="container">
			<div class="card-title" >
				<h2>Register</h2>
			</div>
			<div class="card-body">
     			<form class="form-signin" method="POST" onSubmit="logincall();return false" action="/join">
					<p>
					<label for="inputEmail" class="sr-only" >ID</label>
       		 		<input type="text" id="uid" name="member_id" class="form-control" placeholder="ID" required autofocus>
       		 		<div class="button-location">
        			<button type="button" id="idCheck">아이디확인</button><BR> 
        			</p>
        			</div>  
        			<label for="inputPassword" class="sr-only" >Password</label>
       		 		<input type="password" id="upw" name="member_pw" class="form-control" placeholder="Password" required><br>
       				<label for="inputName" class="sr-only" >NAME</label>
       		 		<input type="text" id="uname" name="member_nickname" class="form-control" placeholder="Name" required autofocus><BR>
       		 		<input type="hidden" id="member_result_list" name="member_result_list" class="form-control" value=" ">

        			<div class="button-location">
       					<input id="btn-Yes" class="btn btn-lg btn-primary btn-block" type="submit" value="NEXT">
     				</div>
     			</form>
			</div>
		</div>
	</body>
</html>