//package com.assessment;
//
//import java.util.Scanner;
//
//public class Menu {
//
//    private Scanner scanner = new Scanner(System.in);
//    private Administrador admin = new Administrador("above all", "one");
//    public College college = new College();
//    private Tutor t;
//
//
//
//    public Menu() {
//
//    }
//
//    void first_menu(){
//
//
//        String type_user="";
//        System.out.println("Select from the following options:\n" +
//                "1 - Student\n" +
//                "2 - Tutor\n" +
//                "3 - Admin");
//        int answer = scanner.nextInt();
//        System.out.println("--------------------");
//
//        if(answer == 1){
//            menu_student();
//        } else if (answer == 2){
//            tutor_menu();
//        } else if (answer == 3){
//            menu_admin();
//        } else {
//            first_menu();
//        }
//
//
//
//    }
//
//
//    /* -> admin menu*/
//
//    private void menu_admin(){
//
//        System.out.println("Select from the following options: ");
//        System.out.println("1 - Create College\n2- Create Student \n3 - Create Tutor \n4-Back to the main menu");
//        int answer = scanner.nextInt();
//
//        if (answer == 1){
//            create_student();
//        } else if (answer == 2){
//            create_tutor();
//        } else if (answer == 3){
//            first_menu();
//        } else {
//            menu_admin();
//        }
//
//    }
//
//    private void create_student (){
//        System.out.println("Input the last name of the student: ");
//        String last_name = scanner.next();
//        System.out.println("Input the first name of the student: ");
//        String first_name = scanner.next();
//        System.out.println("Input his username: ");
//        int username = scanner.nextInt();
//        System.out.println("Input his password: ");
//        String password= scanner.next();
//        System.out.println("Which class will he be added to? ");
//        int the_class = scanner.nextInt();
//
//        admin.createStudent(last_name,first_name,username,password,the_class);
//
//        System.out.println("--------------------");
//
//    }
//
//
//
//    private void create_tutor(){
//
//        System.out.println("Input the last name of the tutor: ");
//        String last_name = scanner.next();
//        System.out.println("Input the first name of the tutor: ");
//        String first_name = scanner.next();
//        System.out.println("Input the tutor's ID: ");
//        int ID = scanner.nextInt();
//        System.out.println("Input his password: ");
//        String password= scanner.next();
//        System.out.println("Which subject is the tutor teaching? ");
//        String subject = scanner.next();
//
//        admin.createTutor(last_name, first_name, password, subject, ID);
//        System.out.println("--------------------");
//
//        menu_admin();
//
//    }
//
//    /* -> student menu */
//
//    private void menu_student (){
//
//        System.out.println("Select from the following options: ");
//        System.out.println("1 - Check grades \n2 - Check timetable");
//        int answer = scanner.nextInt();
//
//        if (answer == 1){
//            check_grades();
//        }
//
//
//        System.out.println("--------------------");
//
//
//    }
//
//    private void check_grades(){
//
//        System.out.println("Enter your username to check your grades: ");
//        int username = scanner.nextInt();
//        System.out.println("--------------------");
//        System.out.println("Enter the number of your class to get your grades: ");
//        int classroom = scanner.nextInt();
//        System.out.println("--------------------");
//        Student student = getCollege().getList_classes().get(classroom).getList_Students().get(username);
//        student.printGrades(student);
//
//    }
//
//    /* -> tutor menu */
//
//    private void tutor_menu (){
//
//        System.out.println("Input your tutor code: ");
//        int tutor_code = scanner.nextInt();
//        System.out.println("--------------------");
//        System.out.println("Select the class: ");
//        int classes = scanner.nextInt();
//        System.out.println("--------------------");
//        System.out.println("Select the student id: ");
//        int student_id = scanner.nextInt();
//        System.out.println("--------------------");
//        System.out.println("Input the grade: ");
//        double grade = scanner.nextDouble();
//
//        Student s = getCollege().getList_classes().get(classes).getList_Students().get(student_id);
//        getT().putGrade(s, grade);
//
//    }
//
//    private Administrador getAdmin() {
//        return admin;
//    }
//
//    private College getCollege() {
//        return college;
//    }
//
//    private Tutor getT() {
//        return t;
//    }
//}
