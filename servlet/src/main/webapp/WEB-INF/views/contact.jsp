<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
<meta charset="UTF-8">
<title>About us</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<h1 class="ms-3 text-danger">Contact Page</h1>
	<div class="container">
		<form action="viewdata" method="post">
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Email address</label>
		  <input type="email" name="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com" required>
		</div>
		<div class="mb-3">
		  <label for="exampleFormControlTextarea1" class="form-label">Example textarea</label>
		  <textarea name="msg" class="form-control" id="exampleFormControlTextarea1" rows="3" required></textarea>
		</div>
		<button class="btn btn-success">Submit</button>
		</form>
	</div>
</body>
</html>