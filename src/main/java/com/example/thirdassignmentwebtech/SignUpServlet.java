package com.example.thirdassignmentwebtech;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //
    String email=request.getParameter("email");
    String password=request.getParameter("password");
    String fullname=request.getParameter("fullname");
    //Session option
    HttpSession session=request.getSession();
    session.setAttribute("emaildata",email);
    session.setAttribute("passworddata",password);
    session.setAttribute("fullnames",fullname);
     //redirect to
    RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
    dispatcher.forward(request,response);
}


}
