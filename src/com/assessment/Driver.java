package com.assessment;

import java.util.ArrayList;

public class Driver {



    void run(){


        // First, create an ADM that will manage all the college
        Administrador adm = new Administrador("above all", "one");

        // Second, adm will create a College where all data will be managed through
        adm.createCollege();
        College a = adm.getCollege();

        // -> Before the adm can create the classes he has to create a tutor
        adm.createTutor("Rowley", "John", "jRow", "abc123", "Programming");
        adm.createTutor("Forster", "Annette", "anFor", "anette", "Maths");
        Tutor first_tutor = a.getTutor_list().get(0);
        Tutor second_tutor = a.getTutor_list().get(1);

        // -> adm creates a class for the students
        adm.createClass(adm.getCollege().getTutor_list().get(0));
        Classes first_class = a.getList_classes().get(0);
        /*---------------------------*/

        adm.createClass(second_tutor);
        Classes second_class = a.getList_classes().get(1);

        //-> in the class will be added a set of Students

        adm.createStudent("Moura", "Marcus", "mvfr", "aabbcc", 0, 0);
        adm.createStudent("Silva", "Michele", "misi", "abcdefg123", 0, 1);
        adm.createStudent("Mubasher", "Khan", "muka", "123456", 0, 2);

        // -> the tutor can add grades

        ArrayList<Student> student_list1 = a.getList_classes().get(0).getList_Students();

        first_tutor.putGrade(student_list1.get(0),10.0);
        second_tutor.putGrade(student_list1.get(0),10.0);
        first_tutor.putGrade(student_list1.get(0),10.0);
        first_tutor.putGrade(student_list1.get(1), 9.0);
        first_tutor.putGrade(student_list1.get(2), 9.0);


        /*---------------------------*/

        ArrayList<Student> student_list2 = a.getList_classes().get(1).getList_Students();
        adm.createStudent("Silveira", "Licia", "lisil", "aabbcc", 1, 0);
        adm.createStudent("Moura", "Celio", "mocel", "abcdefg123", 1, 1);
        adm.createStudent("Celmars", "Janis", "celJan", "123456", 1, 2);

        first_tutor.putGrade(student_list2.get(0), 1.0);
        second_tutor.putGrade(student_list2.get(0), 9.0);

        first_tutor.putGrade(student_list2.get(1), 8.0);
        second_tutor.putGrade(student_list2.get(1), 5.0);



        // -> student prints the grade

        student_list2.get(1).printGrades(student_list2.get(1));


    }

    public Driver() {
    }
}
