package com.company.if_Switch_for_continue;
/*
* 某人有100，000元，没经过一个路口，需要交费规则如下：
* 计算该人可以经过几次路口；要求用while break 方式完成！
*
* */
public class homework01 {
    public static void main(String[] args) {
        double balance = 100000.0D;
        int times=0;
        while (balance>=1000) {
            if (balance > 50000) {
                balance = balance * (1 - 0.05);
                times++;
            }
            if (balance <= 50000) {
                balance = balance - 1000;
                times++;
            }
            if (balance<=0){
                break;
            }
        }
        System.out.println("这是第"+times+"次");
    }
}
