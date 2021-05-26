package com.company.oop.extend;

public class test {
    public static void main(String[] args) {
        pupils pupils = new pupils();
        pupils.setAge(10);
        pupils.setName("小学生");
        pupils.setScore(88);
        pupils.test();
        pupils.getinfo();


        Graduate graduate = new Graduate();
        graduate.setAge(20);
        graduate.setName("大学生");
        graduate.setScore(60);
        graduate.test();
        graduate.getinfo();

    }
}
