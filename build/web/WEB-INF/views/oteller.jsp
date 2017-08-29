<%-- 
    Document   : oteller
    Created on : 29.Ağu.2017, 19:29:15
    Author     : Halil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<c:forEach items="${lists}" var="otel">
    <table>
        <tr>
            <td>${otel.text}</td>
            <td>${otel.values}</td>
        </tr>
    </table>
</c:forEach>
</body>
</html>
