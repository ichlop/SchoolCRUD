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
<body>
<c:forEach items="${allTrainers}" var="trainer">
    ${trainer.id}: ${trainer.firstname} ${trainer.lastname} <br>
</c:forEach>
</body>
</html>
