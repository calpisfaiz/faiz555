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
			<option value="No">�ԍ�����T��</option>
			<option value="UserName">�쐬�҂���T��</option>
			<option value="Title">�^�C�g������T��</option>
	</select>
	<input type = "text" name="searchData" style="width:200px;height:25px;font-size:15px;"> 
	<input type="submit" value="����" id="search" style="width:200px;height:25px;font-size:15px;">
	</form>
	
	
	<h4 style="color:white;" align=left>���[�U�[�@�@Welcome</h4>		
	<input type="button" id="createthread"  value="�X���b�h�쐬" onclick="self.location.href='test.jsp'" align=right><br><br><br>
	
	
	<table border="1" style="color:white;" align=center width=98% height=98% cellspacing=1 cellpadding=6>

	<tr>
	<th width="15%">�ԍ�</th><th width="30%">�^�C�g��</th><th width="15%">�쐬��</th><th width="20%">���t</th><th width="5%">���X��</th>
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