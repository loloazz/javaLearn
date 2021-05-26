package com.company.if_Switch_for_continue;

import java.util.Scanner;

public class if01 {
    public static void main(String[] args) {
        System.out.println("plese input age:");

        Scanner scanner = new Scanner(System.in);
         int age=scanner.nextInt();


        if (age>=18){
            System.out.println("满十八岁！有问题！");
        }

    }



}
