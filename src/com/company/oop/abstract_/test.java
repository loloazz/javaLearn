package com.company.oop.abstract_;

public class test {
    public static void main(String[] args) {
        CommonEmployee sss = new CommonEmployee("sss", 182, 5000);
        Mannager aaa = new Mannager("aaa", 2000, 52520, 630);
        sss.work();
        aaa.work();


    }

}

abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}

class CommonEmployee extends Employee {


    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getClass() + " " + super.getName() + "工作中");
    }
}

class Mannager extends Employee {
    private double bonus;

    public Mannager(String name, int id, double salary, double bonus) {
        super(name, id, salary);

        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println(getClass()+" "+super.getName()+"工作中"+","+"  年终奖 "+getBonus());
    }
}