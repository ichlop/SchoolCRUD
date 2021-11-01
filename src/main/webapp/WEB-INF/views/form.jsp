<%--
  Created by IntelliJ IDEA.
  User: chloptsi
  Date: 10/31/2021
  Time: 7:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to our School Forms</title>
</head>
<body>

<form action="insertTrainer" method="post" modelAttribute="newtrainer">
    <input type="submit" value="Create a trainer">
</form>
<form action="getAllTrainers" method="get">
    <input type="submit" value="Read all trainers">
</form>
<form action="updateTrainer" method="get">
    <input type="submit" value="Update a trainer">
</form>
<form action="deleteTrainer" method="delete">
    <input type="submit" value="Delete a trainer">
</form>

</body>
</html>

// todo: in forms the right action!
// todo: update method!
// todo: be more creative in main form
// todo: delete with id