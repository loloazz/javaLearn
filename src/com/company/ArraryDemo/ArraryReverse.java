package com.company.ArraryDemo;

import java.util.Arrays;

/*
* 把数组的元素内容反转，
* arr {11,22,33,44,55,66}--->{66,55,44,33,22,11}
*
*
* */
public class ArraryReverse {
    public static void main(String[] args) {
        int []arr={11,22,33,44,55,66};
        int []arr2=new int[arr.length];
        int j,i;
        for (j = 0, i =arr.length-1; i >= 0; i--,j++) {
            arr2[j]=arr[i];

        }
        System.out.println(arr);
        System.out.println(arr2);
        for (int k = 0; k < arr2.length; k++) {
            System.out.println(arr2[k]);
        }
    }

}
