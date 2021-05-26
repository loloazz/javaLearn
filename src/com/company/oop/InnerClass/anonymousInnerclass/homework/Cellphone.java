package com.company.oop.InnerClass.anonymousInnerclass.homework;


public class Cellphone {
    public void testWork(Cell cell, double n1, double n2) {
        System.out.println(cell.work(n1, n2));
    }

    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Cell() {
            @Override
            public double work(double n1, double n2) {
                return (int) (n1 + n2);
            }
        }, 10, 8);

    }
}

interface Cell {
    double work(double n1, double n2);
}