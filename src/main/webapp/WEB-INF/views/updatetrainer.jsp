<%--
  Created by IntelliJ IDEA.
  User: chloptsi
  Date: 10/31/2021
  Time: 7:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm" %>
<html>
<head>
    <h2>Update Trainer</h2>
</head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<style>
    .error {
        color: red;
        font-weight: bold;
    }

</style>

<body>
<%--@elvariable id="updatetrainer" type="java"--%>
<springForm:form action="/updateTrainer" method="post" modelAttribute="updatetrainer">

    <p>Update a Trainer</p>
    <table>
        <springForm:hidden path="id" />
        <tr>
            <td>Firstname(new)</td>
            <td><springForm:input path="firstname"/></td>
            <td><springForm:errors path="firstname" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Lastname(new)</td>
            <td><springForm:input path="lastname"/></td>
            <td><springForm:errors path="lastname" cssClass="error"/></td>
        </tr>

    </table>

    <input type="submit" class="btn btn-success"/>
</springForm:form>


</body>
</html>
