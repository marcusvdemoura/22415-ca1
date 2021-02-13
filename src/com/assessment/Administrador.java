package com.assessment;

public class Administrador extends Person{

    private String username = "admin";
    private String password = "adminpass";

    public Administrador(String last_name, String first_name) {
        super(last_name, first_name);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
