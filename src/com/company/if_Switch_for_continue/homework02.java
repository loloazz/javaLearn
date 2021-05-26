package com.company.if_Switch_for_continue;
/*
* 判断一个整数是不是水仙花数。153=1*1*1+3*3*3+5*5*5；
* 153就是水仙花数！
* */
public class homework02 {
    public static void main(String[] args) {
        int num=10000;
        int a = 0,b,c,i ;
        for (i = 100; i<num; i++) {
            a = (i / 100);
            b = i / 10 % 10;
            c = i % 10;
            if (i == a * a * a + b * b * b + c * c * c) {
                System.out.println("是水仙花数：" + i);

            }
        }
    }
}
