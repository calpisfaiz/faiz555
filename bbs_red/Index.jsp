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
			width: 350px;
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
	<h3>���O�C��</h3>
	<form method='get' action='LoginServlet'>		<br>
		�o�^�������[�U�[��<br><br>
		<input type="text" name="username">		<br><br>
		�o�^�����p�X���[�h<br><br>
		<input type="text" name="userpassword">		<br><br><br><br><br><br><br><br><br><br><br><br>
		<input type="submit" value="���O�C���I" style="width:120px;height:40px;font-size:20px;"><br>
	</form>
	</div>
	
	
	<div>	
	<!--GUEST�@�\-->
	<h3>GUEST</h3>
	<form  ><br>
		Thread�ꗗ�ɍs���܂�<br><br>
		<input type="text" name="guestname">		<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
		<input type="button" value="Guest�o�^�I" onclick="goreadThread()" style="width:120px;height:40px;font-size:20px;">
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
