package com.example.util;

public class DBQueries {
    public static final String getStudentQuery = "SELECT * FROM Student";
    public static final String addStudentQuery = "INSERT INTO Student(prn, firstname, lastname, email, branch, age, yearOfAdmission, mobileNumber) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String deleteStudentQuery = "DELETE FROM Student WHERE prn = ?";
}
