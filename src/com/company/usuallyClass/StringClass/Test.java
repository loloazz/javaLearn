package com.company.usuallyClass.StringClass;

class A{
    static{
        System.out.print("a");
    }
    public A (){
        System.out.print("x");
    }
}
class B extends A{
    static{System.out.print("b");}
    public B (){
        System.out.print("y");
    }
}
public class Test{
    public static void main(String[] args){
        A ab = new B ();
        ab = new B ();
    }
}
