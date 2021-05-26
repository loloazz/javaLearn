package com.company.ArraryDemo;

import java.util.Scanner;

public class ArrayAdd02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        Scanner a = new Scanner(System.in);

        while (true) {
            System.out.println("请输入y/其他符选择是否接着输入");
            if (a.next().equals("y")) {

                int[] arrNew = new int[arr.length + 1];
                for (int i = 0; i < arr.length; i++) {
                    arrNew[i] = arr[i];
                }
                System.out.println("请输入新的数字：");
                arrNew[arrNew.length - 1] = a.nextInt();
                arr = arrNew;
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
            } else {
                break;
            }
        }

    }
}
