package com.company.oop.BigHomework.homework03;

public class manager extends employee{

   private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public manager(String name, double salary, int days, double grade) {
        super(name, salary, days);
        this.grade = grade;
    }


    @Override
    public void info() {
        System.out.println("经理的工资"+(1000+getSalary()*getDays()*grade));
    }
}
