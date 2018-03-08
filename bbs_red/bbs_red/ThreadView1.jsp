<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Thread View</title>
	
	<script>
		function Logout(){
			location.href="LogoutServlet";
		}
	</script>
</head>

<body bgcolor ="black">
<h1 style="color:white;" align=center>Welcome To ThreadView</h1>

	<font face="DFKai-sb" size="4" style="color:yellow;" align=right><b>
	Mr./Miss<br>
	ログインすると、スレッドの投稿ができるよ！
    </b></font>
	
	
	<form method="post" action="SearchServlet" id="formcontent" align="left">
	<select name="Search" style="width:200px;height:25px;font-size:15px;">
			<option value="No">番号から探す</option>
			<option value="UserName">作成者から探す</option>
			<option value="Title">タイトルから探す</option>
	</select>
	<input type = "text" name="searchData" style="width:200px;height:25px;font-size:15px;"> 
	<input type="submit" value="検索" id="search" style="width:200px;height:25px;font-size:15px;">
	</form>
	
	<input type="button" id="login" style="width:120px;height:30px;font-size:10px;" value="GO Login" onclick="self.location.href='Login.jsp'" align=right>
	<input type="button" id="index" style="width:120px;height:30px;font-size:10px;" value="TOPページに戻る" onclick="self.location.href='Index.jsp'" align=right>
	<input type="button" id="threadview" style="width:120px;height:30px;font-size:10px;" value="前のページに戻る" onclick="history.back()" align=right>

	<br><br><br>
	
	<table border="1" style="color:white;" align=center width=98%  cellspacing=1 cellpadding=6>

	<tr height=10%>
	<th width="15%">番号</th>
	<th width="30%">タイトル</th>
	<th width="15%">作成者</th>
	<th width="20%">日付</th>

	</tr>
	
	<c:forEach var="threadView" items="${threadView}">
	
	<tr>
		<td>${threadView.threadNo}</td>
		<td>
		<a href="ResServlet?no=${threadView.threadNo}&title=${threadView.threadTitle}&username=${threadView.threadUser}&date=${threadView.threadDate}" style="color:white;">
		${threadView.threadTitle}</a>
		</td>
		<td>${threadView.threadUser}</td>
		<td>${threadView.threadDate}</td>

	</tr>
	
	</c:forEach>
	</table>


</body>
</html>