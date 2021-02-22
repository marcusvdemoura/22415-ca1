package com.assessment;

public class Admin extends Person implements AdminTools{


    private String password;
    private Student student;
    private Tutor tutor;
    private CollegeBranch collegeBranch;
    private BranchClass branchClass;


    public Admin(String first_name, String second_name, String password) {
        super(first_name, second_name);
        this.password = password;
    }


    public String getPassword() {
        return password;
    }


    // -> admin creates branches, tutors, students and classes


    @Override
    public CollegeBranch create_branch (String unit, String address) {

        collegeBranch = new CollegeBranch(unit, address);

        return collegeBranch;

    }


    @Override
    public Student create_students (String first_name, String last_name, String password, String username) {

        student = new Student(first_name, last_name, password, username);
        return student;

    }


    @Override
    public Tutor create_tutor(String first_name, String last_name, String password, String subject) {

        tutor = new Tutor(first_name, last_name, password, subject);
        return tutor;
    }

    @Override
    public BranchClass create_branch_class(CollegeBranch collegeBranch,Tutor tutor) {

        branchClass = new BranchClass(collegeBranch, tutor);
        return branchClass;

    }

    // --> adding students to the classes


    @Override
    public void add_student_to_class(Student student, CollegeBranch collegeBranch, BranchClass branchClass) {


        if (branchClass.getCollegeBranch().getUnit().equalsIgnoreCase(branchClass.getCollegeBranch().getUnit())) {
            student.getTimetable().add(branchClass);

            branchClass.getList_of_students().add(student);
        } else {
            System.out.println("ERROR - THE UNIT DOESN'T HAVE THIS CLASS");
        }

//		ArrayList<BranchClass> listClasses = new ArrayList<>();
//		listClasses = collegeBranch.getListOfClasses();
//
//
//		for (int i = 0; i < listClasses.size(); i++) {
//
//			if(listClasses.get(i).equals(branchClass)) {
//				collegeBranch.getListOfClasses().get(i).getList_of_students().add(student);
//				student.getTimetable().add(branchClass);
//				break;
//			}
//
//		}


    }








}
