package model.bo;

import model.dao.KhoaDAO;

import java.util.ArrayList;

public class KhoaBO {
    public static ArrayList<String> GetAllKhoaName() {
        return KhoaDAO.GetAllKhoaName();
    }
}
