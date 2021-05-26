package com.company.oop.BigHomework.homeWork08;

public class test {


    public static void main(String[] args) {

        Person student = new Student();
        student.eat();
        student.run();


        Student student1 = (Student) student;
        student1.eat();
        student1.run();
        student1.study();

    }
}
