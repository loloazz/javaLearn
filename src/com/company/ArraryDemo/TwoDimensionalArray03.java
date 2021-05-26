package com.company.ArraryDemo;
/*
* 动态的创建下面的二维数组，并输出
* i = 0 :  1
* i = 1 :  2    2
* i = 2 :  3    3    3
*
*
*
* */
public class TwoDimensionalArray03 {

    public static void main(String[] args) {
        int [][] arr =new int[3][];//创建一个二维数组
        for (int i = 0; i < arr.length; i++) {//遍历arr每一个数组
           //给每个一维数组开辟空间！
            //如果没有给一维数组 new 那么arr[i] 就是null！！！！
            arr[i]=new int[i+1];

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=i+1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");

            }
            System.out.println();
        }
    }
}
