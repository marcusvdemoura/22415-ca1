package com.assessment;

public class Tutor extends Person {

    private String username;
    private String password;
    private String subject;




    public Tutor(String last_name, String first_name, String username, String password, String subject) {
        super(last_name, first_name);
        this.username = username;
        this.password = password;
        this.subject = subject;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSubject() {
        return subject;
    }

    public void putGrade(Student student, Double grade){


        if (grade <= 10.0 && grade >= 0.0){
            student.getGrades().put(getSubject(), grade);}

    }
}
