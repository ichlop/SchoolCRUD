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
    <title>Trainer Form</title>
</head>

<style>
    .error {
        color: red;
        font-weight: bold;
    }

</style>

<body>

<%--@elvariable id="newtrainer" type="java"--%>
<springForm:form action="insertTrainer" method="post" modelAttribute="newtrainer">

    <h2>Insert a Trainer</h2>
    <table>
        <tr>
            <td>Firstname</td>
            <td><springForm:input path="firstname"/></td>
            <td><springForm:errors path="firstname" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Lastname</td>
            <td><springForm:input path="lastname"/></td>
            <td><springForm:errors path="lastname" cssClass="error"/></td>
        </tr>

    </table>

    <input type="submit" class="btn btn-success"/>
</springForm:form>
<form action="/" method="get">
    <input type="submit" value="GO back to main page">
</form>

</body>
</html>
