package com.assessment;

import java.util.ArrayList;

public class CollegeBranch {

    private String unit;
    private String address;
    private ArrayList<BranchClass> listOfClasses = new ArrayList<BranchClass>();

    public CollegeBranch(String unit, String address) {
        super();
        this.unit = unit;
        this.address = address;
    }

    public String getUnit() {
        return unit;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<BranchClass> getListOfClasses() {
        return listOfClasses;
    }

}
