package model.dao;

import model.bean.Student;
import model.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {
    public static ArrayList<Student> GetAllStudents() {
        Connection connection = DBHelper.GetConnection();
        if (connection != null) {
            PreparedStatement stm;
            try {
                stm = connection.prepareStatement("select * from student INNER JOIN khoa on student.khoaId=khoa.id ");
                return getStudents(stm);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
    public static ArrayList<Student> GetStudentsByKhoaName(String khoaName) {
        Connection connection = DBHelper.GetConnection();
        if (connection != null) {
            PreparedStatement stm;
            try {
                stm = connection.prepareStatement("select * from student INNER JOIN khoa on student.khoaId=khoa.id WHERE khoa.name = ?");
                stm.setString(1, khoaName);
                return getStudents(stm);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    private static ArrayList<Student> getStudents(PreparedStatement stm) throws SQLException {
        ResultSet rs = stm.executeQuery();
        ArrayList<Student> students = new ArrayList<>();
        while (rs.next()) {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setGender(rs.getInt("gender") == 1);
            student.setKhoaName(rs.getString(6));
            students.add(student);
        }
        return students;
    }
    public static boolean AddStudent(Student student) {
        Connection connection = DBHelper.GetConnection();
        if (connection != null) {
            PreparedStatement stm;
            try {
                stm = connection.prepareStatement("insert into student values (?, ?, ?, ?)");
                stm.setInt(1, student.getId());
                stm.setString(2, student.getName());
                stm.setInt(3, student.getGender() ? 1 : 0);
                Integer khoaId = KhoaDAO.GetKhoaIdByName(student.getKhoaName());
                stm.setInt(4, khoaId);
                stm.executeUpdate();
                return true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }
    public static boolean DeleteStudent(Integer id) {
        Connection connection = DBHelper.GetConnection();
        if (connection != null) {
            PreparedStatement stm;
            try {
                stm = connection.prepareStatement("delete from student where id = ?");
                stm.setInt(1, id);
                stm.executeUpdate();
                return true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }
    public static boolean UpdateStudent(Student student) {
        Connection connection = DBHelper.GetConnection();
        if (connection != null) {
            PreparedStatement stm;
            try {
                stm = connection.prepareStatement("update student set name = ?, gender = ?, khoaId = ? where id = ?");
                stm.setString(1, student.getName());
                stm.setInt(2, student.getGender() ? 1 : 0);
                Integer khoaId = KhoaDAO.GetKhoaIdByName(student.getKhoaName());
                stm.setInt(3, khoaId);
                stm.setInt(4, student.getId());
                stm.executeUpdate();
                return true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return false;

    }

}
