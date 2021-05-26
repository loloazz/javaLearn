package com.company.ArraryDemo;
/*
* 数组是引用类型！也是一种数据类型！！！！
* 数组就是一组数据！一组同一类型的数据。就是数组
*
* */
public class Arrary01 {
    public static void main(String[] args) {
        double[] hens={3,5,1,3.4,2,50};//double [] 表示double 类型的数组！//静态初始化
        // double[] 就是double数组的关键字！ double（中间可以有空格但不影响）[]
        for(int i=0;i<6;i++){
            double hen = hens[i];
            System.out.println(hen);

        }
    }

}
