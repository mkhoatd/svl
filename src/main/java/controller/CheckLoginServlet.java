package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.bo.CheckLoginBO;

import java.io.IOException;

@WebServlet(name = "CheckLoginServlet", value = "/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destination = null;
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String url = "/tryAgain.jsp";
        if(CheckLoginBO.ExistAccount(username, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("login", "1");
            session.setMaxInactiveInterval(-1);
        }
        else {
            request.setAttribute("needRegist", "1");
        }
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
}
