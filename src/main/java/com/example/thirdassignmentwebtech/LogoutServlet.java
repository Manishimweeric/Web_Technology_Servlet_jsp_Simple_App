package com.example.thirdassignmentwebtech;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.HashMap;

@WebServlet("/LogoutServlet")
    public class LogoutServlet extends HttpServlet {
    private static final HashMap<String, HttpSession> activeSessions = new HashMap<>();
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            HttpSession session = request.getSession(false);

            if (session != null) {
                String username = (String) session.getAttribute("user");
                activeSessions.remove(username);
                session.invalidate();
            }
            response.sendRedirect("login.jsp");
        }
}
