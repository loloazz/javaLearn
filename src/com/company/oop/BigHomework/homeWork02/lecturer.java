package com.company.oop.BigHomework.homeWork02;

public class lecturer extends Techer{
    public lecturer() {
    }

    public lecturer(String name, int age, double salary, String post) {
        super(name, age, salary, post);
    }

    @Override
    public String introduce() {
        return "lecturer{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", 年薪=" + (double)(super.getSalary()*12*1.1) +
                ", post='" + super.getPost() + '\'' +
                '}';
    }
}
