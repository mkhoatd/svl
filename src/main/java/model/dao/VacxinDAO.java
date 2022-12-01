package model.dao;

import model.bean.Vacxin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
    public static void UpdateVacxin(Vacxin vacxin) {
        String sql = "UPDATE Vacxin SET TenVacxin=?, SoMui=?, MoTa=?, GiaVacxin=?, TenHangSX=? WHERE MaVacxin=?";
        try {
            Connection connection = DBHelper.GetConnection();
            PreparedStatement stm =connection.prepareStatement(sql);
            stm.setString(1, vacxin.getTenVacxin());
            stm.setInt(2, vacxin.getSoMui());
            stm.setString(3, vacxin.getMoTa());
            stm.setString(4, vacxin.getGiaVacxin());
            stm.setString(5, vacxin.getTenHangSX());
            stm.setString(6, vacxin.getMaVacxin());
            stm.executeUpdate();
            stm.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Vacxin GetVacxinByMaVacxin(String MaVacxin) {
        String sql = "SELECT * FROM Vacxin WHERE MaVacxin=?";
        return getVacxin(MaVacxin, sql);
    }
    public static Vacxin GetVacxinByTenVacxin(String TenVacxin) {
        String sql = "SELECT * FROM Vacxin WHERE TenVacxin=?";
        return getVacxin(TenVacxin, sql);
    }

    private static Vacxin getVacxin(String value, String sql) {
        Vacxin vacxin = new Vacxin();
        try {
            Connection connection = DBHelper.GetConnection();
            PreparedStatement stm =connection.prepareStatement(sql);
            stm.setString(1, value);
            ResultSet rs = stm.executeQuery();
            rs.next();
            vacxin.setMaVacxin(rs.getString("MaVacxin"));
            vacxin.setTenVacxin(rs.getString("TenVacxin"));
            vacxin.setSoMui(rs.getInt("SoMui"));
            vacxin.setMoTa(rs.getString("MoTa"));
            vacxin.setGiaVacxin(rs.getString("GiaVacxin"));
            vacxin.setTenHangSX(rs.getString("TenHangSX"));
            rs.close();
            stm.close();
            connection.close();
            return vacxin;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
