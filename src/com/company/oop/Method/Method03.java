package com.company.oop.Method;

public class Method03 {
    public static void main(String[] args) {
        AA aa = new AA();
        int[] arr = aa.getArr(4, 5);

        System.out.println(arr);
        System.out.println(arr[0]+"   "+arr[1]);
    }
}

class AA{
    public int [] getArr(int num1,int num2){
        int[] ints = new int[2];
        ints[0]=num1+num2;
        ints[1]=num2-num1;


        return ints;


    }


}
