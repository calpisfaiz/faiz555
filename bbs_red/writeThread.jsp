<%@ page contentType="text/html; charset=windows-31J" pageEncoding="windows-31J"%>

<html>
<head>
	<title>記入</title>
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

			<div class="row">
			<h1>　</h1>
			<h1>　</h1>
			<font face="DFKai-sb" size="4" style="color:white;" align=center><b>
			<h1>スレッド投稿</h1>
		</div>
		</div>
		
		<div class="top">
		<div>

	<form method="post" action="ThreadServlet" id="formcontent" align="center">
		<br><br>
		<h2>ユーザー名</h2>
		<h2><font color="yellow"><%if(session.getAttribute("username") == null) {
            out.println("NO Name");
        }
        else
            out.println(session.getAttribute("username"));
		%></font></h2>
		<h2>スレッドタイトル</h2>
		<input type="text" name="thread_title">
		<br><br>
	
		<br><br><br>
		
		<input type="submit" value="投稿" id="bt" style="width:100px;height:30px;font-size:15px;">
	</form></div></div>
</body>


</html>