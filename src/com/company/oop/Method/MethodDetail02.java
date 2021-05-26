package com.company.oop.Method;

public class MethodDetail02 {
    public static void main(String[] args) {
        A a = new A();
        int [] arr ={1,2,3};
        a.test(arr);
        System.out.println("main方法的 arr数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
        System.out.println();
    }

}
class A{

    public void test(int [] arr){
        arr[0] =100;
        System.out.println("test的arr数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }


    }

}
