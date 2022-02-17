package com.company;

public class Student {
    //1.Attributes
    private String fName;
    public double firstAssign =0;
    public double secondAssign =0;
    public double totalMark;


    //Constructors
    public Student(String pFName, double  firstAssign, double secondAssign){
        this.fName = pFName;
        this.firstAssign = firstAssign;
        this.secondAssign = secondAssign;
        this.totalMark = this.firstAssign + this.secondAssign;
    }
    public void reportOne(){
        System.out.println("Name: " + this.fName +"\n first assignment: "+ this.firstAssign + "\n  2nd Assignment: " + this.secondAssign +"\n  Final Mark: "+ this.totalMark);
    }


    //fName
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }



}