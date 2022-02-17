package com.company;

public class Student {
    //1.Attributes
    private String fName;
    private String lName;
    private String wNumber;
    private double tuitionFess;
    private boolean isFullTime; // true for full time
    //private double textbooksPrice;

    //Constructors
    public Student(String pFName, String lName, String wNumber, double tuitionFess, boolean isFullTime){
        this.fName = pFName;
        this.lName = lName;
        this.wNumber = wNumber;
        this.tuitionFess = tuitionFess;
        this.isFullTime = isFullTime;
    }

    //fName
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    //lName
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    //wNumber
    public String getwNumber() {
        return wNumber;
    }

    public void setwNumber(String wNumber) {
        this.wNumber = wNumber;
    }

    //tuitionFess
    public double getTuitionFess() {
        return tuitionFess;
    }

    public void setTuitionFess(double tuitionFess) {
        this.tuitionFess = tuitionFess;
    }

    //isFullTime
    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public void reportOne(){
        System.out.println(this.fName+"-".repeat(5)+ this.lName+"-".repeat(5)+
                this.isFullTime+"-".repeat(5)+this.wNumber+"-".repeat(5)+this.tuitionFess);
    }
    public void feesAfterDiscount90 (){
        double tfAfterDiscount = this.tuitionFess-500;


    }


}