package com.company.ArraryDemo;

import java.util.Scanner;

public class Arrary03 {
    public static void main(String[] args) {
        int  i1 [] ;//声明数组 还没有分配空间！当执行new的时候才分配空间
        //动态初始化
        i1 = new int [5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"的元素值");
            i1[i] =  scanner.nextInt();
            System.out.println("值为："+i1[i]);
        }


    }


}
