package model.bo;

import model.bean.Vacxin;
import model.dao.VacxinDAO;

import java.util.ArrayList;

public class VacxinBO {
    public static void AddVacxin(Vacxin vacxin) {
        VacxinDAO.AddVacxin(vacxin);
    }
    public static void UpdateVacxin(Vacxin vacxin) {
        VacxinDAO.UpdateVacxin(vacxin);
    }
    public static ArrayList<Vacxin> GetVacxinByMaVacxin(String MaVacxin) {
        return VacxinDAO.GetVacxinByMaVacxin(MaVacxin);
    }
    public static ArrayList<Vacxin> GetVacxinByTenVacxin(String TenVacxin) {
        return VacxinDAO.GetVacxinByTenVacxin(TenVacxin);
    }
    public static ArrayList<Vacxin> GetAllVacxin() {
        return VacxinDAO.GetAllVacxin();
    }
}
