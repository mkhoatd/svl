package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.bean.Student;
import model.bo.KhoaBO;
import model.bo.StudentBO;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "GetAllStudentsServlet", value = "/GetAllStudentsServlet")
public class GetAllStudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("login") == null) {
            response.sendRedirect("/tryAgain.jsp");
            return;
        }
        String khoaName = request.getParameter("khoaName");
        ArrayList<String> khoaNames = KhoaBO.GetAllKhoaName();
        ArrayList<Student> students;
        if (khoaName != null && !khoaName.equals("")) {
            students = StudentBO.GetStudentsByKhoaName(khoaName);
        }
        else {
            students = StudentBO.GetAllStudents();
        }
        request.setAttribute("students", students);
        request.setAttribute("khoaNames", khoaNames);
        getServletContext().getRequestDispatcher("/svList.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
