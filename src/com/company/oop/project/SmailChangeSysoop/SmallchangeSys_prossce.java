package com.company.oop.project.SmailChangeSysoop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallchangeSys_prossce {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        SimpleDateFormat  sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");

        double money = 0d;
        double balance = 0d;
        Date date = null;
        String detail = "";
        String note ="";

        do {
            System.out.println("=======零钱通菜单======");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入帐");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退   出");
            System.out.print("请输入选择（1-4）：");
             key = scanner.next();
             switch (key) {
                 case "1":
                     System.out.println(" -----零钱通明细----");
                     System.out.println(detail);
                     break;
                 case "2":
                     System.out.println("----收益入帐金额----");
                     System.out.print("请输入收益入帐金额：");
                     money = scanner.nextDouble();
                     if (money<=0){
                         System.out.println("输入金额有误！");
                     }else {
                         balance += money;
                         date = new Date();
                         detail += "收益入账"+"\t" +"+"+money+"\t"+sdf.format(date)+"\t" +"余额："+balance+"\n";
                     }


                    // System.out.println(sdf.format(date));
                     break;
                 case "3":
                     System.out.println("----3 消费-----");
                     System.out.print("消费项目：");
                     note = scanner.next();
                     System.out.print("消费了多少钱：");
                     money = scanner.nextDouble();
                     if (money>balance){
                         System.out.println("消费大于了余额");
                     }else {
                         balance = balance-money;
                         date = new Date();
                         detail += note+"\t" +"-"+money+"\t"+sdf.format(date)+"\t" +"余额："+balance+"\n";
                     }


                     break;
                 case "4":
                     System.out.println("4 退   出");
                     loop = false;
                     break;
                 default:
                     System.out.println("选择有误，重新选择！");

             }

        }while (loop);

    }

}
