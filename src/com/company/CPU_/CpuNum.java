package com.company.CPU_;

/**
 * @ClassName: CpuNum
 * @Author: YL
 * @Date: 2021/5/3 19:02
 * @Description: TODO
 */
public class CpuNum {
    public static void main(String[] args) {
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);
    }
}
