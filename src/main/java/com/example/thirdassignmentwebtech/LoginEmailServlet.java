package com.example.thirdassignmentwebtech;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@WebServlet("/LoginEmailServlet")
public class LoginEmailServlet extends HttpServlet {
    public void sendEmail(String emailreceiver) {
        // Replace these values with your email configuration
        String host = "smtp.gmail.com";
        String username = "manishimweeric54@gmail.com";
        String password = "mych ritk kkya etgw";

        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username,password);
            }



        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailreceiver));
            message.setSubject("Login Message");
            message.setText(" Dear Sir Someone has logged in  to you account.Thank you .\n\n"
                    + "Best regards,\n Notification");

            Transport.send(message);
            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }


}

