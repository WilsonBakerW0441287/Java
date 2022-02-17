package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        boolean answer = true;
        String firstName;
        String lastName;
        String wNumber;
        double tuitionFees;
        boolean stEnrollment;
        String ans = "Y";

        //Primitive data types arrays
        int[] stMarks = new int[10];

        //Array of objects
        Student[] classList = new Student[3];
//        System.out.println("=".repeat(100));
//        for (int i = 0; i < classList.length; i++) {
//            System.out.println("Enter student # "+ (i+1)+" information ");
//            System.out.println("Enter students First name: ");
//            firstName = sc.nextLine();
//            System.out.println("Enter students last name: ");
//            lastName = sc.nextLine();
//            System.out.println("Enter students w number: ");
//            wNumber = sc.nextLine();
//            System.out.println("Enter students Enrolment (true/false): ");
//            stEnrollment = sc.nextBoolean();
//            System.out.println("Enter students tuition fees: ");
//            tuitionFees = sc.nextDouble();
//            sc.nextLine();//to handle the new line issue
//            classList[i] = new Student(firstName, lastName, wNumber, tuitionFees,stEnrollment);
//        }
//        for (int i = 0; i < classList.length; i++) {
//            classList[i].reportOne();
//
//        }
//        //to apply
//        for (int i = 0; i < classList.length; i++) {
//            double tFees = classList[i].getTuitionFess()-500;
//            classList[i].setTuitionFess(tFees);
//
//        }
//        System.out.println("The tuition fees after discount");
//        for (int i = 0; i < classList.length; i++) {
//            classList[i].reportOne();
//
//        }
//        System.out.println();
//
//
        ArrayList<Student> classList2 = new ArrayList<>();
//        classList2.add(new Student("David", "nick", "W01234", 1500, true));
//        classList2.add(new Student("joe", "kurt", "W045678", 1500, true));
//        classList2.add(new Student("marci", "dale", "W089012", 1500, true));

//        System.out.println("=".repeat(100));
//        System.out.println("From Array List");
//        //for each look up tutorial - alex lee?
//        for (Student element:classList2){
//            element.reportOne();
//
//        }


//        //Array list
//        ArrayList<Student> myList = new ArrayList<>();
        int i = 0;
        do {
                System.out.println("Enter student # "+ (i+1)+" information ");
                System.out.println("Enter students First name: ");
                firstName = sc.nextLine();
                System.out.println("Enter students last name: ");
                lastName = sc.nextLine();
                System.out.println("Enter students w number: ");
                wNumber = sc.nextLine();
                System.out.println("Enter students Enrolment (true/false): ");
                stEnrollment = sc.nextBoolean();
                System.out.println("Enter students tuition fees: ");
                tuitionFees = sc.nextDouble();
                sc.nextLine();//to handle the new line issue
                classList2.add(new Student(firstName, lastName, wNumber, tuitionFees,stEnrollment));

//        enter the 5 local variables
//                create the object by using classList2.add():

        System.out.println("do you wish to continue? (true/flase) ");
        answer = sc.nextBoolean();
        sc.nextLine();
        i++;
        } while (answer);

        System.out.println("=".repeat(100));
        System.out.println("From Array List");
        //for each look up tutorial - alex lee?
        for (Student element:classList2){
            element.reportOne();

        }

        Course pythonCourse = new Course();
        Course javaCourse = new Course();

        pythonCourse.setCourseCode("USREINPUT");
        javaCourse.setCourseCode("otherinput");
        //setting or assigning array list of obj to the course list proterties
        javaCourse.setClassList3(classList2);
        System.out.println("students enrolled in " + javaCourse.getCourseCode());
        for (Student javaStudent: javaCourse.getClassList3()){
            javaStudent.reportOne();

        }


    }
}