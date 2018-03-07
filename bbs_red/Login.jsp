<%@ page
    contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>

<html>
<head>
<title>Login</title>

	<style>
		.top {
  			margin: 0px auto;/*div對齊效果*/
 			text-align: center;/*display: inline對齊效果*/
		}

		.top div {
			display: inline-block;/*讓div並排*/ 
			vertical-align: top;/*就算個個div行數不同，也一律向上對齊*/ 
			width: 350px;
			height: 400px;
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
			<font color="white" >
			<font size="7">Login</font><br><br>
		</div>
		</div>
		
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
		
		
	</section>
		
		
		
	</section>
	
	
</body>
</html>   