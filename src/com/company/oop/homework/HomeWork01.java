package com.company.oop.homework;

public class HomeWork01 {
    public static void main(String[] args) {
        A01 a01 = new A01();
        int []a={1,2,4,6,8,3};

        System.out.println(a01.max(a));
    }
}
class A01{
    public int   max(int [] a){
        int max;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]>a[i+1]){
                int tmp =a[i];
                a[i]=a[i+1];
                a[i+1]=tmp;
            }
        }
        max =a[a.length-1];
        return max;

    }


}