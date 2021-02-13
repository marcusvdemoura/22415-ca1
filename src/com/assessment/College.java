package com.assessment;

import java.util.ArrayList;

public class College {


    private ArrayList<Tutor> tutor_list = new ArrayList<>();

    private ArrayList<Classes> list_classes = new ArrayList<Classes>();

    public College() {

    }

    public ArrayList<Tutor> getTutor_list() {
        return tutor_list;
    }

    public ArrayList<Classes> getList_classes() {
        return list_classes;
    }

    void addTutors (Tutor tutor){

        getTutor_list().add(tutor);

    }

    void addClasses (Classes c){
        list_classes.add(c);
    }



    void printTutors(){

        for (int i = 0; i < getTutor_list().size(); i++){
            System.out.println(getTutor_list().get(i));
        }

    }
}
