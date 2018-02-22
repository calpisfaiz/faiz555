<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Thread View</title>
</head>

<body bgcolor ="black">
	
	<h1 style="color:white;" align=center>Thread View</h1>
	
	<form method="post" action="SearchServlet" id="formcontent" align="left">
	<select name="Search" style="width:200px;height:25px;font-size:15px;">
			<option value="No">番号から探す</option>
			<option value="UserName">作成者から探す</option>
			<option value="Title">タイトルから探す</option>
	</select>
	<input type = "text" name="searchData" style="width:200px;height:25px;font-size:15px;"> 
	<input type="submit" value="検索" id="search" style="width:200px;height:25px;font-size:15px;">
	</form>
	
	
	<h4 style="color:white;" align=left>ユーザー　　Welcome</h4>		
	<input type="button" id="createthread"  value="スレッド作成" onclick="self.location.href='test.jsp'" align=right><br><br><br>
	
	
	<table border="1" style="color:white;" align=center width=98% height=98% cellspacing=1 cellpadding=6>

	<tr>
	<th width="15%">番号</th><th width="30%">タイトル</th><th width="15%">作成者</th><th width="20%">日付</th><th width="5%">レス数</th>
	</tr>
	
	<c:forEach var="threadView" items="${threadView}">
	<tr>
		
		<td>${threadView.threadNo}</td>
		<td>${threadView.threadTitle}</td>
		<td>${threadView.threadUser}</td>
		<td>${threadView.threadDate}</td>
		<td>${threadView.threadRes}</td>
	</tr>
	</c:forEach>
	</table>

























</body>
</html>