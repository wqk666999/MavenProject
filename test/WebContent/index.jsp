<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<a href="test/welcome">Hello world!</a>
	
	<form action="test/request/666" method="post">
		id：<input name="id" type="text" /><br/>
		name:<input name="name" type="text"/><br/>
		age:<input name="age" type="text"/><br/>
		<input type="submit" value="提交"/>
	</form>
	
	<form action="test/testmodelandview" method="post">
		id：<input name="id" type="text" /><br/>
		name:<input name="name" type="text"/><br/>
		age:<input name="age" type="text"/><br/>
		<input type="submit" value="提交"/>
	</form>
	<br/>=====测试查询和修改
	<form action="test/testgetinfo" method="post">
		id：<input name="id" value="${requestScope.sss.id}"/><br/>
		name:<input name="name" type="text" value="${requestScope.sss.name}"/><br/>
		age:<input name="age" value="${requestScope.sss.age}"/><br/>
		<input type="submit" value="提交"/>
	</form><br/>
	<a href="test/testgetinfo">aasdasdsadas</a>
</body>
</html>