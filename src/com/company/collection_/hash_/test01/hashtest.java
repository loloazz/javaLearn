package com.company.collection_.hash_.test01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @ClassName: hashtest
 * @Author: YL
 * @Date: 2021/4/28 22:04
 * @Description: TODO
 */
public class hashtest {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee("lala",20));
        employees.add(new Employee("gangan",22));
        employees.add(new Employee("lala",23));
        employees.add(new Employee("lala",20));

        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}


class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
