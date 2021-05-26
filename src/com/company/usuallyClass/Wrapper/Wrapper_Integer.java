package com.company.usuallyClass.Wrapper;

/**
 * @ClassName: Wrapper_Boolean
 * @Author: YL
 * @Date: 2021/4/19 15:18
 * @Description: TODO
 */
public class Wrapper_Integer {
    public static void main(String[] args) {

        //基本数据类型
        int i= 10;

        //手动装箱 方式1：创建一个Integer对象，在将基本数据类型的变量名写进去。
        Integer i1 = new Integer(i);

        //手动装箱 方式2：直接调用Integer的静态方法valueOf()参数为变量名
        // 当然：也可以把都是为数字的字符串给传进去;
        Integer i2=Integer.valueOf(i);

        //手动拆箱：
        //调用intValue()方法
        int j1 = i1.intValue();


        //自动装箱
        int n2 =200;
        Integer integer1 = n2;//底层使用的仍然是调用Integer.valueOf(n2);

        //自动拆箱
        int n3 = integer1;//底层使用的是intValue()方法。
    }
}
