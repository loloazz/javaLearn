package com.company.oop.Method;

public class Method01 {
    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.speak();
        persion.cal01();
        persion.cal02(20);
        int returnRes =persion.sum(4,6);
        System.out.println("sum::"+returnRes);
    }
}
class Persion{
    String name;
    int age;
    //成员方法；
    public void speak(){
        System.out.println("我是好人！");
    }

    public void cal01(){
        int res =0;
        for (int i = 1; i <= 1000; i++) {
            res+=i;
        }
        System.out.println("结果为："+res);
    }

    public void cal02(int n){
        int res =0;
        for (int i=1;i<=n;i++){
            res +=i;

        }
        System.out.println("calo2:"+res);

    }
    public int sum(int num1,int num2){
        int res =num1+num2;
        return res;
    }

}
