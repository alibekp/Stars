<%-- 
    Document   : addstar
    Created on : Jan 23, 2018, 9:59:11 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action = "StarsEJB" method="GET">
        Star name: <input type = "text" name = "name">
            <br/> 
            Coordinate X: <input type = "text" name = "x">
            <br/> 
            Coordinate Y: <input type = "text" name = "y">
            <br/> 
            <input type = "submit" value = "Add star" />
    </body>
</html>
