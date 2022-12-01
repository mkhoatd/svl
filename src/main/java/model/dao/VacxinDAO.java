package model.dao;

import model.bean.Vacxin;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class VacxinDAO {
    public static void AddVacxin(Vacxin vacxin) {
        String sql = "INSERT INTO Vacxin VALUES(?,?,?,?,?,?)";
        try {
            Connection connection = DBHelper.GetConnection();
            PreparedStatement stm =connection.prepareStatement(sql);
            stm.setString(1, vacxin.getMaVacxin());
            stm.setString(2, vacxin.getTenVacxin());
            stm.setInt(3, vacxin.getSoMui());
            stm.setString(4, vacxin.getMoTa());
            stm.setString(5, vacxin.getGiaVacxin());
            stm.setString(6, vacxin.getTenHangSX());
            stm.executeUpdate();
            stm.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
