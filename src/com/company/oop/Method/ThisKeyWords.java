package com.company.oop.Method;

public class ThisKeyWords {
    public static void main(String[] args) {
        Dog dog = new Dog("lala",3);
        dog.info();
        }
    }

class Dog{
    String name;
    int age;

    //当没有this关键字的时候，就出现了一个问题。
    //根据变量的作用域的原则。
    // 构造器的name是局部变量，不是属性，构造器的age也是一样的。
    // 根据就近原则。发现name ，age，还是原来的默认值。

    public Dog(String name, int age) {
        name = name;
        age = age;
    }


    public void info(){//成员方法，输出属性信息

        System.out.println(name+"\t"+age+"\t");
    }

    //    public Dog(String dName,int  dAge){
//        name = dName;
//        age=dAge;
//    }



//    public Dog(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
}