package com.company.oop.homework;

public class HomeWork04 {
    public static void main(String[] args) {
        A03 a03 = new A03();
        int []arr={11,22,33,44,55,66};
        int i = arr.hashCode();
        System.out.println(i);
        System.out.println( a03.copyArr(arr).hashCode());

    }
}
class A03{
    public int [] copyArr(int []a){
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i]=a[i];
        }
        return arr;
    }

}