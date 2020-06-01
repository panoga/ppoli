<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<body>
<h1>
  
</h1>
<div id="jsonList"></div>
<script>
var json = {
		fruit:"과일",
		car:"차",
		pc:"컴퓨터"
	}


	$(document).ready(function(){
	    for(var key in json)
	    {
		  $("#jsonList").append("<div>"+ key +":"+ json[key] +"</div>");
	    }
	});
</script>
</body>
</html>
