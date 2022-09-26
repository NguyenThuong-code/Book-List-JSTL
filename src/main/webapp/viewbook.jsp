<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 25/09/2022
  Time: 5:32 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Book List</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container col-md-8 mt-4">
<h3 class="text text-primary text-center">Book List</h3>
<table class="table table-bordered">
    <thead>
    <tr>
        <th>Book Id</th>
        <th>Book Title</th>
        <th>Book Author</th>
        <th>Book Price</th>
    </tr>
    </thead>
    <tbody>
<c:forEach var="book" items="${books}">
    <tr>
        <td><c:out value="${book.id}"/></td>
        <td><c:out value="${book.title}"/></td>
        <td><c:out value="${book.author}"/></td>
        <td><c:out value="${book.price}"/></td>
    </tr>
</c:forEach>
    </tbody>
</table>
</div>
</body>
</html>
