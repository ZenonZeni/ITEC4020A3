<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="float:center; text-align:center;padding-top:5%;"> Group 3 Search Engine </div>
<div style="float:center; text-align:center; padding-top:5%;">
<form action="LuceneHandler" method="POST">
    <label for="uname">Topic Number :</label>
    <input type="text" name="number"  id="number" placeholder="Topic Number">
    <label for="Search"> Search: </label>
    <input type="text" name="title" id="title" placeholder="Enter Query">
    <input type="submit" value="search">
</form>

</div>
</body>
</html>