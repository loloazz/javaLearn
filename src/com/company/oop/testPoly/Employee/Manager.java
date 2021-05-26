package com.company.oop.testPoly.Employee;

public class Manager extends Employee {
    private  double bonus;

    public Manager(String name, double monthSalary, double bonus) {
        super(name, monthSalary);
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("我是管理者！"+getName());
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }

}
