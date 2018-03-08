<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>RES VIEW</title>
</head>

<body bgcolor ="black">
<!--=======================================Res返信=======================================-->	

<div>
		<form method='post' action='ResServlet'>
			<table style="color:white;">
				<tr><td><font face="DFKai-sb" size="5" style="color:white;" >ユーザー</font></td><td>
				<font face="DFKai-sb" size="4" style="color:yellow;"><b>
				<%if(session.getAttribute("username") == null) {
					out.println("NO Name");
				}else
            	out.println(session.getAttribute("username"));%></b></font></td></tr>
				<tr><td colspan="2"><font face="DFKai-sb" size="5" style="color:white;" >返信内容</font></td></tr>
				<tr><td colspan="2">
					<textarea id="textbox" type='text' name='Content' maxlength="500"></textarea>
					<input type="hidden" name="no" value="${threadNo}">
					<input type="hidden" name="username" value="${threadUsername}">
					<input type="hidden" name="title" value="${threadTitle}">
					<input type="hidden" name="date" value="${threadDate}">

				</td></tr>
				<tr><td align="right" colspan="2"><input type="submit" value="送信 "></td></tr>
				<form>
			</font></table>
		</form>
	</div>
	
<!--=======================================上表示=======================================-->	
	<input type="button" id="index" 	 value="TOPページに戻る" onclick="self.location.href='Index.jsp'" align=right>
	<input type="button" id="threadview"  value="前のページに戻る" onclick="history.back()" align=right>
	
	<table border="0" style="color:black;" align=center width=98% height=10% cellspacing=1 cellpadding=6>
			
		<tr height=20%><td><font face="DFKai-sb" size="5" color="white"><h3 align=center>No.${threadNo}</h3></font></td></tr>
		
		
	</table>
	<table border="1" style="color:black;"  align=center width=98% height=20% cellspacing=1 cellpadding=6>
	
		<tr><td width=10% height=10% bgcolor="#999999";><font face="DFKai-sb" size="4" color="black"><b>作成者</td>			
		<td bgcolor="#0066ff";><font face="DFKai-sb" size="4" color="black"><b>${threadUsername}</td></tr><br>
		
		<tr><td width=10% height=10% bgcolor="#999999";><font face="DFKai-sb" size="4" color="black"><b>作成時間</td>			
		<td bgcolor="#0066ff";><font face="DFKai-sb" size="4" color="black"><b>${threadDate}</td></tr>
	</table>

	<table border="1" style="color:black;" align=center width=98% height=20% cellspacing=1 cellpadding=6>
			
		<tr height=20%><td><font face="DFKai-sb" size="7" color="white"><b><h3 align=center>${threadTitle}</h3></b></font></td></tr>
		
	</table>
	
	


<!--=======================================Res表示=======================================-->	
	
	<table border="1" style="color:yellow;"align=center width=98% height=20% cellspacing=1 cellpadding=6>
	
		<tr>
		<th width="15%" height=5%>番号</th><th width="30%" height=5%>作成者</th><th width="15%" height=5%>内容</th><th width="20%" height=5%>日付</th>
		</tr>
		
		<c:forEach var="resView" items="${resView}">
		<tr>
		
			<td>${resView.resNo}</td>
			<td>${resView.userName}</td>
			<td>${resView.resContent}</td>
			<td>${resView.resDate}</td>
		</tr>
		</c:forEach>
		
	</table>
	
	

	
