<%@ page session="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Title</title>
</head>
<body>
<ul>
    <li><a href="${pageContext.request.contextPath}/hello">Hello, World! (to Log - not to browser)</a></li>
    <li><a href="${pageContext.request.contextPath}/StandaloneController">Hello, World! ( to browser)</a></li>
</ul>
</body>
</html>
