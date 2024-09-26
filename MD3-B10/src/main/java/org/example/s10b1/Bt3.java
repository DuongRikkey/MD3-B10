package org.example.s10b1;

import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "bt3Servlet" ,value="/bt3Servlet")
public class Bt3 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products=new ArrayList<>();
        products.add(new Product(1,"Iphone 16 proMax",
                "https://store.storeimages.cdn-apple.com/1/as-images.apple.com/is/iphone-16-pro-finish-select-202409-6-9inch-deserttitanium?wid=5120&hei=2880&fmt=p-jpg&qlt=80&.v=eUdsd0dIb3VUOXdtWkY0VFUwVE8vbEdkZHNlSjBQRklnaFB2d3I5MW94NW9lRVVkRmJ5ZE03VysydEdnMXpSNEY3eHJKR1hDaEJCS2hmc2czazlldHlSTUMybCtXNXZpclhWeFpYZUcvRk5uNDBzcjA0aG5jQUJ1UTI2VzJJR1lVbWVlSEpnVXRHaTFWbTR2eGk4MUpRPT0=&traceId=1",10000,20));
        products.add(new Product(2,"Iphone 15 proMax",
                "https://store.storeimages.cdn-apple.com/1/as-images.apple.com/is/iphone-16-pro-finish-select-202409-6-9inch-deserttitanium?wid=5120&hei=2880&fmt=p-jpg&qlt=80&.v=eUdsd0dIb3VUOXdtWkY0VFUwVE8vbEdkZHNlSjBQRklnaFB2d3I5MW94NW9lRVVkRmJ5ZE03VysydEdnMXpSNEY3eHJKR1hDaEJCS2hmc2czazlldHlSTUMybCtXNXZpclhWeFpYZUcvRk5uNDBzcjA0aG5jQUJ1UTI2VzJJR1lVbWVlSEpnVXRHaTFWbTR2eGk4MUpRPT0=&traceId=1",10000,20));
        request.setAttribute("products",products);
        request.getRequestDispatcher("bt3.jsp").forward(request,response);
    }
}
