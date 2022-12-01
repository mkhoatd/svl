package model.bo;

import model.bean.Student;
import model.bean.User;
import model.dao.DBHelper;
import model.dao.StudentDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentBO {
    public static ArrayList<Student> GetAllStudents() {
        return StudentDAO.GetAllStudents();
    }
    public static ArrayList<Student> GetStudentsByKhoaName(String khoaName) {
        return StudentDAO.GetStudentsByKhoaName(khoaName);
    }
    public static boolean AddStudent(Student student) {
        return StudentDAO.AddStudent(student);
    }
    public static boolean DeleteStudent(int id) {
        return StudentDAO.DeleteStudent(id);
    }

    public static boolean UpdateStudent(Student student) {
        return StudentDAO.UpdateStudent(student);
    }

}
