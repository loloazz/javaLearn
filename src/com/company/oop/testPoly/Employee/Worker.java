package com.company.oop.testPoly.Employee;

public class Worker extends Employee{
    public Worker(String name, double monthSalary) {
        super(name, monthSalary);
    }
    public  void work(){
        System.out.println("我是打工人!"+getName());

    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
