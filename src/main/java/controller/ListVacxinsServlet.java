package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.bean.Vacxin;
import model.bo.VacxinBO;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ListVacxinsServlet", value = "/ListVacxinsServlet")
public class ListVacxinsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String MaVacxin = request.getParameter("MaVacxin");
        String TenVacxin = request.getParameter("TenVacxin");
        ArrayList<Vacxin> vacxins = VacxinBO.GetAllVacxin();
        if (MaVacxin != null && MaVacxin !="") {
            vacxins= VacxinBO.GetVacxinByMaVacxin(MaVacxin);
        }
        if (TenVacxin != null && TenVacxin !="") {
            vacxins= VacxinBO.GetVacxinByTenVacxin(TenVacxin);
        }
        request.setAttribute("vacxins", vacxins);
        request.getRequestDispatcher("vacxins.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
