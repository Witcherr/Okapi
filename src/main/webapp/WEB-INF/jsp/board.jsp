<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
  <title>This is board</title>
  <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
</head>
<body>
<h><b>Board</b></h>

<table>
  <tr>
    <th>Name</th>
    <th>GlobalType</th>
    <th>repURL</th>
  </tr>
  <tr>
    <td>${boardModel.name}</td>
    <td>${boardModel.globalType}</td>
    <td><a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D0%B0%D0%BF%D0%B8">${boardModel.repoURL}</a></td>
  </tr>
</table>
