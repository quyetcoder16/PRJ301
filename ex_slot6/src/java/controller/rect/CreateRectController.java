/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.rect;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import model.Rect;

/**
 *
 * @author quyet
 */
public class CreateRectController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int num = Integer.parseInt(req.getParameter("num"));
        ArrayList<Rect> rects = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            int w = random.nextInt(50, 101);
            int h = random.nextInt(50, 101);
            int x = random.nextInt(501 - w);
            int y = random.nextInt(501 - h);

            Rect r = new Rect();
            r.setX(x);
            r.setY(y);
            r.setW(w);
            r.setH(h);
            rects.add(r);
        }

        req.setAttribute("rects", rects);
        req.getRequestDispatcher("../view/rect/list.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("../view/rect/create.html").forward(req, resp);
    }

}
