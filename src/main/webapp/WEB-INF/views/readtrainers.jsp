<%--
  Created by IntelliJ IDEA.
  User: chloptsi
  Date: 10/31/2021
  Time: 10:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List of all the Trainers</title>
</head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


<body>

<table border="1" class="table table-striped">

    <tr>
        <th>ID</th>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${allTrainers}" var="trainer">
    <tr>

        <div class="col-lg-2">
            <td>
                    ${trainer.id}
            </td>
        </div>
        <div class="col-lg-2">
            <td>
                    ${trainer.firstname}
            </td>
        </div>
        <div class="col-lg-2">
            <td>
                    ${trainer.lastname}
            </td>
        </div>
        <div class="col-lg-2">
            <td id="edit">
                <form action="update/${trainer.id}" method="get" modelAttribute="updateTrainer">
                    <input type="submit" value="Edit" class="btn btn-warning">

                </form>
            </td>
        </div>
        <div class="col-lg-2">
            <td id="delete">
                <form action="delete/${trainer.id}" method="get">
                    <input type="submit" value="Delete" class="btn btn-danger">

                </form>
            </td>
        </div>
        <br>



    </tr>
    </c:forEach>
</table>
<form action="/" method="get">
    <input type="submit" value="GO back to main page">
</form>
</body>
</html>