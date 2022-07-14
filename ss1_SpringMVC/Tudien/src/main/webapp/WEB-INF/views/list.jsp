
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>Simple Dictionary</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form method="post">
    <input type="text" name="name" placeholder="Enter your word: "/>
    <input type = "submit" id = "submit" value = "Search"/>
    <span>${txtSearch}</span>
</form>
</body>
</html>


