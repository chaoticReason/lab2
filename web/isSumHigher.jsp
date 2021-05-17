<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Выигрыши</title>
</head>
<body>
<table>
    <tr>
        <th>Выигрыш</th>
        <th>Номер билета</th>
        <th>Можно участвовать дальше</th>
    </tr>
    <c:forEach items="${ticketsList}" var="ticket" varStatus="status">
        <tr>
            <td>${ticket.win}</td>
            <td>${ticket.num}</td>
            <td>${ticket.canGambleNext}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
