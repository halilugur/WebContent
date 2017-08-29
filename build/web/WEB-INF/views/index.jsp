<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome to Spring Web MVC project</title>
</head>

<body>
    <form action="${pageContext.request.contextPath}/url" method="POST">
        <select name="url">
            <option>Antalya-Otelleri</option>
            <option>İstanbul-Otelleri</option>
        </select>
        
        <select name="istekSayisi">
            <option>0</option>
            <option>20</option>
            <option>40</option>
            <option>60</option>
            <option>80</option>
            <option>100</option>
        </select>
        
        <input type="submit" value="Otelleri Getir"/>
    </form>
</body>
</html>
