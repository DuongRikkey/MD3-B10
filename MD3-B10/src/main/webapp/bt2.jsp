<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/26/2024
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Simple Calculator</h1>
<p>Calculator</p>
<form action="<%=request.getContextPath()%>/bt2Servlet" method="post">
    <span>First operand </span> <input type="number" name="firstNum"> <br>
    <select name="operator">
        <option value="-1">Addition</option>
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select> <br>
    <span>Second operand </span> <input type="number" name="secondNum"> <br>
    <input type="submit" value="submit">
</form>
</body>
</html>
