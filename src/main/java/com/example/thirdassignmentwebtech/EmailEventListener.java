package com.example.thirdassignmentwebtech;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
@WebListener
public class EmailEventListener  implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        String attributeName = event.getName();
        if ("useremail".equals(attributeName)) {
            String username = (String) event.getValue();
            LoginEmailServlet loginEmailServlet=new LoginEmailServlet();
            loginEmailServlet.sendEmail(username);
        }
    }
}
