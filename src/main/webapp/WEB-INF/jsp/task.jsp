<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
  <title>This is Task</title>
  <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
</head>
<body>
<h><b>Task</b></h>

<table>
  <tr>
    <th>Title</th>
    <th>Description</th>
    <th>Priority</th>
    <th>Complexity</th>
    <th>Category</th>
  </tr>
  <tr>
    <td>${taskModel.title}</td>
    <td>${taskModel.description}</td>
    <td>${taskModel.priority}</td>
    <td>${taskModel.complexity}</td>
    <td>${taskModel.category}</td>
  </tr>
</table>