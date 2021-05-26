package com.company.ArraryDemo;

import java.util.Scanner;

public class Arrary02 {


    public static void main(String[] args) {
        double [] scores=new double[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"的元素值");
            scores[i] = scanner.nextDouble();
            System.out.println("值为："+scores[i]);
        }
    }
}
