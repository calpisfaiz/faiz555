<%@page pageEncoding="Windows-31J"
	contentType="text/html; charset=Windows-31J"%>

<form name="frm1" method"POST" action="ResServlet">
���[�U�[�� : 
<input type="text" name="User">
<p>Comment</p>
<input type="text" name="Content">
<input type="hidden" name="no" value="${threadNo}">
<input type="hidden" name="username" value="${threadUsername}">
<input type="hidden" name="title" value="${threadTitle}">
<input type="hidden" name="date" value="${threadDate}">


<input type="submit" value="���M" left: 50%; top: 50%"/>
</form>
