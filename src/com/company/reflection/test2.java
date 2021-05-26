package com.company.reflection;

/**
 * @Author: Yaolong
 * @Date: 2021/7/28 14:24
 * @Pagename: com.company.reflection
 * @ProjectName: java复习
 * @Describe:
 **/
public class test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO: 2021/7/28  1.Class也是一个类，继承object


        // TODO: 2021/7/28 Class类对象不是new出来的。而是系统创建的

            // 传统new 对象


            Cat cat = new Cat();


        Class cls = Class.forName("com.company.reflection.Cat");

        // TODO: 2021/7/28 对于某个类的Class类对象，在内存中只有一份，因为类只加载一次

        // TODO: 2021/7/28 每个类的实例都会记得自己是由那个Class实例所生成。 

        // TODO: 2021/7/28 通过Class可以完整的记得得到一个类的完整结构，通过一系列的api 

        // TODO: 2021/7/28 Class对象是存放在堆中 
        // TODO: 2021/7/28 类的字节码二进制数据，是放在方法区的，有的地方称为类的元数据 

    }


}
