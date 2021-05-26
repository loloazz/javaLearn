package com.company.if_Switch_for_continue;

import java.util.Scanner;

public class if04 {

    public static void main(String[] args) {

        int ticks=60;
        System.out.println("请输入是否为淡旺季：淡季：danji，旺季：wangji");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if (next.equals("danji")){
            System.out.println("请输入年龄：");
            Scanner scanner2 = new Scanner(System.in);
            int next1 = scanner2.nextInt();
            if (next1>=18 && next1<60){
                System.out.println("票价为:"+40);
            }else {
                System.out.println("票价为:"+"20");
            }

        }else if (next.equals("wangji")){
            System.out.println("请输入年龄：");
            Scanner scanner3 = new Scanner(System.in);
            int next3 = scanner3.nextInt();
            if (next3>=0&&next3<18){
                System.out.println("票价为:"+ticks/2);
            }else if (next3>=18&&next3<=60){
                System.out.println("票价为："+ticks);
            }else {

                System.out.println("票价为："+(int)(ticks/3));
            }
        }


    }


}
