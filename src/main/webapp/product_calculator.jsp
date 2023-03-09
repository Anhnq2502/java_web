<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 09/03/2023
  Time: 10:39 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/ProductDiscountCalculatorServlet" method="post">
    Product Description: <input type="text" name = "describe" >
    List Price: <input type="number" name = "price">
    Discount Percent: <input type="number" name = "discount">
    <button type="submit">Tính</button>
</form>
</body>
</html>
