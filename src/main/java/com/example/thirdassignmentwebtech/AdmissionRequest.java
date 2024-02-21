package com.example.thirdassignmentwebtech;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import javax.mail.MessagingException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

@WebServlet("/AdmissionRequest")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 102410250)
public class AdmissionRequest extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.setAttribute("studentid", 20250004);
        request.setAttribute("fullnames", request.getParameter("fullname"));
        request.setAttribute("email", request.getParameter("email"));
        request.setAttribute("gender", request.getParameter("gender"));
        request.setAttribute("phone", request.getParameter("phone"));
        request.setAttribute("state", request.getParameter("state"));
        request.setAttribute("country", request.getParameter("country"));
        request.setAttribute("city", request.getParameter("city"));
        request.setAttribute("dob", request.getParameter("dob"));
        request.setAttribute("department", request.getParameter("department"));
        request.setAttribute("faculty", request.getParameter("faculty"));

        Part passportFilePart = request.getPart("passportfile");
        String passportFileName = null;
        try {
            passportFileName = getSubmittedFileName(passportFilePart);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        InputStream passportFileContent = passportFilePart.getInputStream();

        Part diplomaFilePart = request.getPart("certificatefile");
        String diplomaFileName = null;
        try {
            diplomaFileName = getSubmittedFileName(diplomaFilePart);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        InputStream diplomaFileContent = diplomaFilePart.getInputStream();

        saveFile(passportFileName, passportFileContent);
        saveFile(diplomaFileName, diplomaFileContent);

        RequestDispatcher dispatcher = request.getRequestDispatcher("AdmissionRequest.jsp");
        dispatcher.forward(request, response);
    }

    private String getSubmittedFileName(Part part) throws MessagingException {
        if(part!=null){
            String header = Arrays.toString(new String[]{part.getHeader("content-disposition")});
            for (String content : header.split(";")) {
                if (content.trim().startsWith("filename")) {
                    return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
                }
            }
        }

        return null;
    }

    private void saveFile(String fileName, InputStream fileContent) throws IOException {
        Path filePath = Paths.get("D:\\Uploadfile\\file\\" + fileName);
        Files.copy(fileContent, filePath, StandardCopyOption.REPLACE_EXISTING);
    }


}
