<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<script src="./js/jquery-1.12.4.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<h1>add page</h1>

<form action="insert.do" class="form-inline" method="post">
<div class="form-group">
	<label for="sabun" class="sr-only">sabun</label>
	<input type="text" class="form-control" id="sabun" name="sabun" placeholder="사번"/>
</div>
<div  class="form-group">
<label for="name" class="sr-only">name</label>
<input type="text" class="form-control" id="name" name="name" placeholder="이름" />
</div>
<div  class="form-group">
<label for="nalja" class="sr-only">nalja</label>
<input type="date" class="form-control" id="nalja" name="nalja"/>
</div>


<button type="submit" class="btn btn-default">Submit</button>
</form>


<a class="btn btn-default" href="#" role="button">Link</a>
<button class="btn btn-default" type="submit">Button</button>
<input class="btn btn-default" type="button" value="Input">
<input class="btn btn-default" type="submit" value="Submit">

</body>
</html>