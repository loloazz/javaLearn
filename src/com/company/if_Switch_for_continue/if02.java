package com.company.if_Switch_for_continue;

import java.util.Scanner;

public class if02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plese input age");
        int age = scanner.nextInt();

        if (age>=18){
            System.out.println("满十八岁！有问题！");
        }else {
            System.out.println("没毛病！");
        }


    }
}
