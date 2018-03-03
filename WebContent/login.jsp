<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WELCOME</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>
<body>

<div class="container">
<div class="row">
<div class="col-sm-6 mx-auto mt-5">

<form method="post" action="login">
  <div class="form-group">    
    <input name="user" type="text" class="form-control" id="exampleI" placeholder="UserName">
  </div>
  <div class="form-group">    
    <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>  
  <button type="submit" class="btn btn-primary">Sign In</button>
</form>

</div>
</div>
</div>


</body>
</html>