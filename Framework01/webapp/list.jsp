<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
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
</head>
<body>
	<h1>list page<small>--------하하하</small></h1>
	<p class="lead">나는 나는 저팔계</p>
	<table class="table table-bordered table-striped table-hover">

		<tr class="success">
			<th>사번</th>
			<th>이름</th>
			<th>날짜</th>
		</tr>
		<c:forEach items="${alist }" var="bean">
			<tr>
				<td><a href="detail.do?idx=${bean.sabun}">${bean.sabun }</a></td>
				<td><a href="detail.do?idx=${bean.sabun}">${bean.name }</a></td>
				<td><a href="detail.do?idx=${bean.sabun}">${bean.nalja }</a></td>
			</tr>
		</c:forEach>
	</table>
	<button class="btn btn-primary">버튼</button>
</body>
</html>