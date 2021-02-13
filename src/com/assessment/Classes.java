package com.assessment;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Classes {


    private ArrayList<Student> list_Students = new ArrayList<>();
    private Tutor t;



    public Classes(Tutor t) {

    }

    public Tutor getT() {
        return t;
    }

    public ArrayList<Student> getList_Students() {
        return list_Students;
    }



    void add_student_to_class(Student s){
        getList_Students().add(s);
    }
}
