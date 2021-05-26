package com.company.if_Switch_for_continue;

import java.util.Scanner;

public class for07 {
    public static void main(String[] args) {
        System.out.println("请输入打印的层数：");
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();


        for (int i = 1; i <= i1; i++) {
            for (int k = 1; k <= i1 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i1) - 1; j++) {
                if (  j == 1||j == (2 * i) - 1||i==i1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}