<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
<html>
<head>
	<title>�z�[���y�[�W</title>
	
	<style>
		.top {
  			margin: 0px auto;/*div��ꎝ���*/
 			text-align: center;/*display: inline��ꎝ���*/
		}

		.top div {
			display: inline-block;/*�div���r*/ 
			vertical-align: top;/*�A�Z��div�s�ɕs���C��ꗥ���㛔�*/ 
			width: 30%;
			height: 500px;
			border: 3px solid #0000FF;
			border-radius:3px;margin: 2px;
  		}
	</style>
	<script>
		function goreadThread(){
			location.href="ThreadServlet";
		}
	</script>
</head>


<body bgcolor ="black">
	
	<div id="title" align="center">
	<font color="white"><h1>�I�d�q�f���I</h1><br><br><br>
	</div>
	
	
	<div class="top">
	<div>
	<!--Login�@�\-->
	<h1>���O�C��</h1>
	<form><br>
	<h2>Go To Login Page </h2><br><br>
		<br><br><br><br><br><br><br><br><br><br><br>
		<input type="button" value="Login Page�I" onclick="location.href='Login.jsp'"style="width:120px;height:40px;font-size:15px;"><br>
	</form>
	</div>
	
	
	<div>	
	<!--GUEST�@�\-->
	<h1>GUEST</h1>
	<form><br>
		<h2>Thread�ꗗ</h2><br><br>
		<br><br><br><br><br><br><br><br><br><br><br>
		<input type="button" value="Thread�ꗗ�I" onclick="goreadThread()" style="width:120px;height:40px;font-size:15px;">
	</form>
	</div>
	
	
	<div>
	<!--�V�K�o�^�@�\-->
	<h3>�V�K�o�^</h3>
	<form method='get' action='CreateAccountServlet'><br>
		���[�U�[������͂��Ă�������<br><br>
		<input type="text" name="newname">		<br><br>
		�p�X���[�h����͂��Ă�������<br><br>
		<input type="text" name="newpassword">		<br><br><br><br><br><br><br><br><br><br><br><br>
		<input type="submit" value="�V�K�o�^�I" style="width:120px;height:40px;font-size:20px;">
	</form>
	</font></div>
	</div>
</body>
</html>
