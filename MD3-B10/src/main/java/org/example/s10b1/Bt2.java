package org.example.s10b1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet (name = "bt2Servlet", value = "/bt2Servlet")
public class Bt2 extends HelloServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("bt2.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstOperand=Double.parseDouble(request.getParameter("firstNum"));
        double secondOperand=Double.parseDouble(request.getParameter("secondNum"));
        String operator=request.getParameter("operator");

        if(operator.equals("/") && secondOperand==0){
            request.setAttribute("message","Second number cannot be zero for division.");
        } else {
            double result=0;
            switch(operator){
                case "+":
                    result=firstOperand+secondOperand;
                    break;
                case "-":
                    result=firstOperand-secondOperand;
                    break;
                 case "*":
                     result=firstOperand*secondOperand;
                     break;
                case "/":
                    result=firstOperand/secondOperand;
                    break;
            }
            request.setAttribute("result",result);
            request.setAttribute("operator",operator);
            request.setAttribute("firstNum",firstOperand);
            request.setAttribute("secondNum",secondOperand);

            request.getRequestDispatcher("bt2_display.jsp").forward(request,response);

        }




    }
}
