package com.company.Generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @ClassName: test02
 * @Author: YL
 * @Date: 2021/5/2 20:27
 * @Description: TODO
 */
public class test02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("啦啦", 5000, new MyDate(2021, 12, 01)));
        employees.add(new Employee("啦e", 5002, new MyDate(2021, 12, 02)));
        employees.add(new Employee("啦啦2", 5020, new MyDate(2021, 12, 03)));
        employees.add(new Employee("啦啦1", 5050, new MyDate(2021, 12, 25)));
        employees.add(new Employee("啦啦3", 50400, new MyDate(2021, 12, 18)));
        employees.add(new Employee("啦啦1", 5050, new MyDate(2021, 12, 30)));
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName() == o2.getName()) {
                    if (o1.getDate().getYear() != o2.getDate().getYear()) {
                        return o1.getDate().getYear() - o2.getDate().getYear();
                    }
                    if (o1.getDate().getMonth() != o2.getDate().getMonth()) {
                        return o1.getDate().getMonth() - o2.getDate().getMonth();
                    }
                    if (o1.getDate().getDay() != o2.getDate().getDay()) {
                        return o1.getDate().getDay() - o2.getDate().getDay();
                    }

                } else {
                    return o1.getName().compareTo(o2.getName());
                }
                return 0;
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}

class Employee {

    private String name;
    private double sal;
    private MyDate date;

    public Employee(String name, double sal, MyDate date) {
        this.name = name;
        this.sal = sal;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  name + ' ' +
                " sal  " + sal + "出生日期"+ date ;

    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + " " + month + " " + day;

    }
}