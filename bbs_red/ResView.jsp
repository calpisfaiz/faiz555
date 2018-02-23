<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>RES VIEW</title>
</head>

<body bgcolor ="black">
<!--=======================================上表示=======================================-->	
	
	<table border="1" style="color:black;"  align=center width=98% height=40% cellspacing=1 cellpadding=6>
	
		<tr><td width=10% height=10% bgcolor="gray";>作成者</td>			<td bgcolor="blue";><c:forEach var="threadView" items="${threadView}">	${threadView.threadUser}	</c:forEach>	</td></tr><br>
		<tr><td width=10% height=10% bgcolor="gray";>作成時間</td>			<td bgcolor="blue";><c:forEach var="threadView" items="${threadView}">	${threadView.threadDate}	</c:forEach></td></tr>
		<tr height=20%><c:forEach var="threadView" items="${threadView}">	${threadView.threadTitle}	</c:forEach></tr>
		
	</table>

<!--=======================================Res表示=======================================-->	
	
	<table border="1" style="color:yellow;"align=center width=98% height=20% cellspacing=1 cellpadding=6>
	
		<tr>
		<th width="15%" height=5%>番号</th><th width="30%" height=5%>作成者</th><th width="15%" height=5%>内容</th><th width="20%" height=5%>日付</th>
		</tr>
		
		<c:forEach var="resView" items="${resView}">
		<tr>
		
			<td>${resView.resNo}</td>
			<td>${resView.resUser}</td>
			<td>${resView.resContent}</td>
			<td>${resView.resDate}</td>
		</tr>
		</c:forEach>
		
	</table>
	
	

	
