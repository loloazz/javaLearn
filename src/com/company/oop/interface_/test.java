package com.company.oop.interface_;

public class test {

    public static void main(String[] args) {
        System.out.println(ia.i);//这是就证明他是静态的。  直接用接口名去调用属性。
        //ia.i=100;
    }

}
interface  ia{
    int i = 10;

}

