﻿<!DOCTYPE html>
<html>
<%@ page
    contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>

<!DOCTYPE html>
<html>
<head>
<title>F mess</title>
	<link rel="stylesheet" href="CSS/bootstrap.min.css">
</head>
<body>



	<section class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-2"><h1>掲示板</h1></div>
			<div class="col-md-4"><h1></h1></div>
		</div>
		
<section class="container">
	<div class="row">
		<div class="col-md-4 col-md-offset-4">
			<div class="alert alert-dismissible alert-danger">
				<strong>認証に失敗しました<br>
				再度ユーザー名とパスワードを入力してください</strong>
			</div>
		</div>
	</div>
</section>


	<section class="container">
		<div class="row">
			<div class="col-md-2 col-md-offset-4"><form method="post" action="UserLogin">
				<p>ユーザーID</p><input type="text" name="aid"><br>
				<p>password</p><input type="password" name="apass"><br>
				<button type="submit" class="btn btn-primary">LOGIN</button>&nbsp;<button type="reset" class="btn btn-primary">RESET</button>
			</form></div>
		
	</section>
		
		
		

</body>
</html>   	

</body>
</html>   