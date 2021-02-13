package com.assessment;

public class Student extends Person{
    private String username;
    private String password;

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
}
