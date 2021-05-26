package com.company.oop.BigHomework.homeWork04;

public class Teacher extends employee{
    private int days;
    private double kechou;

    public Teacher(double salary, String name,  double kechou,int days) {
        super(salary, name);
        this.days = days;
        this.kechou = kechou;
    }

    @Override
    public void getInfo() {
        System.out.println("姓名："+getName()+ "\t"+"年薪："+(getSalary()*12+kechou*days));
    }
}
