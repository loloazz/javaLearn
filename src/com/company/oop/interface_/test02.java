package com.company.oop.interface_;

public class test02 {

    public static void main(String[] args) {
        new C().PX();
    }
}

interface A{

    int  x= 0;

}
class B{
    int x = 1;

}

class C extends B implements A{
    public void PX(){
//        System.out.println(x);//x报错了。不清楚这是那个x，是接口A的，还是父类B的呢。
        System.out.println("父类的"+super.x+"， 接口的"+A.x);
    }

}