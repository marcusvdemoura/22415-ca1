package com.assessment;

import java.util.ArrayList;

public class Driver {



    void run(){


        // First, create an ADM that will manage all the college
        Administrador adm = new Administrador("above all", "one");

        // Second, adm will create a College where all data will be managed through
        adm.createCollege();
        College a = adm.getCollege();

        // Then, the adm can create the collage classes. For so, he has to create a tutor -> create a class for this tutor ->
        adm.createTutor("Rowley", "John", "jRow", "abc123", "Programming");
        Tutor first_tutor = a.getTutor_list().get(0);
        adm.createClass(adm.getCollege().getTutor_list().get(0));
        Classes first_class = a.getList_classes().get(0);

        //-> in the class will be added a set of Students

        adm.createStudent("Moura", "Marcus", "mvfr", "aabbcc", 0, 0);
        adm.createStudent("Silva", "Michele", "misi", "abcdefg123", 0, 1);
        adm.createStudent("Mubasher", "Khan", "muka", "123456", 0, 2);

        // -> the tutor can add grades

        ArrayList<Student> student_lis = a.getList_classes().get(0).getList_Students();

        System.out.println(student_lis.get(2).getFirst_name());


    }

    public Driver() {
    }
}
