package com.assessment;

import java.util.ArrayList;

public class Administrador extends Person{

    private String username = "admin";
    private String password = "adminpass";
    public College college;
    public Classes classes;

    public Administrador(String last_name, String first_name) {
        super(last_name, first_name);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public College getCollege() {
        return college;
    }

    public Classes getClasses() {
        return classes;
    }

    void createCollege(){

        college = new College();
    }

    void createTutor (String last_name, String first_name, String password, String subject, int tutorId) {

        Tutor t = new Tutor(last_name, first_name, password, subject, tutorId);
        college.addTutors(t);

    }

    void createStudent (String last_name, String first_name, String username, String password, int class_tobe_added, int id_key){

        Student s = new Student(last_name, first_name, username, password, id_key);
        college.getList_classes().get(class_tobe_added).add_student_to_class(s);

    }

    void printStudents (Classes classes){

        ArrayList<Student> a = new ArrayList<>();

        for (int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }


    }

    void createClass (Tutor t){

        classes = new Classes(t);
        college.addClasses(classes);

    }






}
