<%@ page
    contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>

<html>
<head>
<title>�V�K�o�^</title>

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
</head>
<body bgcolor ="black">

<input type="button" id="index" 	 value="TOP�y�[�W�ɖ߂�" onclick="self.location.href='Index.jsp'" align=right>
	<input type="button" id="threadview"  value="�O�̃y�[�W�ɖ߂�" onclick="history.back()" align=right>
	<div id="title" align="center">
	
	<section class="container">
		<div class="row">
			<h1>�@</h1>
			<h1>�@</h1>
			<font color="white"><h1>�f����</h1>
			<h1>�V�K�o�^</h1>
		</div>
		</div>
		
		<div class="top">
		<div>
		<section class="container">
			<div class="row">
				<form method="get" action="CreateAccountServlet">

					<p><h3>���[�U�[������͂��Ă�������</h3></p><input type="text" name="newname"><br><br>
					<p><h3>�p�X���[�h����͂��Ă�������</h3></p><input type="password" name="newpassword"><br><br><br><br><br>

					<button type="submit" class="btn btn-primary" style="width:120px;height:30px;font-size:15px;">�V�K�o�^</button>
					&nbsp;&nbsp;&nbsp;
					<button type="reset" class="btn btn-primary" style="width:120px;height:30px;font-size:15px;">RESET</button>

				</form></div></div>
				
		</section>
		</div>
		</div>
		
		
	</section>
		
		
		
	</section>
	
	
</body>
</html>   