package com.assessment;

public class Person {

    private String last_name;
    private String first_name;

    public Person(String last_name, String first_name) {
        this.last_name = last_name;
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFirst_name() {
        return first_name;
    }
}
