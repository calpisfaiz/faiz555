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
	<%
        if(session.getAttribute("username") == null) {
            out.println("NO Name");
        }
        else
            out.println("Mr. / Miss.�@"+ session.getAttribute("username"));
    %>
    </b></font>
	
	
	<form method="post" action="SearchServlet" id="formcontent" align="left">
	<select name="Search" style="width:200px;height:25px;font-size:15px;">
			<option name="No" value="No">�ԍ�����T��</option>
			<option name="UserName" value="UserName">�쐬�҂���T��</option>
			<option name="Title" value="Title">�^�C�g������T��</option>
	</select>
	<input type = "text" name="searchData" style="width:200px;height:25px;font-size:15px;"> 
	<input type="submit" value="����" id="search" style="width:200px;height:25px;font-size:15px;">
	</form>
	
	
	<input type="button" id="createthread" style="width:120px;height:30px;font-size:10px;" value="�X���b�h�쐬" onclick="self.location.href='writeThread.jsp'" align=right>
	<input type="button" id="index" style="width:120px;height:30px;font-size:10px;" value="TOP�y�[�W�ɖ߂�" onclick="self.location.href='Index.jsp'" align=right>
	<input type="button" id="threadview" style="width:120px;height:30px;font-size:10px;" value="�O�̃y�[�W�ɖ߂�" onclick="history.back()" align=right>
	<input type="button" id="logout" style="width:120px;height:30px;font-size:10px;" value="Logout" onclick="Logout()" align=right>
	<br><br><br>
	
	
	<table border="1" style="color:white;" align=center width=98% cellspacing=1 cellpadding=6>

	<tr height=10%>
	<th width="15%">�ԍ�</th>
	<th width="30%">�^�C�g��</th>
	<th width="15%">�쐬��</th>
	<th width="20%">���t</th>

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