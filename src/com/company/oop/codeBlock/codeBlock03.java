package com.company.oop.codeBlock;

public class codeBlock03 {
    public static void main(String[] args) {
        new BB();
    }
}
class  AA{

    static {
        System.out.println("AA的静态代码块");
    }


    {

        System.out.println("AA的普通代码块");
    }
    public AA(){
        System.out.println("AA（）父类构造器被调用");
    }


}
class BB extends AA{
static {
    System.out.println("BB的静态代码块");
}
    {

        System.out.println("BB的普通代码块被调用！");

    }
    public BB(){

        //super()
        System.out.println("BB（）子类构造器被调用");

    }

}