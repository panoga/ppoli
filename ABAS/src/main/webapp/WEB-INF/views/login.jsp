<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script>

	$(document).ready(function(){
		$.ajax({
			type : "POST",
			url : "login.do",
			data : JSON.stringify(reqDataObject),
			contentType : "application/json; charset=UTF-8",
			success : function(){
				alert("success");
			},
			error : function(){
				alert("error");
			}
		});
	});

</script>

<body>

	<button id="login">login</button>

</body>
</html>