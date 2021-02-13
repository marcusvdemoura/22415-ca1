package com.assessment;

import java.util.HashMap;

public class Student extends Person{
    private String username;
    private String password;
    private HashMap <String, Double> grades = new HashMap<>();

    public Student(String last_name, String first_name, String username, String password) {
        super(last_name, first_name);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public HashMap<String, Double> getGrades() {
        return grades;
    }


}
