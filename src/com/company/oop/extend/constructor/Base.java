package com.company.oop.extend.constructor;

public class Base {
   public Base(){
       System.out.println("我是基类构造器！我被调用了！");

   }
}

class child  extends Base{
    public child(){
        super();

        System.out.println("我是子类构造器，我被调用了~");
    }

}
class test{

    public static void main(String[] args) {
        child child = new child();

    }

}
