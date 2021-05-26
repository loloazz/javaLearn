package com.company.BigNUM;

import java.math.BigInteger;

/**
 * @ClassName: BigNumber
 * @Author: YL
 * @Date: 2021/4/22 17:12
 * @Description: TODO
 */
public class BigNumber {
    public static void main(String[] args) {

        BigInteger bigInteger1 = new BigInteger("111111111111111111111111111111111");


        BigInteger bigInteger = new BigInteger("44444444444444444444444444444444444");
        // + 注意在加的时候  add方法中的参数类型也是  BigInteger类型。
        BigInteger add = bigInteger.add(bigInteger1);
        BigInteger add1 = bigInteger.add(BigInteger.valueOf(Long.parseLong("1111111111")));

        // -  subtract 跟上一个add使用方法一样
        BigInteger subtract = bigInteger.subtract(bigInteger1);

        // *   multiply 同上
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        // / divide
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);

    }
}
