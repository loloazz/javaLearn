package com.company.oop.codeBlock.homeWork01;

/**
 * @ClassName: vvv
 * @Author: YL
 * @Date: 2021/4/21 23:26
 * @Description: TODO
 */
public class Demo01 {
    public static void main(String[] args) {
        new B();
    }
}
class A {

    static{
        System.out.println("A的static代码块...");
    }

    public String s1 = prtString("A的成员变量...");
    public static String s2 = prtString("A的static变量...");

    public A(){
        System.out.println("A的构造函数...");
    }

    public static String prtString(String str) {
        System.out.println(str);
        return null;
    }
}
class B extends A{
    public String ss1 = prtString("B的成员变量...");
    public static String ss2 = prtString("B的static变量...");
    public B(){
        System.out.println("B的构造函数...");
    }
    private static A a = new A();
    static{
        System.out.println("B的static代码块...");
    }
    {
        System.out.println("代码块...");
    }
}
