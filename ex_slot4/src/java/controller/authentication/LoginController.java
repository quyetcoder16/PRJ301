/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.authentication;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author quyet
 */
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("username");
        String password = req.getParameter("password");

        String adminUserName = this.getInitParameter("admin_user");
        String adminPassword = this.getInitParameter("admin_password");
        String defaultLanguage = this.getServletContext().getInitParameter("default_language");
        if (userName.equals(adminUserName) && password.equals(adminPassword)) {
//            resp.getWriter().println("login successful!");
//            resp.getWriter().println("your default language is: " + defaultLanguage);
//            resp.sendRedirect("register.html");
            req.getRequestDispatcher("Welcome.html").forward(req, resp);
        } else {
            resp.getWriter().println("Login Failed!");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("Login.html").forward(req, resp);
    }

}
