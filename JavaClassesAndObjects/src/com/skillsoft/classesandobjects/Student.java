package com.skillsoft.classesandobjects;

public class Student {
//public class Student extends Object {
//    public int id = 12345678;
//    public String name = "Unknown";
//    public double gpa = 3.0;
//    public int id;
//    public String name;
//    public double gpa;
    private int id;
    private String name;
    private double gpa;

//    public Student(int inputId, String inputName, double inputGpa) {

//        id = inputId;
//        name = inputName;
//        gpa = inputGpa;
//    }

    public Student(int id, String name, double gpa) {
//    private Student(int id, String name, double gpa) {

        this.id = id;
        this.name = name;
        this.gpa = gpa;

        System.out.println("Constructing object with id: " + id + " this: " + this);
    }

    public void printStudentInfo() {
//    private void printStudentInfo() {

        System.out.println();
        System.out.println("ID: " + id + " Name: " + name + " GPA: " + gpa);

        System.out.println("We can also reference member variables using the 'this' keyword");
        System.out.println("ID: " + this.id + " Name: " + this.name + " GPA: " + this.gpa);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
