package com.company.oop.InnerClass;

public class LocalInnerClass {  //其他外部类
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.say();
    }
}

class Outer{    //外部类
    private int n1 = 1000;

    public void say(){
      /*2.不能增加修饰符，因为他的地位就是一个局部变量，局部变量不能用修饰符，
        但可以用final修饰，代表他不能被继承  其本质还是个类（可以继承，或者被继承）*/
        class Inner {  //方法中的内部类   局部内部类  相当于一个局部变量。
            private  int n2 = 100;
            //3. 作用域：1.仅在定义他的方法中
            public void say02(){   //局部内部类的方法  局部内部类say02()
                System.out.println("Outer n1="+n1);//1. 可以直接访问外部类的所有成员，包含私有的属性
                System.out.println("Inner n2 ="+n2);// 访问内部类的自己的属性
            }
        }
        //4.外部类在方法中可以创建Inner对象，然后调用方法   注意了哈：我是在say（）方法中创建的对象。在方法外就不可以了。
        new Inner().say02();
    }




    {//3. 作用域 ：2.在代码块中
        class inner02{

        }

    }
}
