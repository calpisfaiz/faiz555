<%@ page contentType="text/html; charset=windows-31J" pageEncoding="windows-31J"%>

<html>
<head>
	<title>�L��</title>
	<style>
		.top {
  			margin: 0px auto;/*div��ꎝ���*/
 			text-align: center;/*display: inline��ꎝ���*/
		}

		.top div {
			display: inline-block;/*�div���r*/ 
			vertical-align: top;/*�A�Z��div�s�ɕs���C��ꗥ���㛔�*/ 
			width: 350px;
			height: 400px;
			border: 3px solid #0000FF;
			border-radius:3px;margin: 2px;
  		}
	</style>
</head>
<body bgcolor ="black">

<input type="button" id="index" 	 value="TOP�y�[�W�ɖ߂�" onclick="self.location.href='Index.jsp'" align=right>
<input type="button" id="threadview"  value="�O�̃y�[�W�ɖ߂�" onclick="history.back()" align=right>

	<div id="title" align="center">

			<div class="row">
			<h1>�@</h1>
			<h1>�@</h1>
			<font face="DFKai-sb" size="4" style="color:white;" align=center><b>
			<h1>�X���b�h���e</h1>
		</div>
		</div>
		
		<div class="top">
		<div>

	<form method="post" action="ThreadServlet" id="formcontent" align="center">
		<br><br>
		<h2>���[�U�[��</h2>
		<h2><font color="yellow"><%if(session.getAttribute("username") == null) {
            out.println("NO Name");
        }
        else
            out.println(session.getAttribute("username"));
		%></font></h2>
		<h2>�X���b�h�^�C�g��</h2>
		<input type="text" name="thread_title">
		<br><br>
	
		<br><br><br>
		
		<input type="submit" value="���e" id="bt" style="width:100px;height:30px;font-size:15px;">
	</form></div></div>
</body>


</html>