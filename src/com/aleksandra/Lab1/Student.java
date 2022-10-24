package com.aleksandra.Lab1;

public class Student {

    // Default Modifiers - Attributes / Variables
    public String studentName;
    public int age;
    public int personNumber;

    public Student(String studentName, int age, int personNumber) {
        this.studentName = studentName;
        this.age = age;
        this.personNumber = personNumber;
    }

    public void StudentDetails() {

        System.out.println("My name: " + studentName + " my age: " + age + " my personal number: " + personNumber);

    }


}
