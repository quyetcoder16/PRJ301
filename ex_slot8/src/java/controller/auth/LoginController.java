/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.auth;

import dla.UserDBContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import model.User;

/**
 *
 * @author quyet
 */
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
//        String adminUser = this.getInitParameter("admin_user");
//        String adminPass = this.getInitParameter("admin_pass");
        UserDBContext db = new UserDBContext();
        User user = db.get(username, password);
        if (user != null) {
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
//            req.getRequestDispatcher("welcome.html").forward(req, resp);
            resp.sendRedirect("welcome");
        } else {
            resp.getWriter().println("login failed!");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("view/auth/login.html").forward(req, resp);
    }

}
