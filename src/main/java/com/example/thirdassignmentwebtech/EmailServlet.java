package com.example.thirdassignmentwebtech;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
    @WebServlet("/EmailServlet")
    public class EmailServlet extends HttpServlet {
        public void sendEmail(String emailreceiver) {
            // Replace these values with your email configuration
            String host = "smtp.gmail.com";
            String username = "manishimweeric54@gmail.com";
            String password = "mych ritk kkya etgw";
            //email session
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
                message.setText(" Dear Thank you for submitting the admission form. Your application for has been received.\n\n"
                        + "Best regards,\nAUCA University");

                Transport.send(message);

                System.out.println("Email sent successfully!");

            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
        }


    }

