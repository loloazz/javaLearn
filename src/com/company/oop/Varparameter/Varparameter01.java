package com.company.oop.Varparameter;

public class Varparameter01 {
    public static void main(String[] args) {
    int [] arr ={1,2,3};
        T t = new T();
        t.f1(arr);
    }
}
class T{
    public void f1(int... nums){

        System.out.println("长度="+nums.length);
    }
//
//    public void f2(double... nums,String str){
//
//    }
//
//
//    public void f2(String str,double... nums){
//
//    }
//
//    void f3(int... num4,int...nub){
//
//
//    }
}