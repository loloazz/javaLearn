package com.company.oop.resursion;

public class FibonacciSequence {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.Fibonacci(20));
    }

}
class A{
    public int Fibonacci(int n){
        if(n==1||n==2){
            return 1;
        }else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

}