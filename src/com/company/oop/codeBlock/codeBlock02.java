package com.company.oop.codeBlock;

public class codeBlock02 {
    public static void main(String[] args) {
        A a = new A();

    }
}

class A {

    private  int n2 = getN2();
    public int getN2(){
        System.out.println("getN2被调用了");


        return 1000;
    }

    {
        System.out.println("A类的普通代码块被调用了");


    }


    private static int n1 = getN1();
    public static int getN1() {
        System.out.println("getN1 调用");
        return 100;

    }

    static {
        System.out.println("A的静态代码块");
    }



    public  A(){
        System.out.println("A的构造器被调用了");
    }
}