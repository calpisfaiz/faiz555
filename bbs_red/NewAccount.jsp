<%@ page
    contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>

<html>
<head>
<title>新規登録</title>

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
			<h1>　</h1>
			<h1>　</h1>
			<font color="white"><h1>掲示板</h1>
			<h1>新規登録</h1>
		</div>
		</div>
		
		<div class="top">
		<div>
		<section class="container">
			<div class="row">
				<form method="get" action="CreateAccountServlet">

					<p><h3>ユーザー名を入力してください</h3></p><input type="text" name="newname"><br><br>
					<p><h3>パスワードを入力してください</h3></p><input type="password" name="newpassword"><br><br><br><br><br>

					<button type="submit" class="btn btn-primary" style="width:120px;height:30px;font-size:15px;">新規登録</button>
					&nbsp;&nbsp;&nbsp;
					<button type="reset" class="btn btn-primary" style="width:120px;height:30px;font-size:15px;">RESET</button>

				</form></div></div>
				
		</section>
		</div>
		</div>
		
		
	</section>
		
		
		
	</section>
	
	
</body>
</html>   