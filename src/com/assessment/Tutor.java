package com.assessment;

public class Tutor extends Person {

    private String username;
    private String password;
    private String subject;
    private int tutorId;




    public Tutor(String last_name, String first_name, String password, String subject, int tutorId) {
        super(last_name, first_name);
        this.password = password;
        this.subject = subject;
        this.tutorId = tutorId;
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

    public int getTutorId() {
        return tutorId;
    }

    public void putGrade(Student student, Double grade){


        if (grade <= 10.0 && grade >= 0.0){
            student.getGrades().put(getSubject(), grade);}

    }
}
