<!DOCTYPE html>
<html>
<%@ page
    contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>

<html>
<head>
<title>Login Again</title>


	<style>
		.top {
  			margin: 0px auto;/*div對齊效果*/
 			text-align: center;/*display: inline對齊效果*/
		}

		.top div {
			display: inline-block;/*讓div並排*/ 
			vertical-align: top;/*就算個個div行數不同，也一律向上對齊*/ 
			width: 350px;
			height: 500px;
			border: 3px solid #0000FF;
			border-radius:3px;margin: 2px;
  		}
	</style>
</head>
<body bgcolor ="black">

<input type="button" id="index" 	 value="TOPページに戻る" onclick="self.location.href='Index.jsp'" align=right>
	<input type="button" id="threadview"  value="前のページに戻る" onclick="history.back()" align=right>
	<div id="title" align="center">
	<section class="container">
		<div class="row">
			<h1> </h1>
			<h1> </h1>
			<font color="white"><h1>掲示板</h1>
			<h1>Login Again</h1><br><br><br>
		</div>
		</div>
	<div id="title" align="center">
	<section class="container">
	<div class="row">
		<div class="col-md-4 col-md-offset-4">
			<div class="alert alert-dismissible alert-danger">
				<h1><strong>認証に失敗しました<br>
				再度ユーザー名とパスワードを入力してください</strong></h1>
			</div>
		</div>
	</div>
</section>

	<div class="top">
	<div>	
	<section class="container">
		<div class="row">
			<form method="post" action="LoginServlet">
			
					<p><h3>UserName</h3></p><input type="text" name="username"><br><br>
					<p><h3>UserPassword</h3></p><input type="password" name="userpassword"><br><br><br><br><br>

					<button type="submit" class="btn btn-primary" style="width:120px;height:30px;font-size:15px;">LOGIN</button>
					&nbsp;&nbsp;&nbsp;
					<button type="reset" class="btn btn-primary" style="width:120px;height:30px;font-size:15px;">RESET</button>

				</form></div></div>
		
	</section>
	</div>	
	</div>	
		

</body>
</html>   	
