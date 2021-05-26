package com.company.oop.BigHomework.homeWork02;

public class Professor extends Techer {
    public Professor() {
    }

    public Professor(String name, int age, double salary, String post) {
        super(name, age, salary, post);
    }

    @Override
    public String introduce() {
        return "Professor{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", 年薪=" + super.getSalary()*12*(1.3) +
                ", post='" + super.getPost() + '\'' +
                '}';
    }
}
