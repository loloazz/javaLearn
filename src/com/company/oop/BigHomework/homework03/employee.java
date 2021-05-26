package com.company.oop.BigHomework.homework03;

public class employee {
    private  String name;
    private  double salary;
    private int days;

    public employee(String name, double salary, int days) {
        this.name = name;
        this.salary = salary;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void info(){

        System.out.println("打印工资！");
    }
}
