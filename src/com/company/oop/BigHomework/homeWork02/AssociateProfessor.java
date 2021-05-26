package com.company.oop.BigHomework.homeWork02;

public class AssociateProfessor extends Techer{
    public AssociateProfessor() {
    }

    public AssociateProfessor(String name, int age, double salary, String post) {
        super(name, age, salary, post);
    }

    @Override
    public String introduce() {
        return "AssociateProfessor{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", 年薪=" + super.getSalary()*12*1.2 +
                ", post='" + super.getPost() + '\'' +
                '}';
    }

}
