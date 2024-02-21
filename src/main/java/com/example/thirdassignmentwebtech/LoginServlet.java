package com.example.thirdassignmentwebtech;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String password=request.getParameter("password");
        String username=request.getParameter("username");

        HttpSession session =request.getSession();
        Object pass=session.getAttribute("passworddata");
        Object user=session.getAttribute("emaildata");

        if(pass.equals(password) && user.equals(username)){

            HttpSession sessiondata = request.getSession();
            sessiondata.setAttribute("useremail", user);

            RequestDispatcher dispatcher = request.getRequestDispatcher("applyform.jsp");
            dispatcher.forward(request,response);
        }else{
            request.setAttribute("result","User name or Password Incorrect");
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request,response);
    }

}
