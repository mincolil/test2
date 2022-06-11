/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author TienPro
 */
public class DemoServlet2 extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            //Nhận thông tin từ client gửi lên cho server
            int a = Integer.parseInt(request.getParameter("a"));
            int b = Integer.parseInt(request.getParameter("b"));

            //Xử lý thông tin
            int c=0;
            if (request.getParameter("UCLN") != null) {
                c = UCLN(a, b);
                //out.println("<br>Result:" + c);

            } else if (request.getParameter("BCNN") != null) {
                c = BCNN(a, b);
                //out.println("<br>Result:" + c);

            }
            
            //Response lại kết quả cho client
            request.setAttribute("result", String.valueOf(c));
            request.setAttribute("a", String.valueOf(a));
            request.setAttribute("b", String.valueOf(b));
            request.getRequestDispatcher("Calculate.jsp").forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private int UCLN(int a, int b) {
        while(a!=b){
            if (a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }

    private int BCNN(int a, int b) {
        return (a*b)/UCLN(a,b);
    }

}
