package model.bo;

import model.bean.User;
import model.dao.UserDAO;

import java.util.Objects;

public class CheckLoginBO {
    public static boolean ExistAccount(String username, String password) {
        User user = UserDAO.GetUserByUsername(username);
        if (user == null) {
            return false;
        }
        return Objects.equals(user.getPassword(), password);
    }
}
