package com.company.oop.singleMode;

public class singleTon01 {
    public static void main(String[] args) {

         wife wife1=wife.getwife();
        System.out.println(wife1);

        wife wife2=wife.getwife();
        System.out.println(wife2);

    }
}
class wife{
    private String name;
    private int age;


     static wife  qz = new wife("小苍",30);//保证只有一个妻子

    private  wife(String name, int age) {//创造妻子的方法必须私有！
        this.name = name;
        this.age = age;
    }

    public static wife getwife(){//当方法想要使用静态属性的时候，那么方法也要是静态的

     return qz;
    }

    @Override
    public String toString() {//重写toString方法
        return "wife{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}