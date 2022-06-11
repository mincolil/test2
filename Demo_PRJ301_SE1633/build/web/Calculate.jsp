<%-- 
    Document   : Calculate
    Created on : May 27, 2022, 1:18:00 PM
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
        <%
            String result="";
            if(request.getAttribute("result")!=null)
                result=(String)request.getAttribute("result");
            String a="";
            if(request.getAttribute("a")!=null)
                a=(String)request.getAttribute("a");
            
        %>
        <form action="calculate" method='get'>
            Enter a:<input type='text' name='a' value="<%=a%>">
            <br>Enter b:<input type='text' name='b' value="${b}">
            <br><input type='submit' name='UCLN' value='UCLN'>
            <input type='submit' name='BCNN' value='BCNN'>
            <br>Result<input type='text' name='result' value="<%=result%>">
            
        </form>
    </body>
</html>
