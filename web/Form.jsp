<%-- 
    Document   : Form
    Created on : Jan 23, 2018, 5:35:03 PM
    Author     : user
--%>
<%@page import="javax.persistence.Query"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="regStarsPackage.star"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3> Star Information </h3>
     <h1><jsp:include page="/ServletJsp" /></h1> 
        <h1>Name of star</h1> 
        <form action = "addstar.jsp" method="POST">
            <input type = "submit" value = "Add Star" />
        </form>
        <form action = "NULL" method="POST">
            <input type = "submit" value = "Change Star" />
        </form>
        <form action = "NULL" method="POST">
            <input type = "submit" value = "Remove Star" />
        </form>
        <h1>Coordinate x</h1>
        <h1>Coordinate y</h1>
        <h1>Class of Star</h1>
    </body>
</html>
