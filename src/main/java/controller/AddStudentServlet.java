package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.bean.Student;
import model.bo.StudentBO;
import model.dao.StudentDAO;

import java.io.IOException;

@WebServlet(name = "AddStudentServlet", value = "/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("login") == null) {
            response.sendRedirect("/tryAgain.jsp");
            return;
        }
        getServletContext().getRequestDispatcher("/addSv.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("login") == null) {
            response.sendRedirect("/tryAgain.jsp");
            return;
        }
        Student student = new Student();
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String khoaName = request.getParameter("khoaName");
        student.setId(id);
        student.setName(name);
        student.setGender(gender);
        student.setKhoaName(khoaName);
        StudentBO.AddStudent(student);
    }
}
