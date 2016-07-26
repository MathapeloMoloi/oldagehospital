<%-- 
    Document   : newjsp
    Created on : Jun 7, 2016, 1:51:25 AM
    Author     : Thapi
--%>
<!DOCTYPE html>
<html>
<head>
<title>LOG IN</title>
<style>
body{
      background-image: url("sb10069454ab-001.jpg");
}
</style>
</head>

<body>
    <div class="login">
	<h1>Old Age Hospital</h1>
    <form method="post" action="LogginServlet">
            <p><input text="text" name="recepNo" id="recepNo" value="" placeholder="id"></p>
             <p><input type="password" name="username" id="username" value="" placeholder="usename"></p>
            <p><button type="submit">Login</button></p>
        </form>
</div>
</body>
</html>