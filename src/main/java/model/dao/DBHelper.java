package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    public static Connection GetConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost:3306/test888";
            String username = "root";
            String password = "password";
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            return connection;
        } catch (SQLException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
