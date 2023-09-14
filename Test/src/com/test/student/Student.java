package com.test.student;

public class Student {
    private int studentID;
    private String name;
    static int totalStudent=0;
    public void enroll(int id,String name){
        this.studentID=id;
        this.name=name;
        totalStudent++;
        System.out.println("Enroll successfully");

    }
    public void drop(int id,String name) {
        this.studentID=0;
        this.name=null;
        totalStudent--;
        System.out.println("Dropped successfully");

    }
}
