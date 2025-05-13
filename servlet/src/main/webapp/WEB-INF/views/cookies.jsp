<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
<meta charset="UTF-8">
<title>About us</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<h1 class="ms-3 text-danger">Cookies Data Page</h1>
	<p class="ms-3">${content}!</p>
	<img class="img ms-3 mb-3" alt="" src="image/download.jpg" style="height:200px;width:200px;">
	<br>
	<a href="readcookies" class="ms-3 btn btn-primary">View cookie data</a>
</body>
</html>