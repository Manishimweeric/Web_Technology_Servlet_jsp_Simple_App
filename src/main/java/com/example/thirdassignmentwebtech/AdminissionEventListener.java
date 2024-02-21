package com.example.thirdassignmentwebtech;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@WebListener
public class AdminissionEventListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent event) {
        HttpServletRequest request = (HttpServletRequest) event.getServletRequest();
        if(request.getRequestURI().equals("/AdmissionRequest")){
            String username= (String) request.getSession(false).getAttribute("useremail");
            EmailServlet emailServlet =new EmailServlet();
            emailServlet.sendEmail(username);
        }
    }
    @Override
    public void requestDestroyed(ServletRequestEvent event) {
    }

}
