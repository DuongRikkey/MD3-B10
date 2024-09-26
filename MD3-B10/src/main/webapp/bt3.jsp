<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/26/2024
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách sản phẩm</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        img {
            width: 100px;
            height: 100px;
        }
        .bt1{
            background-color: red;
        }
        .bt2{
            background-color: aqua;
        }
    </style>
</head>
<body>
<h1>Danh sách sản phẩm</h1>
<table>
    <tr>
        <th>STT</th>
        <th>Name</th>
        <th>Image</th>
        <th>Price</th>
        <th>Stock </th>
        <th colspan="2">Action</th>
    </tr>

    <c:forEach items="${products}" var="pro">
        <tr>
            <td>${pro.id}</td>
            <td>${pro.name}</td>
            <td><img src="${pro.image}" alt="Customer Image"></td>
            <td>${pro.price} </td>
            <td>${pro.stock} </td>
            <td > <button class="bt1"> Edit</button></td>
            <td > <button class="bt2"> Delete</button></td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
