<%@page pageEncoding="Windows-31J"
	contentType="text/html; charset=Windows-31J"%>
<!DOCTYPE html>
<html>
<head><title>サンプル掲示板</title></head>
<body>

<form action="board.action" theme="simple">
<input type="text" name="right" >
<input type="submit" value="検索">
<input type="text" name="right" >
<input type="submit" value="返信">
</form>

<actionerror/>

<table border="1" align=center width=98% heigth=98% cellaspacing=1 cellpadding=6>

<tr height = 20px>
<th width="10%">日時</th>
<th width="15%">名前</th>
<th width="30%">本文</th>
<th width="10%">番号</th>
</tr>
<tr height = 20% >
<td></td><td></td><td></td><td></td>
</tr>
<tr height = 10% >
<td></td><td></td><td></td><td></td>
</tr>


</body>
</html>