package com.example.dao;
import com.example.models.Student;
import com.example.util.DBConnection;
import com.example.util.DBQueries;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImplementation implements StudentDAO {
    @Override
    public void addStudent(Student student) {
        String query = DBQueries.addStudentQuery;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setLong(1, student.getPRN());
            ps.setString(2, student.getFirstName().toLowerCase().trim());
            ps.setString(3, student.getLastName().toLowerCase().trim());
            ps.setString(4, student.getEmail().toLowerCase().trim());
            ps.setString(5, student.getBranch().toLowerCase().trim());
            ps.setInt(6, student.getAge());
            ps.setInt(7, student.getYearOfAdmission());
            ps.setLong(8, student.getMobileNumber());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student added successfully.");
            }

        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    @Override
    public List<Student> getAllStudents(){
        List<Student> list = new ArrayList<>();
        String query = DBQueries.getStudentQuery;
        try(Connection conn = DBConnection.getConnection();
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery(query);){
            while(rs.next()){
                list.add(new Student(
                        rs.getLong("prn"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("email"),
                        rs.getString("branch"),
                        rs.getInt("age"),
                        rs.getInt("yearOfAdmission"),
                        rs.getLong("mobileNumber")
                ));
            }
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }

        return list;
    }

    @Override
    public void deleteStudent(long prn){
        String query = DBQueries.deleteStudentQuery;
        try(Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);){
            ps.setLong(1, prn);
           int rows = ps.executeUpdate();
           if(rows > 0) System.out.println("Student with prn " + prn + " deleted!");
           else System.out.println("Student with prn " + prn + " not present");
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
