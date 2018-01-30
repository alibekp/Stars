<%-- 
    Document   : UserReg
    Created on : Jan 27, 2018, 9:42:24 PM
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
        <form action = "UserBeanEJB" method="GET">
            Your login: <input type = "text" name = "name">
            <br/> 
            Your password: <input type = "text" name = "password">
            <br/> 
            <input type = "submit" value = "Registration" />
        </form>
    </body>
</html>
