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
	<script>
		function check(){
			if (reg.newname.value == "") {
				window.alert("���[�U�[������͂��Ă�������");
				return false;
 			}
 			if (reg.newpassword.value == "") {
				window.alert("�p�X���[�h����͂��Ă�������");
				return false;
 			}
 			if (reg.password.value != reg.newpassword.value){
 				window.alert("�p�X���[�h�Ɗm�F�p�X���[�h�͓������Ȃ��I")
				return false;
			}
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
	<br><br><font face="DFKai-sb" size="6">���O�C��</font>
	<form><br><br><br><br><br><br>
	<h2>Go To Login Page </h2>
	<br><br><br><br><br><br><br><br><br><br>
	
		<input type="button" value="Login Page�I" onclick="location.href='Login.jsp'"style="width:120px;height:40px;font-size:15px;"><br>
	</form>
	</div>
	
	
	<div>	
	<!--Thread�ꗗ�@�\-->
	<br><br><font face="DFKai-sb" size="6">�X���b�h�ꗗ</font>
	<form><br><br><br><br><br><br>
		<h2>Thread�ꗗ</h2>
		<br><br><br><br><br><br><br><br><br><br>
		<input type="button" value="Thread�ꗗ�I" onclick="goreadThread()" style="width:120px;height:40px;font-size:15px;">
	</form>
	</div>
	
	
	<div>
	<!--�V�K�o�^�@�\-->
	<br><br><font face="DFKai-sb" size="6">�V�K�o�^</font><br><br><br>

	<form id="reg" name="reg" method='get' action='CreateAccountServlet' onsubmit="return check();"><br>
		���[�U�[������͂��Ă�������<br><br>
		<input type="text" name="newname">		<br><br>
		�p�X���[�h����͂��Ă�������<br><br>
		<input type="password" name="newpassword">		<br><br>
		�p�X���[�h���ē��͂��Ă�������<br><br>
		<input type="password" name="password">		<br><br><br><br><br>
		<input type="submit" value="�V�K�o�^�I" style="width:120px;height:40px;font-size:15px;">
		

	</form>
	
	</font></div>
	</div>
</body>
</html>
