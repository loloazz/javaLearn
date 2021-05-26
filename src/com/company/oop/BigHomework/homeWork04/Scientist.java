package com.company.oop.BigHomework.homeWork04;

public class Scientist extends employee{
    private  double bonus;

    public Scientist(double salary, String name, double bonus) {
        super(salary, name);
        this.bonus = bonus;
    }

    @Override
    public void getInfo() {
        System.out.println("姓名："+getName()+ "\t"+"年薪："+(getSalary()*12+bonus));
    }
}
