package com.company.if_Switch_for_continue;

import java.util.Scanner;

public class Switchtest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份!:");
        int i = scanner.nextInt();
        if (i <= 12 && i >= 1) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                    System.out.println("这是春季！");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("这是夏季！");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("这是秋季！");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("这是冬季！");
                    break;

            }

        } else {
            System.out.println("月份输入有错！");


        }


    }
}