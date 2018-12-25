<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<script>
$(function(){
	$("#btn").click(function(){
		var un = $("#un").val();
		var pd = $("#pd").val();
		$.ajax({
			type: "POST",
			url: "/NewsProject",
			data: "un=" + un + "&pd=" + pd,
			success: function(json){
				$("#result").html(json.message);
			}
		})
	});
})
</script>
</head>
<body>
<form action="">
	<input type="text" id="un">
	<input type="password" id="pd">
	<input type="button" id="btn" value="提交">
</form>
<div id="result"></div>
</body>
</html>