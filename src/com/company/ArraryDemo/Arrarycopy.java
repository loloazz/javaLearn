package com.company.ArraryDemo;
/*
* 将int []arr1={10,20,30};拷贝到arr2数组，要求数据空间独立！
* */
public class Arrarycopy {
    public static void main(String[] args) {
        int []arr1={10,20,30};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];

        }
        for (int i : arr1) {
            System.out.println(i);
        }
    }
}
