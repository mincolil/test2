<%-- 
    Document   : ForgotPass
    Created on : Jun 6, 2022, 1:37:25 PM
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
        <form action="forgot">
            Account:<input type="text" name="account">
            <br>Birthdate:<input type="text" name="dob">
            <br><input type="submit" value="Submit">
            <br>New password:<input type="text" name="pass" value="${pass}" readonly="">
        </form>
    </body>
</html>
