package com.assessment;

public class Tutor extends Person {

    private String password;
    private String subject;




    public Tutor(String first_name, String last_name, String password, String subject) {
        super(first_name, last_name);
        this.password = password;
        this.subject = subject;

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

