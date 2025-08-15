package com.example.dao;
import com.example.models.Student;
import java.util.List;

public interface StudentDAO {
    void addStudent(Student student);
    List<Student> getAllStudents();
//    void updateStudent(Student student);
    void deleteStudent(long prn);
}
