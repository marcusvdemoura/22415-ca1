package com.assessment;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person{
    private String username;
    private String password;
    private int id_key;
    private HashMap <String, Double> grades = new HashMap<>();

    public Student(String last_name, String first_name, String username, String password, int id_key) {
        super(last_name, first_name);
        this.username = username;
        this.password = password;
        this.id_key = id_key;
    }

    public int getId_key() {
        return id_key;
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

    public void printGrades (Student s){

        System.out.println(s.getFirst_name() + " " + s.getLast_name() + " grades:");
        System.out.println("----------------------");

        for (Map.Entry<String, Double> entry : getGrades().entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }


}
