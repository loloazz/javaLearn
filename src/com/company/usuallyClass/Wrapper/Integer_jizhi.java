package com.company.usuallyClass.Wrapper;

/**
 * @ClassName: Integer_jizhi
 * @Author: YL
 * @Date: 2021/4/19 17:13
 * @Description: TODO
 */
public class Integer_jizhi {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i==j); //返回的是false 因为是创建了不同的对象。 == 使用方法，有之前的帖子有说明。



        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//返回的true；



        Integer x = 128;
        Integer y = 128;

        System.out.println(x ==y);//返回false


    }
}
