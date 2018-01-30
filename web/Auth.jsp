<%-- 
    Document   : Auth
    Created on : Jan 23, 2018, 4:57:03 PM
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
        <form action = "AuthServlet" method="POST">
            login: <input type = "text" name = "login">
            <br/> 
            password: <input type = "text" name = "pass">
            <br/> 
            <input type = "submit" value = "enter" />
        </form>
        <br/> 
        <form action = "UserReg.jsp" method="POST">
           <input type = "submit" value = "Registration" />
        </form>
    </body>
</html>
