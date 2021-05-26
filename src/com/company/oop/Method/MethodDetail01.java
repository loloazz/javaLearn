package com.company.oop.Method;

public class MethodDetail01 {
    public static void main(String[] args) {
        int a =20;//这个就是实参！！！！
        int b=40;//这个也是实参！！！！
        Swap swap = new Swap();
        swap.swap(a,b);//括号里面的也是形参！
        System.out.println("main方法中的"+"a="+a+", "+"b="+" "+b);
    }

}
class  Swap{

    public void swap(int a ,int b){//括号里面的就是形参了
        int tmp =a;////这个也是型参！！！！
        a=b;
        b=tmp;
        System.out.println("Swap方法中的"+"a="+a+", "+"b="+" "+b);
    }
}