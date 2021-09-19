<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body
{
background: #ffcc00;;
}

#div1
{
position: absolute;
left: 40%;
width: 350px;

margin: auto;
margin: 10 0 0 450px;

padding: 25px;
background: #fbfafb;
}
h1
{
	text-align: center;
	
}
#h1
{
	text-align: center;
	
}

.inputSubmit
{
	width: 300px;
}

</style>

</head>
<body>
<h1> SARAYA Tech Service</h1>
<div id="div1">

<p><font color="red">${errorMessage}</font></p>

<form action="/login" method="post">
<h3>Login Form</h3>
			Username: 
			<input type="text" name="name" classe="inputtext" placeholder="username">
			<br> <br>
			PassWord: 
			<input type="password" name="pass" classe="inputtext" placeholder="passWord">
			<br> <br>
			<input type ="submit" name="text">
		</form>

</div>

</body>
</html>