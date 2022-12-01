package model.dao;

import model.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
    public static User GetUserByUsername(String username) {
        Connection connection = DBHelper.GetConnection();
        if (connection != null) {
            PreparedStatement stm;
            try {
                stm = connection.prepareStatement("select * from user where username = ?");
                stm.setString(1, username);
                ResultSet rs = stm.executeQuery();
                rs.next();
                System.out.println(stm.toString());
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return  null;
    }
    public static boolean AddUser(String username, String password) {
        Connection connection = DBHelper.GetConnection();
        if (connection != null) {
            PreparedStatement stm;
            try {
                stm = connection.prepareStatement("insert into user values (?, ?)");
                stm.setString(1, username);
                stm.setString(2, password);
                stm.executeUpdate();
                return true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return false;

    }
}
