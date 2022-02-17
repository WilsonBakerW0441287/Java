package com.company;

import java.util.ArrayList;

public class Course {
    //make a connection between student and course
    //varriables / properties
    public double totalMarks;


    private String courseCode ;
    private ArrayList<Student> classList3;    //Aggregation (class inside the class)

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public ArrayList<Student> getClassList3() {
        return classList3;
    }

    public void setClassList3(ArrayList<Student> classList3) {
        this.classList3 = classList3;
    }
}
