<%--
  Created by IntelliJ IDEA.
  User: nguyenduc97hc
  Date: 22/07/2019
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form method="get" action="/calculating">
  <input type="text" name="firstOperand">
  <select name="operator">
    <option value="+">+</option>
    <option value="-">-</option>
    <option value="*">*</option>
    <option value="/">/</option>
  </select>
  <input type="text" name="secondOperand">
  <input type="submit" value="Tinh">
</form>
</body>
</html>
