<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: catal
  Date: 16.02.2021
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Список продуктов</title>
</head>
<body>

    <table border="1">
        <tr>
            <td>id</td>
            <td>Продукт</td>
            <td>Цена</td>
        </tr>
        <c:forEach items="${products}" var = "products">
            <tr>
                <td>

                </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
