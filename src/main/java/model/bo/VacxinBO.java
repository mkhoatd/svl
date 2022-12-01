package model.bo;

import model.bean.Vacxin;
import model.dao.VacxinDAO;

public class VacxinBO {
    public static void AddVacxin(Vacxin vacxin) {
        VacxinDAO.AddVacxin(vacxin);
    }
    public static void UpdateVacxin(Vacxin vacxin) {
        VacxinDAO.UpdateVacxin(vacxin);
    }
    public static Vacxin GetVacxinByMaVacxin(String MaVacxin) {
        return VacxinDAO.GetVacxinByMaVacxin(MaVacxin);
    }
    public static Vacxin GetVacxinByTenVacxin(String TenVacxin) {
        return VacxinDAO.GetVacxinByTenVacxin(TenVacxin);
    }
}
