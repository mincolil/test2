<%-- 
    Document   : ListUser
    Created on : Jun 6, 2022, 1:15:37 PM
    Author     : TienPro
--%>
<%@page import="Model.User" %>
<%@page import="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello ${name}</h1>
        <table>
            <tr>
                <td>Account</td>
                <td>Name</td>
                <td>Gender</td><!-- comment -->
                <td>Address</td><!-- comment -->
                <td>Birthdate</td>             
            </tr>
            <%
                ArrayList<User> list = new ArrayList<User>();
                if(requeest.getAttribute("list")!=null){
                    list=(ArrayList<User>)request.getAtribute("list");
                }
                
                for(User item:list){
                    out.print("<tr>");
                        out.print("<td>");
                        
                        out.print("</tf>");
                    out.print("</tr>")
                    
                }
            %>
        </table>
    </body>
</html>
