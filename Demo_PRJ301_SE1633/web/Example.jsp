<%-- 
    Document   : Example
    Created on : May 25, 2022, 1:30:22 PM
    Author     : TienPro
--%>
<!--Đây là dòng comment-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //Đây là scriptlet
            //Nơi chứa code giống Java
            String message="Hello world!";
            out.println(message);
            
            //Khởi tạo 2 biến số nguyên a,b
            //Hiển thị kết quả a+b,a-b,a*b,a/b,a%b
            //int a=Integer.parseInt(request.getParameter("a"));
            int a=(int)request.getAttribute("a");
            int b=(int)request.getAttribute("b");
            //out.println("<br>a+b="+(a+b));
            //out.println("<br>a-b="+(a-b));
            //out.println("<br>a*b="+(a*b));
            //out.println("<br>a/b="+(a/b));
            //out.println("<br>a%b="+(a%b));
        %>
        
        <%!
            String message="Hello JSP";
        %>
        
        <br>a=<%=a%>
        <br>b=<%=b%>
        <br><%=a%>+<%=b%>=<%=a+b%>
        <br><%=a%>-<%=b%>=<%=a-b%>
        <br><%=a%>*<%=b%>=<%=a*b%>
        <br><%=a%>/<%=b%>=<%=a/b%>
    </body>
</html>
