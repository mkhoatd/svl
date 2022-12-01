package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class KhoaDAO {
    public static Integer GetKhoaIdByName(String khoaName) {
        Connection connection = DBHelper.GetConnection();
        if (connection != null) {
            PreparedStatement stm;
            try {
                stm = connection.prepareStatement("select id from khoa where name = ?");
                stm.setString(1, khoaName);
                ResultSet rs = stm.executeQuery();
                rs.next();
                return rs.getInt("id");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
    public static ArrayList<String> GetAllKhoaName() {
        Connection connection = DBHelper.GetConnection();
        if (connection != null) {
            PreparedStatement stm;
            try {
                stm = connection.prepareStatement("select name from khoa");
                ResultSet rs = stm.executeQuery();
                ArrayList<String> khoaNames = new ArrayList<>();
                while (rs.next()) {
                    khoaNames.add(rs.getString("name"));
                }
                return khoaNames;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
}
