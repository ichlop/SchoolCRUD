<%--
  Created by IntelliJ IDEA.
  User: chloptsi
  Date: 10/31/2021
  Time: 7:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm" %>
<html>
<head>
    <title>Welcome to our School Forms</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


<body>
<h1> Welcome to CRUD Trainer with <strong>spring boot</strong></h1>
<br>
<br>
<p fonts="italic">Choose your button</p>
<div class="btn-group">

        <form class="col-lg" action="insert" method="get">
            <input type="submit" class="btn btn-success" value="Create a trainer">
        </form>

        <form class="col-lg" action="getAllTrainers" method="get">
            <input type="submit" class="btn btn-info" value="Read a trainer">
        </form>

        <form class="col-lg" action="getAllTrainers" method="get">
            <input type="submit" class="btn btn-warning" value="Update a trainer">
        </form>

        <form class="col-lg" action="getAllTrainers" method="get">
            <input type="submit" class="btn btn-danger" value="Delete a trainer">
        </form>
</div>
</body>
</html>