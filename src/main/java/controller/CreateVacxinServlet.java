package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.bean.Vacxin;
import model.bo.VacxinBO;

import java.io.IOException;

@WebServlet(name = "CreateVacxinServlet", value = "/CreateVacxinServlet")
public class CreateVacxinServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Vacxin vacxin = new Vacxin();
        vacxin.setMaVacxin(request.getParameter("MaVacxin"));
        vacxin.setTenVacxin(request.getParameter("TenVacxin"));
        vacxin.setSoMui(Integer.parseInt(request.getParameter("SoMui")));
        vacxin.setMoTa(request.getParameter("MoTa"));
        vacxin.setGiaVacxin(request.getParameter("GiaVacxin"));
        vacxin.setTenHangSX(request.getParameter("TenHangSX"));
        VacxinBO.AddVacxin(vacxin);
    }
}
