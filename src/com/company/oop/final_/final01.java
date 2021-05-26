package com.company.oop.final_;

public class final01 {
    public static void main(String[] args) {
        System.out.println(final_static.i);

    }
}
class  final_static{
    public  static  double i = 10000.0;
    static {

        System.out.println("静态代码块！");
    }


}