package com.company.oop.OverLoad;

public class Overload01 {
    public static void main(String[] args) {

        myCalculator myCalculator = new myCalculator();
        System.out.println(myCalculator.calculate(1,2));
        System.out.println(myCalculator.calculate(1.1,2));
        System.out.println(myCalculator.calculate(1,2,1));


    }
}

class myCalculator{
    public int calculate(int n1,int n2){
        return n1+n2;
    }
    public double calculate(int n1,double n2){
        return n1+n2;
    }
    public double calculate(double n1,int n2){
        return n1+n2;
    }
    public int calculate(int n1,int n2,int n3){
        return n1 +n2+n3;

    }
}
