package com.company.oop.Method;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("李华",20);
//        p.compareTo("李华",20);
        Person p1 = new Person("李华",20);
        p.compareTo(p1);

    }


}

class Person{
    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void compareTo(Person p){
        if (this.age==p.age&&this.name.equals(p.name))
        {

            System.out.println("同一个人");
        }else
        {

            System.out.println("不是同一个人！");
        }

    }

    public void compareTo (String name ,int age){
        if (this.age==age&&this.name.equals(name))
        {

            System.out.println("同一个人");
        }else
        {

            System.out.println("不是同一个人！");
        }


    }


}