package com.company.oop.InnerClass.anonymousInnerclass;

public class anonymousInnerClass {// 外部其他类
    public static void main(String[] args) {
        Out04 out04 = new Out04();
        out04.method();
    }
}

class Out04{//外部类

    private int n1 = 10;
    public void method(){
        // 基于接口的匿名内部类
        // 1. 需求: 想使用 IA 接口 ，并创建对象
        //2. 传统方式：写一个类，实现该接口，并创建对象
        IA cat = new Cat();//向下转型
        cat.cry();
        //需求 Cat类只用一次，后面不在使用
        //可以使用 匿名内部类
        //cat1的编译类型  IA
        //cat1的运行类型  匿名内部类。如何打印出类名呢。getClass（）就可以
        //在jdk底层在创建匿名内部类Outer04$1 就立马创建了Outer04$1 并且把地址返回给cat1
        //匿名内部类使用一次，就不能在使用了.
         IA cat1 = new IA() {
            @Override
            public void cry() {
                System.out.println("小猫喵喵叫~");

            }
        };
        System.out.println(cat1.getClass());//得到他的类名  cat1.getClass()  匿名内部类的类名：Out04$1
         cat1.cry();

         /*
         *  前面的就相当于
         * class Out04$1  implements IA{
         * @Override
         * public void cry() {
         *      System.out.println("小猫喵喵叫~");
         *
         *  }
         *
         * }
         *
         * */

        //基于类的匿名内部类

        //father 的编译类型 Father
        //father 的运行类型  是匿名内部类 Outer$02 //注意有大括号  {}
        Father father = new Father("jack") {

        };

    }
}


interface IA{// 接口
    void cry();

}

class Cat implements IA{

    @Override
    public void cry() {
        System.out.println("喵喵叫~");
    }
}

class Father{
    public Father(String name){
        super();
    }
    public void test(){

    }
}