package com.company.Exception;

import java.util.Scanner;

/**
 * @ClassName: try_catchtest
 * @Author: YL
 * @Date: 2021/4/19 08:30
 * @Description: TODO
 */
public class try_catchtest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("请输入一个整数：");
            String next = scanner.next();
            try {
                int i = new Integer(next).intValue();
                // int   i = Integer.parseInt(next);
                break;
            } catch (NumberFormatException e) {
                System.out.println("你的输入不合法，请重新输入整数:" + e.getMessage());
            }

        }

    }

}
