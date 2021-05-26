package com.company.oop.testPoly.Employee;

public class Employee {
    private  String name;
    private  double MonthSalary;

    public Employee(String name, double monthSalary) {
        this.name = name;
        MonthSalary = monthSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthSalary() {
        return MonthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        MonthSalary = monthSalary;
    }

    public double getAnnual(){
        return MonthSalary*12;
    }


}
