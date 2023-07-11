package com.skillsoft.classesandobjects;

import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        String someString = new String("Hello String class!");
//        System.out.println("Some string: " + someString);

//        String anotherString = new String("Another object of type string");
//        System.out.println("Another string: " + anotherString);

//        System.out.println();

//        Date someDate = new Date();
//        System.out.println("Some date: " + someDate);

//        Date anotherDate = new Date();
//        System.out.println("Another date: " + anotherDate);

//        System.out.println();

//        Random someRandom = new Random();
//        System.out.println("Some random: " + someRandom);

//        Random anotherRandom = new Random();
//        System.out.println("Another random: " + anotherRandom);

//        System.out.println();

//        Object someObject = new Object();
//        System.out.println("Some object: " + someObject);

//        Object anotherObject = new Object();
//        System.out.println("Another object: " + anotherObject);

//        Main main1 = new Main();
//        System.out.println("Main 1: " + main1);

//        Main main2 = new Main();
//        System.out.println("Main 2: " + main2);

//        Main main3 = new Main();
//        System.out.println("Main 3: " + main3);

//        System.out.println();

//        System.out.println("Main 1 (toString): " + main1.toString());
//        System.out.println("Main 2 (toString): " + main2.toString());
//        System.out.println("Main 3 (toString): " + main3.toString());

//        System.out.println();

//        System.out.println("Main 1 (getClass): " + main1.getClass());
//        System.out.println("Main 2 (getClass): " + main2.getClass());
//        System.out.println("Main 3 (getClass): " + main3.getClass());

//        System.out.println();

//        String someString = new String("Hello String class!");
//        Date someDate = new Date();
//        Random someRandom = new Random();
//        Object someObject = new Object();

//        System.out.println("someString (toString): " + someString.toString());
//        System.out.println("someDate (toString): " + someDate.toString());
//        System.out.println("someRandom (toString): " + someRandom.toString());
//        System.out.println("someObject (toString): " + someObject.toString());

//        System.out.println();

//        System.out.println("someString (getClass): " + someString.getClass());
//        System.out.println("someDate (getClass): " + someDate.getClass());
//        System.out.println("someRandom (getClass): " + someRandom.getClass());
//        System.out.println("someObject (getClass): " + someObject.getClass());

//        System.out.println();

//        Student alice = new Student();

//        System.out.println("Student object (Alice): " + alice);
//        System.out.println("Student class (Alice): " + alice.getClass());
//        System.out.println();

//        Student bob = new Student();

//        System.out.println("Student object (Bob): " + bob);
//        System.out.println("Student class (Bob): " + bob.getClass());
//        System.out.println();

//        Student charles = new Student();

//        System.out.println("Student object (Charles): " + charles);
//        System.out.println("Student class (Charles): " + charles.getClass());
//        System.out.println();

//        System.out.println("alice.equals(bob): " + alice.equals(bob));
//        System.out.println("alice.equals(Charles): " + alice.equals(charles));
//        System.out.println("bob.equals(Charles): " + bob.equals(charles));
//        System.out.println();

//        Student s1 = new Student();
//        s1.id = 123;
//        s1.name = "Debbie";
//        s1.gpa = 3.5;

        // NOTE: The string representations (toString) does not automatically
        // know about the variables that you have declared in the class
//        System.out.println("An object of the class Student (s1): " + s1);
//        System.out.println("S1 ID: " + s1.id + " Name: " + s1.name + " GPA: " + s1.gpa);
//        System.out.println();

//        Student s2 = new Student();
//        s2.id = 223;
//        s2.name = "Eric";
//        s2.gpa = 2.76;

//        System.out.println("An object of the class Student (s2): " + s2);
//        System.out.println("S2 ID: " + s2.id + " Name: " + s2.name + " GPA: " + s2.gpa);
//        System.out.println();

//        Student s3 = new Student();
//        s3.id = 224;
//        s3.name = "Fiona";
//        s3.gpa = 3.2;

//        System.out.println("An object of the class Student (s3): " + s3);
//        System.out.println("S3 ID: " + s3.id + " Name: " + s3.name + " GPA: " + s3.gpa);
//        System.out.println();

        // NOTE: The equals() method does not automatically
        // know about the variables that you have declared in the class
//        System.out.println("s1.equals(s2): " + s1.equals(s2));
//        System.out.println("s2.equals(s1): " + s2.equals(s1));

//        System.out.println("s2.equals(s3): " + s2.equals(s3));
//        System.out.println("s1.equals(s3): " + s1.equals(s3));

//        System.out.println("s3equals(s1): " + s3.equals(s1));
//        System.out.println("s3.equals(s2): " + s3.equals(s2));

//        Student s1 = new Student(123, "Debbie", 3.5);

//        System.out.println("An object of the class Student (s1): " + s1);
//        System.out.println("S1 ID: " + s1.id + " Name: " + s1.name + " GPA: " + s1.gpa);
//        System.out.println();

//        Student s2 = new Student(223, "Eric", 2.76);

//        System.out.println("An object of the class Student (s2): " + s2);
//        System.out.println("S2 ID: " + s2.id + " Name: " + s2.name + " GPA: " + s2.gpa);
//        System.out.println();

//        Student s3 = new Student(224, "Fiona", 3.2);

//        System.out.println("An object of the class Student (s3): " + s3);
//        System.out.println("S3 ID: " + s3.id + " Name: " + s3.name + " GPA: " + s3.gpa);
//        System.out.println();

//        System.out.println();
//        System.out.println("Let's access and update member variables directly!");
//        System.out.println();

//        s1.name = "Debora";
//        System.out.println("s1:" + "\nID: " + s1.id + " Name: " + s1.name + " GPA: " + s1.gpa);

//        s2.gpa = 2.9;
//        System.out.println("\ns2:" + "\nID: " + s2.id + " Name: " + s2.name + " GPA: " + s2.gpa);

//        s3.id = 113;
//        System.out.println("\ns3:" + "\nID: " + s3.id + " Name: " + s3.name + " GPA: " + s3.gpa);

        Student s1 = new Student(123, "Debbie", 3.5);
//        System.out.println("An object of the class Student (s1): " + s1);
//        System.out.println("S1 ID: " + s1.id + " Name: " + s1.name + " GPA: " + s1.gpa);
        s1.printStudentInfo();
//        System.out.println("s1 id: " + s1.getId());
//        System.out.println("s1 name: " + s1.getName());
//        System.out.println("s1 GPA: " + s1.getGpa());
        System.out.println("***Updating id for s1");
        s1.setId(211);
        s1.printStudentInfo();
        System.out.println();

        Student s2 = new Student(223, "Eric", 2.76);
//        System.out.println("An object of the class Student (s2): " + s2);
//        System.out.println("S2 ID: " + s2.id + " Name: " + s2.name + " GPA: " + s2.gpa);
        s2.printStudentInfo();
//        System.out.println("s2 id: " + s2.getId());
//        System.out.println("s2 name: " + s2.getName());
        System.out.println("***Updating id and name for s2");
        s2.setId(152);
        s2.setName("Oliver");
        s2.printStudentInfo();
        System.out.println();

//        Student s3 = new Student(224, "Fiona", 3.2);
//        System.out.println("An object of the class Student (s3): " + s3);
//        System.out.println("S3 ID: " + s3.id + " Name: " + s3.name + " GPA: " + s3.gpa);
//        s3.printStudentInfo();
//        System.out.println("s3 name: " + s3.getName());
//        System.out.println();

    }
}
