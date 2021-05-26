package com.company.oop.BigHomework.homeWork02;

public class Techer {
    private String name;
    private int age;
    private double salary;
    private String post;

    public Techer() {
    }

    public Techer(String name, int age, double salary, String post) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }


    public String introduce() {
        return "Techer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", 年薪=" + salary*12 +
                ", post='" + post + '\'' +
                '}';
    }


}


