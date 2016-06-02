<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="search" method="post">
	<p>请输入：系列、作者、类型、前后木材等关键词查询：
	<input type="text" name="info" />
	</p>
	<input type="submit" value="查询" />
</form>

	<table>
		<tr>
			<td>编号</td>
			<td>价格</td>
			<td>制造商</td>
			<td>型号</td>
			<td>类型</td>
			<td>表面木料</td>
			<td>背面木料</td>
		</tr>
		<tr>
			<td>${guitar.serialNumber }</td>
			<td>${guitar.price }</td>
			<td>${guitar.builder }</td>
			<td>${guitar.model }</td>
			<td>${guitar.type }</td>
			<td>${guitar.backWood }</td>
			<td>${guitar.topWood }</td>
		</tr>
	</table>


</body>
</html>