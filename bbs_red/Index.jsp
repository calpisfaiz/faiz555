<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
<html>
<head>
	<title>ホームページ</title>
	
	<style>
		.top {
  			margin: 0px auto;/*div對齊效果*/
 			text-align: center;/*display: inline對齊效果*/
		}

		.top div {
			display: inline-block;/*讓div並排*/ 
			vertical-align: top;/*就算個個div行數不同，也一律向上對齊*/ 
			width: 30%;
			height: 500px;
			border: 3px solid #0000FF;
			border-radius:3px;margin: 2px;
  		}
	</style>
	<script>
		function goreadThread(){
			location.href="ThreadServlet";
		}
	</script>
</head>


<body bgcolor ="black">
	
	<div id="title" align="center">
	<font color="white"><h1>！電子掲示板！</h1><br><br><br>
	</div>
	
	
	<div class="top">
	<div>
	<!--Login機能-->
	<h1>ログイン</h1>
	<form><br>
	<h2>Go To Login Page </h2><br><br>
		<br><br><br><br><br><br><br><br><br><br><br>
		<input type="button" value="Login Page！" onclick="location.href='Login.jsp'"style="width:120px;height:40px;font-size:15px;"><br>
	</form>
	</div>
	
	
	<div>	
	<!--GUEST機能-->
	<h1>GUEST</h1>
	<form><br>
		<h2>Thread一覧</h2><br><br>
		<br><br><br><br><br><br><br><br><br><br><br>
		<input type="button" value="Thread一覧！" onclick="goreadThread()" style="width:120px;height:40px;font-size:15px;">
	</form>
	</div>
	
	
	<div>
	<!--新規登録機能-->
	<h3>新規登録</h3>
	<form method='get' action='CreateAccountServlet'><br>
		ユーザー名を入力してください<br><br>
		<input type="text" name="newname">		<br><br>
		パスワードを入力してください<br><br>
		<input type="text" name="newpassword">		<br><br><br><br><br><br><br><br><br><br><br><br>
		<input type="submit" value="新規登録！" style="width:120px;height:40px;font-size:20px;">
	</form>
	</font></div>
	</div>
</body>
</html>
