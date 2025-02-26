/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.student;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import model.Student;
import java.sql.Date;

/**
 *
 * @author quyet
 */
public class AddStudentController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Student> listStudent = new ArrayList<>();

        String[] indexs = req.getParameterValues("index");
        for (String index : indexs) {
            String studentId = req.getParameter("stdId" + index);
            String studentName = req.getParameter("stdName" + index);
            boolean gender = req.getParameter("stdGender" + index).equals("male");
            Date dob = Date.valueOf(req.getParameter("dob" + index));
            Student newStudent = new Student(studentId, studentName, gender, dob);
            listStudent.add(newStudent);
        }

        req.setAttribute("data", listStudent);
        req.getRequestDispatcher("../view/student/list.jsp").forward(req, resp);

    }

}
