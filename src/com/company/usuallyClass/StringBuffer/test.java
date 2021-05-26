package com.company.usuallyClass.StringBuffer;

import java.util.Scanner;

/**
 * @ClassName: test
 * @Author: YL
 * @Date: 2021/4/21 23:49
 * @Description: TODO
 */
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        StringBuffer sb = new StringBuffer(next);

        for (int i = sb.indexOf(".")-3;i>0 ; i-=3) {
             sb = sb.insert(i, ",");
        }

        System.out.println(sb);

        }
////
//
//        System.out.println(stringBuffer);
    }

