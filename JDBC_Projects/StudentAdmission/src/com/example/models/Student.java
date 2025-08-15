package com.example.models;
import java.util.Map;
import java.util.HashMap;

public class Student {
    private String firstName, lastName, branch, email;
    private long prn, mobileNumber;
    private int age, yearOfAdmission;

    public Student(long prn, String firstName, String lastName, String email, String branch, int age, int yearOfAdmission, long mobileNumber) {
        this.prn = prn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.branch = branch;
        this.age = age;
        this.yearOfAdmission = yearOfAdmission;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public String getBranch() { return this.branch; }
    public int getAge() { return this.age; }
    public long getPRN() { return this.prn; }
    public String getEmail() { return this.email; }
    public long getMobileNumber() { return this.mobileNumber; }
    public int getYearOfAdmission(){ return this.yearOfAdmission; }
}
