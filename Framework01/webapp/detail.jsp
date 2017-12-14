<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<style>
	table a{
		display:block;
	}
</style>
<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<script src="./js/jquery-1.12.4.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="js/bootstrap.min.js"></script>
<script>
var result=false;

$(function(){	
	$('form').submit(function(){
		return result;
	});
	$('button').eq(0).hide();
	$('button').eq(1).click(function(){
		$('button').eq(0).show();
		$('button').eq(1).hide();
		$('button').eq(2).hide();
		result=true;
		$('h1').html("update <small>Page</small>");
		$('input').eq(1).prop('readonly', false);
		$('input').eq(2).prop('readonly', false);
		
	});
	
	
	
});

</script>

<title>Insert title here</title>
</head>
<body>
<h1>Detail Page</h1>

<form action="update.do" class="form-inline" >
<div class="form-group">
	<label for="sabun" class="sr-only">sabun</label>
	<input type="text" class="form-control" value="${bean.sabun }"id="sabun" name="sabun" readonly="readonly" />
</div>
<div  class="form-group">
<label for="name" class="sr-only">name</label>
<input type="text" class="form-control" id="name" value="${bean.name }" name="name" readonly="readonly"/>
</div>
<div  class="form-group">
<label for="nalja" class="sr-only">nalja</label>
<input type="date" class="form-control" id="nalja" value="${bean.nalja }" name="nalja" readonly="readonly"/>
</div>

<button class="btn btn-default" type="submit">update</button>
<button class="btn btn-default" type="button">수정</button>
<button class="btn btn-default" type="reset">취소</button>



</form>

</body>
</html>