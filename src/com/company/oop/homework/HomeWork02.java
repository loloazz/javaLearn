package com.company.oop.homework;

public class HomeWork02 {
    public static void main(String[] args) {
        int []a={1,2,4,6,8,3};
        A02 a02 = new A02();
        System.out.println( a02.find(a,10));
    }
}
class  A02{
    public int find(int []a,int num){
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] == num) {
                return i+1;
            }
        }
        return -1;
    }


}