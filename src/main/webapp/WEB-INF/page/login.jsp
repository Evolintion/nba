<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form class="form-inline" action="localhost:8060/MyProject/user_login/login" method="post" enctype="application/json;charset=utf-8">
		<div class="input-group">
			<span class="input-group-addon">账号 </span> <input type="text"
				id="userName" />
		</div>
		<div class="input-group">
			<span class="input-group-addon">密码</span> <input type="text"
				id="password" />
		</div>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>