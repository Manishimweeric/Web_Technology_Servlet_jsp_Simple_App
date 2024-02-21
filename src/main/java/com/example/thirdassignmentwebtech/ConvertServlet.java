package com.example.thirdassignmentwebtech;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/ConvertServlet")
public class ConvertServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //call name from form
        String decimalNumber = request.getParameter("number1");
        //call button
        String binary_buttonClicked = request.getParameter("binary");
        String hexa_buttonClicked = request.getParameter("Hexa");
        String octal_buttonClicked = request.getParameter("octal");
        String clear_buttonClicked = request.getParameter("clear");


        if ("Binary".equals(binary_buttonClicked)) {
            String binaryNumber = Integer.toBinaryString(Integer.parseInt(decimalNumber));
            request.setAttribute("numbers",decimalNumber);
            request.setAttribute("result", binaryNumber);
            request.setAttribute("status", "Decimal To Binary");

        }else if("Hexa".equals(hexa_buttonClicked)){
            String binaryNumber =Integer.toHexString(Integer.parseInt(decimalNumber));
            request.setAttribute("numbers",decimalNumber);
            request.setAttribute("result", binaryNumber);
            request.setAttribute("status", "Decimal To Hexa-decimal");


        }else if ("octal".equals(octal_buttonClicked)){
            String binaryNumber = Integer.toOctalString(Integer.parseInt(decimalNumber));
            request.setAttribute("numbers",decimalNumber);
            request.setAttribute("result", binaryNumber);
            request.setAttribute("status", "Decimal To Octal");


        }else if("clear".equals(clear_buttonClicked)){
         decimalNumber="";
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("convert.jsp");
        dispatcher.forward(request,response);


    }
}
