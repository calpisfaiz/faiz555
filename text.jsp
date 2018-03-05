<%@ page contentType="text/html; charset=windows-31J" pageEncoding="windows-31J"%>
<html>


<head>
	<title>記入</title>
<link rel="stylesheet"  href="css/style.css" type="text/css"/>
</head>
<body>
	<form method="post" action="ThreadServlet" id="formcontent" align="left">
		<p id="content">ユーザー名：<input type="text" name="thread_username"></p>
		<br>
		<p id="content">スレッドタイトル：<input type="text" name="thread_title"></p>
		<br>
			
		<p id="content"><input type="submit" value="記入" id="bt"></p>
	</form>
</body>


</html>