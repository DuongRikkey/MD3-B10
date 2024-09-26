package org.example.s10b1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "bt4Servlet" ,value="/bt4Servlet")
public class Bt4 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("bt4.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Double price = Double.parseDouble(request.getParameter("price"));
        Double stock = Double.parseDouble(request.getParameter("stock"));

        request.setAttribute("name",name);
        request.setAttribute("price",price);
        request.setAttribute("stock",stock);
        request.getRequestDispatcher("bt4_display.jsp").forward(request,response);
    }

}
