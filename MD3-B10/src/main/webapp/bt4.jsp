<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/26/2024
  Time: 9:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/bt4Servlet" method="post">
<table class="table table_bordered">
    <tr>
        <td>Name <input type="text" name="name" >  </td>
    </tr>
<%--    <tr>--%>
<%--        <td><button>Upload File</button></td>--%>
<%--    </tr>--%>

    <tr>

        <td>Price <input type="number" name="price" value="price"> </td>
    </tr>
    <tr>
        <td>Stock <input type="number" name="stock" value="stock"> </td>
    </tr>
    <tr>
        <td><input type="submit" name="AddProduct" value="AddNewProduct"> </td>
    </tr>
</table>
    </form>
</body>
</html>
