<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lab2</title>
</head>
<body>
<p>
    <form method="get" action="${pageContext.request.contextPath}/getLuckyTicket">
        <label for="inputIndex">Билет от 0 до 5 </label>
        <input type="number" name="number" value="${number}" size="50" id="inputIndex"> <br>
        <button type="submit">Мой билет счастливый!</button>
    </form>

    <form method="get" action="${pageContext.request.contextPath}/getIsSumHigher">
        <label for="inputWin"> Желаемый выигрыш </label>
        <input type="sum" name="sum" value="${sum}" id="inputWin"> <br>
        <button type="submit">Посмотреть выигрыши больше введённого</button>
    </form>
</p>
</body>
</html>