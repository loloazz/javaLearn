package com.company.oop.BigHomework.homework03;

public class worker extends employee {
    public worker(String name, double salary, int days) {
        super(name, salary, days);
    }

    @Override
    public void info() {
        System.out.println("员工的工资"+getSalary()*getDays());
    }
}
