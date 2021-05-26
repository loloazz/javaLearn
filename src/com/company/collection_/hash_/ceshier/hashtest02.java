package com.company.collection_.hash_.ceshier;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @ClassName: hashtest02
 * @Author: YL
 * @Date: 2021/4/28 22:29
 * @Description: TODO
 */
public class hashtest02 {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee("lala",522,new MyDate(2021,12,30)));
        employees.add(new Employee("4ala",22,new MyDate(2021,12,30)));
        employees.add(new Employee("l2la",22,new MyDate(2021,12,30)));
        employees.add(new Employee("lala",522,new MyDate(2021,12,30)));
        employees.add(new Employee("lala",522,new MyDate(2021,12,31)));

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee next =  iterator.next();
            System.out.println(next);
        }
    }


}

class Employee{

    private String name;
    private int sal;
    private  MyDate myDate;

    public Employee(String name, int sal,MyDate myDate) {
        this.name = name;
        this.sal = sal;
        this.myDate=myDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(myDate, employee.myDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, myDate);
    }

    @Override
    public String toString() {
        return name + ' ' +
                " " + sal +
                " " + myDate ;
    }
}


 class MyDate{
    public  int year;
    public  int month;
    public  int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year +"-" + month +"-" + day ;
    }

     @Override
     public boolean equals(Object o) {
         MyDate myDate = (MyDate) o;
         return year == myDate.year && month == myDate.month && day == myDate.day;
     }

     @Override
     public int hashCode() {
         return Objects.hash(year, month, day);
     }
 }
