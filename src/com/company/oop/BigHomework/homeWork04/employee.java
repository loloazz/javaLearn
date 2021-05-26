package com.company.oop.BigHomework.homeWork04;

public class employee {

    private double salary;
    private String name;

    public employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo(){

        System.out.println("姓名："+getName()+ "\t"+"年薪："+salary*12);

    }

}
