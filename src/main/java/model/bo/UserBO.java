package model.bo;

import model.bean.User;
import model.dao.UserDAO;

public class UserBO {
    public static User GetUserByUsername(String username) {
        return UserDAO.GetUserByUsername(username);
    }
    public static boolean AddUser(String username, String password) {
        return UserDAO.AddUser(username, password);
    }
}
