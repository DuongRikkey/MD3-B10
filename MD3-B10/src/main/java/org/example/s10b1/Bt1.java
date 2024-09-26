package org.example.s10b1;

import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "bt1Servlet", value = "/bt1Servlet")
public class Bt1 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Duong", "Hà Nội", "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQgByBT5IiAT_a2x9pUVb4VMoOrlzHH7Jrzj-HB5jzHlR4lNLMS", LocalDate.of(2001, 7, 28)));
        customers.add(new Customer(2, "Duy", "Hà Bắc", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR38FR6TfjK6mRHwBF8ZUvvKnKk5ljk-gFbIg&s", LocalDate.of(2000, 2, 2)));

        req.setAttribute("customers", customers);
        req.getRequestDispatcher("bt1.jsp").forward(req, res);
    }
}

