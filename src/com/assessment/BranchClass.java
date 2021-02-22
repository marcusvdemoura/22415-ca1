package com.assessment;

import java.util.ArrayList;

public class BranchClass {


    private Tutor tutor;
    private ArrayList<Student> list_of_students = new ArrayList<Student>();
    private CollegeBranch collegeBranch;


    public BranchClass(CollegeBranch collegeBranch, Tutor tutor) {
        this.tutor = tutor;
        this.collegeBranch = collegeBranch;

    }


    public ArrayList<Student> getList_of_students() {
        return list_of_students;
    }


    public Tutor getTutor() {
        return tutor;
    }


    public CollegeBranch getCollegeBranch() {
        return collegeBranch;
    }

}
