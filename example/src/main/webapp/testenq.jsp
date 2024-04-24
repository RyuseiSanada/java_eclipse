<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせフォーム</title>
</head>
<body>
	<form action="TestEnq" method="post">
		名前： <br>
		<input type=text name="name"> <br>
		お問い合わせの種類： <br>
		<select name="qtype">
			<option value="company">会社について</option>
			<option value="product">製品について</option>
			<option value="support">サポートについて</option>
		</select> <br>
		お問い合わせ内容： <br>
		<textarea name="body"></textarea>
		<input type="submit" value="送信">
	</form>_
</body>
</html>