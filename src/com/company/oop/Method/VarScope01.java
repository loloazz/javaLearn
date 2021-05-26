package com.company.oop.Method;

public class VarScope01 {
    public static void main(String[] args) {
        cat cat = new cat();
        cat.eat();
    }
}


class cat{
    int age =20;
    String color="yellow";
    public void eat(){

        System.out.println("我的年龄是"+age);
        System.out.println("我的颜色是"+color);
    }
}