package com.company.reflection;

/**
 * @Author: Yaolong
 * @Date: 2021/7/28 15:17
 * @Pagename: com.company.reflection
 * @ProjectName: java复习
 * @Describe:
 **/
public class Car {

    public String brand="BMW";//品牌
    public int price=5000;
    public String color="白色";


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
