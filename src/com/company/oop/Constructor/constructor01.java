package com.company.oop.Constructor;

public class constructor01 {

    public static void main(String[] args) {
        Person person = new Person();

    }
}


class  Person{
    int age;
    String name;

    //这个无参构造。
    public Person(){
        System.out.println("这是无参构造！");


    }

    //这个是有参构造。
    public Person(int pAge){
        age=pAge;

    }
    public Person(String pname,int pAge){
        name =pname;
        age=pAge;

    }

}