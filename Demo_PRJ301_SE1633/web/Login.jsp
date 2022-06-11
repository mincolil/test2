<%-- 
    Document   : Login
    Created on : May 27, 2022, 1:57:31 PM
    Author     : TienPro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="LoginController" method="POST" style="margin:auto">
            Account:<input type='text' name='account' value="${account}">
            <br>Password:<input type='text' name='pass' value="${pass}">
            <br><input type='submit' name='btnLogin' value='LOGIN'>
        </form>
    </body>
</html>
