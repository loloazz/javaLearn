package com.company.BigNUM;

import java.math.BigDecimal;

/**
 * @ClassName: BigDecimal
 * @Author: YL
 * @Date: 2021/4/22 18:04
 * @Description: TODO
 */
public class BigDecimal_ {
    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal(1.365655845454454454848484848484);
        BigDecimal bigDecimal1 = new BigDecimal("1.1111111111111111111111111111111111");

        System.out.println(bigDecimal);
        BigDecimal add = bigDecimal.add(bigDecimal1);

        System.out.println(add);

        BigDecimal divide = bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING);
        System.out.println(divide);


    }

}
