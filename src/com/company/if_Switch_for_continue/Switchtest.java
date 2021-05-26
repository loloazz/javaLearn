package com.company.if_Switch_for_continue;

import java.util.Scanner;

public class Switchtest {
    public static void main(String[] args) {
        System.out.println("请输入你要转换的字符：");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        switch (next){
            case "a":
                System.out.println("a转成大写:"+(char)('a'-32));
                break;
            case "b":
                System.out.println("b转成大写:"+(char)('b'-32));
                break;
            case "c":
                System.out.println("c转成大写:"+(char)('c'-32));
                break;
            case "d":
                System.out.println("d转成大写:"+(char)('d'-32));
                break;
            case "e":
                System.out.println("e转成大写:"+(char)('e'-32));
                break;
            default:
                System.out.println("other");
        }
    }



}
