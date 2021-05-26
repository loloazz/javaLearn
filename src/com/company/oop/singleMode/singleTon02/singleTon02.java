package com.company.oop.singleMode.singleTon02;

public class singleTon02 {
    public static void main(String[] args) {

        wife xiaocang =wife.getWf("小仓") ;

        System.out.println(xiaocang.toString());
        wife dachang =wife.getWf("大厂") ;
        System.out.println(dachang.toString());

    }
}
class wife{

private int age;
private String name;
private static  wife wf;

    private  wife(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static wife getWf(String name){
        if (wf == null) {
            wf =new wife(name);
        }
        return wf;
    }

    @Override
    public String toString() {
        return "wife{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}